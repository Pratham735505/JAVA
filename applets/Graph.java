import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/* <applet code = "Graph" width = 800 height = 800 > </applet> */
public class Graph extends Applet implements Runnable, ActionListener {
   // int x = 0;
    Thread t;
    TextField t1,t2,t3,t4;
    Button b;
    public void init() {
        t1 = new TextField();
	add(t1);
	t2 = new TextField();
	add(t2);
	t3 = new TextField();
	add(t3);
	t4 = new TextField();
	add(t4);
	b= new Button("Draw");
	add(b);
	b.addActionListener(this);
	
    }

    public void run() {
        try {
            while (true) {
                repaint();
                Thread.sleep(100);  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	int x,x2,x3,x4;
    public void paint(Graphics g) {
        Dimension d = getSize();
        g.setColor(Color.RED); // Set background color
        g.fillRect(0, 0, d.width, d.height);

        g.setColor(Color.BLACK); // Set the color for the oval
        g.fillOval(x, x2,x3,x4);
        x += 5;
        if (x + 50 > d.width) {
            x = 0;
        }
    }


     public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==b){
		x=Integer.parseInt(t1.getText());
		x2=Integer.parseInt(t1.getText());
		x3=Integer.parseInt(t1.getText());
		x4=Integer.parseInt(t1.getText());
		t = new Thread(this);
        	t.start();
	}


     }
}