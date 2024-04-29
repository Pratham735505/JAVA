import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ClientUI extends JFrame {
    private JTextArea chatArea;
    private JTextField messageField;
    private PrintWriter serverOutput;

    public ClientUI() {
        setTitle("Chat Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Components
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        messageField = new JTextField();
         JButton sendButton = new JButton("Send");

        // Layout
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(messageField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);
        add(bottomPanel, BorderLayout.SOUTH);

        // Event listeners
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
        messageField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        // Server connection
        try {
            Socket socket = new Socket("192.168.195.29", 12345); // Replace "localhost" with server IP address if it's on a different machine
            serverOutput = new PrintWriter(socket.getOutputStream(), true);

            // Thread for receiving messages from server
            new Thread(() -> {
                try {
                    BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    String serverMessage;
                    while ((serverMessage = serverInput.readLine()) != null) {
                        chatArea.append("Server: " + serverMessage + "\n");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }).start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void sendMessage() {
        String message = messageField.getText();
        if (!message.isEmpty()) {
            serverOutput.println(message);
            chatArea.append("You: " + message + "\n");
            messageField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ClientUI().setVisible(true);
            }
        });
    }
}