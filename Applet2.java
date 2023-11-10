import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

// <applet code = Applet2.java width ="200" height = "200">
//  </applet>

public class Applet2 extends Applet {
   
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("hello world", 20, 20);
    }
    
}
