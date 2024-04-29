import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;

public class Server extends JFrame {
    private JTextArea chatArea;
    private JTextField messageField;
    private PrintWriter clientOutput;

    public Server() {
        setTitle("Chat Server");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);

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
        sendButton.addActionListener(e -> sendMessage());
        messageField.addActionListener(e -> sendMessage());

        // Server socket initialization
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Choose any port you like
            System.out.println("Server started. Waiting for clients...");

            // Accept client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket);

            // Create input and output streams for client communication
            BufferedReader clientInput = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            clientOutput = new PrintWriter(clientSocket.getOutputStream(), true);

            // Thread for receiving messages from client
            new Thread(() -> {
                String clientMessage;
                try {
                    while ((clientMessage = clientInput.readLine()) != null) {
                        chatArea.append("Client: " + clientMessage + "\n");
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
            chatArea.append("You: " + message + "\n");
            clientOutput.println(message);
            messageField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Server().setVisible(true));
    }
}
