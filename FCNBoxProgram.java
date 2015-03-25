import acm.util.*; 
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.lang.Object;
import javax.swing.JButton;
import javax.swing.JTextField; 

public class FCNBoxProgram extends GraphicsProgram{
  private int width = getWidth();
  private int height = getHeight();
  private int x = 10, y = height/2;
  private GCompound compound;
  private final static double BOX_WIDTH=120, BOX_HEIGHT=50;

  private GRect rect;
  private GLabel label;
  private String str;

  private JTextField tf;
  private GLabel name;
  
  private GObject gobj;
  private GPoint ptlast;

  
  public void init(){
    name = new GLabel ("Name");
    add(name, 10,getHeight()-30);
    
    tf = new JTextField(10); //textfield 
    
     add(tf, SOUTH);
  
    JButton button = new JButton("Add");
    add(button,SOUTH);
    
    JButton remove = new JButton("Remove");
    add(remove,SOUTH);
    
    JButton clear = new JButton("Clear");
    add(clear,SOUTH);
    
    addMouseListeners();
    addActionListeners();
  }
  
  public void actionPerformed(ActionEvent e){
    x=getX();
    y=getY();
    
  GRect rect;
  GLabel label;
  String str;
  
    if(e.getActionCommand().equals("Add")) {
    add();
    }
    
    if(e.getActionCommand().equals("Remove")) {
      if(gobj!=null){
      gobj.setVisible(false);
      }
    }
        
    if(e.getActionCommand().equals("Clear")) {
      removeAll();
    }
  }
  
  public void add(){
    compound = new GCompound();
    int boxW = (int)BOX_WIDTH;
    int STARTX = getWidth()/2-(int)boxW/2, STARTY = getHeight()/2-(int)BOX_HEIGHT/2; //centers the box 
   
    str = tf.getText();
    label = new GLabel(str,STARTX,STARTY);
    label.move(BOX_WIDTH/2-label.getWidth()/2,BOX_HEIGHT/2+label.getHeight()/4); //used Line to test visually if the label 
                                                                                 //was positioned and determined that there 
                                                                                 //was padding so this is why it is divided by 4

    
    if(label.getWidth()>BOX_WIDTH){ //will change the size of the box if the text is longer than the initial size 
    boxW+=label.getWidth()+10;
    STARTX = getWidth()/2-(int)boxW/2;
    }
    
    rect = new GRect(STARTX,STARTY,boxW,BOX_HEIGHT); //creates a rectangle with the previously created values 
    
    compound.add(label);
    compound.add(rect);
    add(compound);
    
    boxW=(int)BOX_WIDTH;
  }
    
  public void mousePressed(MouseEvent e){ //makes the object active when you click it 
  ptlast = new GPoint(e.getPoint());
  gobj = getElementAt(ptlast);
  }
  
  public void mouseDragged(MouseEvent e){ //allows you to drag the boxes anywhere in the screen 
    if(gobj !=null){
    gobj.move(e.getX()-ptlast.getX(),e.getY()-ptlast.getY());
    ptlast = new GPoint(e.getPoint());
    gobj.sendToFront();}
  }

  
  
}
  
  