import java.applet.Applet;
import java.awt.*;

public class My3rdApplet extends Applet {
	public void init()
	{
		resize(500,500);
		setBackground(Color.YELLOW);
	}

	public void paint(Graphics g)
	{
	g.drawString("Hello,World",150 ,150);
	
	}

}