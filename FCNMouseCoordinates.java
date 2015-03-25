import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.lang.Math;
import acm.util.*;
import java.util.*;
import java.awt.event.*;

public class FCNMouseCoordinates extends GraphicsProgram{
  
  private GLabel xy = new GLabel("0,0",50,50);
  private int x;
  private int y;
  
  public void init(){
    addMouseListeners();
    add(xy);
  }
  
  public void mouseMoved(MouseEvent me){
   int d=0;
   x=me.getX();
   y=me.getY();
   xy.setLabel("("+x+","+y+")");
   xy.setLocation(x-d-xy.getWidth(),y);
  }
  
  
}

