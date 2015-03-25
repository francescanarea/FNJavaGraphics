import acm.gui.*;
import acm.program.*;
import javax.swing.*;
import acm.graphics.*;
import java.awt.*;
import java.*;
import java.awt.event.*;
import acm.program.*;
import acm.util.*;
import java.math.*;
import java.lang.Math;

public class FNCarExam extends GraphicsProgram{
  private final int NOSE_SIZE = 50;
  private final int XBODY = 200, YBODY=100;
  private final int PAUSE_TIME = 5;
    
  private static int dx = 1, dy = 0;
  private final int WHEEL_SIZE = 50;
  private final int MIDX = getWidth()/2, MIDY = getHeight()/2;
  
  public void run(){
 
    GRect body = new GRect(MIDX,MIDY,XBODY,YBODY);
    body.setFilled(true);
    body.setColor(randColor());
    add(body);
    

    GOval wheel1 = new GOval(MIDX,MIDY+YBODY,WHEEL_SIZE,WHEEL_SIZE);
    wheel1.setFilled(true);
    wheel1.setColor(randColor());
    add(wheel1);
    
    GOval wheel2 = new GOval(MIDX+XBODY-WHEEL_SIZE,MIDY+YBODY,WHEEL_SIZE,WHEEL_SIZE);
    wheel2.setFilled(true);
    wheel2.setColor(randColor());
    add(wheel2);
    
    GRect nose = new GRect(MIDX+XBODY,MIDY+YBODY-NOSE_SIZE,NOSE_SIZE,NOSE_SIZE);
    nose.setFilled(true);
    nose.setColor(randColor());
    add(nose);
    
    while(true){
    
      if(nose.getX() == getWidth()-NOSE_SIZE){
      dx=-1;
      }
      if(body.getX() == 0){
      dx=1;
      }
    
    body.move(dx,dy);
    wheel1.move(dx,dy);
    wheel2.move(dx,dy);
    nose.move(dx,dy);
    pause(PAUSE_TIME);
    }
  }
  
  
  
  public Color randColor(){
  int r = (int)(Math.random()*256), g= (int)(Math.random()*256), b= (int)(Math.random()*256);
  return new Color(r,g,b);
  }
  
  
  
}