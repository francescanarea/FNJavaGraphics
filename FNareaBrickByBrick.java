import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class FNareaBrickByBrick extends GraphicsProgram
{
  private static final int BW = 30;
  private static final int BH = 12;
  private static final int BASE = 14;
  
  public void run()
  {
    
    int myX = (getWidth()-BW)/2, myY = getHeight(), startX = (getWidth() - BW*BASE)/2; //x value starts at the left end of pyramid 

    for (int i = BASE; i>= 0; i--){ //number of bricks in a single row (starting with bottom row)
      for (int count = 0; count <i;count++){ //fills in the number of bricks specific to each row 
      GRect brick = new GRect (myX,myY,BW,BH); 
        add(brick);
        myX+=BW; //adds the width of the brick to the x value until the row has reached its max number 
      }
      startX+=BW/2; //changes the position of the x value for the next row 
      myX=startX; //stores back into variable used in for loop 
      myY-=BH; //changes y value, is a minus since the bricks fill in from bottom row up 
   }
  }
 }

      