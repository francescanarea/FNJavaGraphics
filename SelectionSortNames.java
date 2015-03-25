import acm.util.*; 
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class SelectionSortNames extends ConsoleProgram{
  String[] array = {"Applepie","Apple","Aaple","C","P","Q","M"};
  
  public void run(){
  sort(array);
  println(arrayPrint()); //prints out array
  }
  
  public void sort(String[]arr){
    for(int lh=0; lh<arr.length;lh++){
    int rh = findSmallest(arr,lh,arr.length); //finds the smallest value 
    swap(lh,rh,arr); //swaps the smallest value with the current value
    }
  }
  
  public int findSmallest(String[]arr,int p1, int p2){
    int min = p1; //initial min is the current value
    for(int i = p1+1; i<p2; i++){ //looks at indices after the current value for the min
    if(arr[i].compareTo(arr[p1]) < 0) //if current compared to p1 is less than 0 this means p1 comes earlier 
      min = i; //sets min value 
    }
    return min;
  }
  
  public void swap(int rh,int lh,String[]arr){
  String swap = arr[lh]; //holds value for swapping 
  arr[lh] = arr[rh]; //puts min value into current value
  arr[rh] = swap; //puts current value into min index
  }

  public String arrayPrint(){
  String str ="";
  for(int i = 0; i<array.length;i++)
   str+=array[i]+", ";
  return str;
  }
  
}