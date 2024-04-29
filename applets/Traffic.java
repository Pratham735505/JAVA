import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

/*
<applet code="Traffic" height=1920 width=1080></applet>
*/
public class Traffic extends Applet implements ActionListener, Runnable{

	Thread T;
	int x=0;
	Color g;
	Button start;
	public void init(){
		T=new Thread(this);
		start =new Button("Start");
		add(start);
		start.addActionListener(this);
		
	}
	public void paint(Graphics g){
		setBackground(Color.BLUE);
		g.setColor(Color.BLACK);
		g.fillRect(500,200,100,300);
		g.setColor(Color.BLACK);
		
	}

	public void run(){



	}
	public void actionPerformed(ActionEvent ae){


	}
}