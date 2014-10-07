
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class FNareaBouncingBall extends GraphicsProgram{
  
  private static final int SQUARESIZE = 50;
  public void run(){

    int x = ((getWidth()-SQUARESIZE)/2), y = (getHeight()-SQUARESIZE)/2;
    int dx = 1, dy = 1;
    GOval oval = new GOval ((getWidth()-SQUARESIZE)/2,(getHeight()-SQUARESIZE)/2,SQUARESIZE,SQUARESIZE); //circle in middle of screen
    oval.setFilled(true);
    oval.setColor(Color.GREEN);
    add(oval);
    
    dy=-1;
    while(true)
    {
      
      int r = (int)(Math.random()*256), g = (int)(Math.random()*256), b= (int)(Math.random()*256); //creates rbg random values
      if(x==getWidth()-SQUARESIZE) //reached left edge of screen 
      {
        oval.setColor(new Color(r,g,b)); //sets color to random values 
        dx=-1; //will change x direction of ball 
      }
      
      if(y==0){ //reached top of screen
         oval.setColor(new Color(r,g,b));
        dy=1; 
      }
      
      if(x==0){ //reached left edge of screen 
        oval.setColor(new Color(r,g,b));
        dx=1;
      }
      
      if(y==getHeight()-SQUARESIZE){ //reached bottom of screen 
            oval.setColor(new Color(r,g,b));
        dy=-1;
      }
      
    oval.move(dx,dy);
    oval.pause(1);
    
    x+=dx; //tracks current x coordinates
    y+=dy; //tracks current y coordinates
  }
 }
}
    
  

    
    
 
  
  
  


