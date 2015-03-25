import acm.util.*; 
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import acm.graphics.GLine;
import java.io.StringReader;


public class CompareName extends ConsoleProgram{
  String[] array = {"Francesca","Grant","Jack","Johnny","Nate","Teddy","Tommy","Yousef"};
  public void run(){
   String key = "Francesca";

   println(search(key,array)); 
  }
  
  private int search(String key, String[] array){
  int min = 0; 
  int max = array.length-1;
  int i = (max+min)/2;
  int num = -1;
  
  while(array[i].compareTo(key)!=0){
  
   if(array[i].compareTo(key)<0)
    min = i;
  
   if(array[i].compareTo(key)>0)
    max=i;
  
   i = (max+min)/2;
   num = i;
   }
  
  return num;
  }
}