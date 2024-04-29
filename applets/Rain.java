import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/*<applet code="Rain" height=1080 width=1920></applet> */
public class Rain extends Applet implements Runnable{
    int[] xPositions;
    int[] yPositions;
    int[] speeds;
    int numOfDrops = 1000;
    
    public void init(){
        Thread t=new Thread(this);
        t.start();
        
        // Initialize positions and speeds
        xPositions = new int[numOfDrops];
        yPositions = new int[numOfDrops];
        speeds = new int[numOfDrops];
        Random random = new Random();
        for(int i = 0; i < numOfDrops; i++) {
            xPositions[i] = random.nextInt(1920);
            yPositions[i] = random.nextInt(1080);
            speeds[i] = random.nextInt(5) + 1; // Speed between 1 and 5
        }
    }
    
    public void run(){
        try{
            while(true){
                repaint();
                Thread.sleep(10);
            }
        }catch(Exception e){}
    }
    
    public void paint(Graphics g){
        setBackground(Color.black);
        g.setColor(Color.WHITE);
        g.fillOval(1200, 100, 100, 100);
        g.fillArc(600, 600, 400, 200, 0, 180);
        //g.fillRect(600, 500,300,20);
        g.fillRect(800, 700, 20, 300);
        g.setColor(Color.WHITE);

        for(int i=0; i<numOfDrops; i++){
            int x1 = xPositions[i];
            int y1 = yPositions[i];
            if((x1>=600 && x1<=1000) &&(y1>=600 && y1<=1000)){ 
                yPositions[i] += speeds[i];
            
                // Reset raindrop if it goes off screen
                if(yPositions[i] > 1080){
                    yPositions[i] = 0;
                }
                continue;}

            g.fillOval(x1, y1, 7, 7);
            
            // Move the raindrop down
            yPositions[i] += speeds[i];
            
            // Reset raindrop if it goes off screen
            if(yPositions[i] > 1080){
                yPositions[i] = 0;
            }
        }
    }
}
