import java.awt.*;
import java.applet.*; 
/*<applet code="Ins" height=500 width=500></applet> */
// adds space outside from left right top bottom
public class Ins extends Applet {
    public void init(){
    setBackground(Color.cyan); 
    setLayout(new BorderLayout()); 
    add(new Button("This is across the top."), BorderLayout.NORTH); 
    add(new Label("The footer message might go here."), BorderLayout.SOUTH); 
    add(new Button("Right"), BorderLayout.EAST); 
    add(new Button("Left"), BorderLayout.WEST); 
    String msg = "The reasonable man adapts " + "himself to the world;\n" +"the unreasonable one persists in " + "trying to adapt the world to himself.\n" + "Therefore all progress depends " + "on the unreasonable man.\n\n" + " - George Bernard Shaw\n\n"; 
    add(new TextArea(msg), BorderLayout.CENTER); 
}
 // add insets adds whitespace
 public Insets getInsets() {
     return new Insets(10, 10, 10, 10); 
    }
}
