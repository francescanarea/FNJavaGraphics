import acm.util.*; 
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.util.*;

public class SelectionSortArrayList extends ConsoleProgram{
  ArrayList<Integer> list = new ArrayList<Integer>(); 
 
  public void run(){
  list.add(3);
  list.add(2);
  list.add(3);
  list.add(9);
  sort(list);
  println(listPrint(list)); //prints out array
  }
  
  public void sort(ArrayList<Integer>list){
    for(int lh=0; lh<list.size();lh++){
    int rh = findSmallest(list,lh,list.size()); //finds the smallest value 
    swap(lh,rh); //swaps the smallest value with the current value
    }
  }
 
  public int findSmallest(ArrayList<Integer>list, int p1, int p2){
    int min = p1; //initial min is the current value
    for(int i = p1+1; i<p2; i++){ //looks at indices after the current value for the min
    if(list.get(i) < list.get(p1)) 
      min = i; //sets min value 
    }
    return min;
  }
  
  public void swap(int p1, int p2){
  int swap = list.get(p1); //holds value for swapping 
  list.set(p1, list.get(p2)); //puts min value into current value
  list.set(p2,swap); //puts current value into min index
  }

  public String listPrint(ArrayList<Integer>list){
  String str ="";
  for(int i = 0; i<list.size();i++)
   str+=list.get(i)+", ";
  return str;
  }
  
}