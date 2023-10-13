import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="MouseEvents1.class" width=300 height=100></applet>*/
public class MouseEvents1 extends Applet impletments MouseListener
{
  String msg="Initial message";
   public void int()
   {
     addMouseListener(this);
	 }
	 public void mouseClicked(MouseEvent m)
	 {
	   msg="Mouse Clicked";
	   repaint();
	  }
	  
	 public void mouseReleased(MouseEvent m)
      {
       msg="Mouse Released";
	   repaint(); 
      }	   
	  public void mouseEntered(MouseEvent m)
      {
       msg="Mouse Entered";
	   repaint(); 
      }	   
	  public void mouseExited(MouseEvent m)
      {
       msg="Mouse Exited";
	   repaint(); 
      }	
      public void paint(Graphics g)
       {
         g.drawString(msg,30,30);
       }
    }	   