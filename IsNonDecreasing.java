import acm.util.*; 
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class IsNonDecreasing extends ConsoleProgram{
  int[] arr = {2,2,2,2};
  
  public void run(){
    
   println(isSorted(arr));
  }
  
  public boolean isSorted(int[]arr){
    for(int i = 0; i<arr.length-1;i++){
    if(arr[i]>arr[i+1])
      return false;

    }
    return true;
  }
  
  
  }
  