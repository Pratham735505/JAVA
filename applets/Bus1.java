import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Bus1" height=1920 width=1920></applet>*/


public class Bus1 extends Applet implements Runnable, ActionListener{
 	int x=0;
	Button b1,b2;
	Thread t;
	int f=0;
	public void init() {
        t = new Thread(this);
	b1= new Button("start");
	b2= new Button("stop");
	add(b1);
	add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
        //t.start();
    }
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1){
			if(f==0){ t.start(); f=1;}
			else t.resume();
		}
		if(ae.getSource()==b2){
			if(f==1) t.suspend(); 
		}	
	}

	public void paint(Graphics g){
				
		setBackground(Color.BLUE);
		g.setColor(Color.green);
		g.fillRect(0,348,1920,350);
		g.setColor(Color.WHITE);
		g.fillOval(1520-2*x,35,100,100);
		
		g.setColor(Color.red);
        g.fillRect(100+x, 240, 300, 100);

        // Draw windows
        g.setColor(Color.black);
        g.fillRect(130+x, 250, 40, 40);
        g.fillRect(280+x, 250, 40, 40);

        // Draw wheels
        g.setColor(Color.black);
        g.fillOval(120+x, 330, 60, 60);
        g.fillOval(290+x, 330, 60, 60);

        // Draw doors
        g.setColor(Color.black);
        g.fillRect(180+x, 260, 20, 80);

		
	}
	public void run(){

		try{	while(true){
			repaint();
			x+=5;
			if(x>=1920) x=0;
			Thread.sleep(100);
		}
}
		catch(Exception e){
		
		}
	}


}

