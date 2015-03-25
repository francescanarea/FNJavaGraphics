import acm.util.*; 
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import acm.graphics.GLine;

public class EtchASketch extends GraphicsProgram{
  private int xcoord,ycoord;

  private GOval oval;

  private GLine line,line2, line3;
  private JButton north, south, east, west;
  
  private Color color = Color.RED; //color of the line of the x's path 
  private final int xVal = 20; //the value for the two lines that create the x 
  private final int d = 20; //value for the length the x will travel for each command 

  public void init(){
    
    xcoord=getWidth()/2;
    ycoord=getHeight()/2-xVal; 
    
    north = new JButton("North");
    add(north, SOUTH);
    
    south = new JButton("South");
    add(south, SOUTH);
    
    east = new JButton("East");
    add(east, SOUTH);
    
    west = new JButton("West");
    add(west, SOUTH);
     
     //the point of intersection of the lines is centered in the middle of the screen 
    line = new GLine(getWidth()/2-xVal/2,getHeight()/2-xVal/2,getWidth()/2+xVal/2,getHeight()/2+xVal/2);
    add(line);
    line2 = new GLine(getWidth()/2+xVal/2,getHeight()/2-xVal/2,getWidth()/2-xVal/2,getHeight()/2+xVal/2);
    add(line2);
    
    createCompass(); //creates compass 
    
    
    addMouseListeners();
    addActionListeners();
  }
  
  public void actionPerformed(ActionEvent e){
   
    if(e.getActionCommand().equals("North")) {
      line.move(0,-d);
      line2.move(0,-d);
      line3= new GLine(xcoord,ycoord,xcoord,ycoord-d); //subtracts from y coordinate for north 
      line3.setColor(color);
      add(line3);
      ycoord-=d; //changes the y value accordingly
    }
    
  if(e.getActionCommand().equals("South")) {
      line.move(0,d);
      line2.move(0,d);
      line3= new GLine(xcoord,ycoord,xcoord,ycoord+d); //adds to y coordinate for south 
      line3.setColor(color);
      add(line3);
      ycoord+=d; //changes the y value accordingly
    }
       
if(e.getActionCommand().equals("East")) { 
      line.move(d,0);
      line2.move(d,0);
      line3= new GLine(xcoord,ycoord,xcoord+d,ycoord); //adds to x coordinate for east
      line3.setColor(color);
      add(line3);
      xcoord+=d; //changes the x value accordingly
    }
  
  if(e.getActionCommand().equals("West")) {
      line.move(-d,0);
      line2.move(-d,0);
      line3= new GLine(xcoord,ycoord,xcoord-d,ycoord); //subtracts from x coordinate for west 
      line3.setColor(color);
      add(line3);
      xcoord-=d; //changes the x value accordingly
    }
  }
  
  public void createCompass(){
  GLine compass = new GLine (20,20,60,60);
  add(compass);
    
  GLine compassA = new GLine (20,20,20,30);
  add(compassA);
  
  GLine compassB = new GLine (20,20,30,20);
  add(compassB);
  
  
  GLine compassC = new GLine (50,50,55,50);
  add(compassC);
  
  GLine compassD = new GLine (50,50,50,55);
  add(compassD);
  
  GLine compassE = new GLine (55,55,60,55);
  add(compassE);
  
  
  GLine compassF = new GLine (55,55,55,60);
  add(compassF);
  
  
  GLine compass2 = new GLine (20,60,60,20);
  add(compass2);

  GLine compass2A = new GLine (60,20,50,20);
  add(compass2A);
  
  GLine compass2B = new GLine (60,20,60,30);
  add(compass2B);
  
  GLine compass2C = new GLine (25,55,25,60);
  add(compass2C);
  
  GLine compass2D = new GLine (25,55,20,55);
  add(compass2D);
  
  GLine compass2E = new GLine (30,50,30,55);
  add(compass2E);
  
  GLine compass2F = new GLine (30,50,25,50);
  add(compass2F);
  
  GLabel n = new GLabel ("N",37,30);
  add(n);
  
  GLabel s = new GLabel ("S",37,55);
  add(s);
  
  GLabel e = new GLabel ("E",50,42);
  add(e);
  
  GLabel w = new GLabel ("W",22,42);
  add(w);
  }
}
