import java.applet.Applet;
import java.awt.*;

public class My4thAppletOfGivingInput extends Applet {
	public void init()
	{
		resize(500,500);
		setBackground(Color.YELLOW);
	}

	public void paint(Graphics g)
	{
		int x=0;
		int y=0;
		String msg="";
		x=Integer.parseInt(getParameter("xPosition"));
		y=Integer.parseInt(getParameter("yPosition"));
		msg=getParameter("msg");
	g.drawString(msg,x,y);
	
	}

}