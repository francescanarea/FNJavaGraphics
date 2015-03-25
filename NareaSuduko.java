
public class NareaSuduko{
  private static int[][] sud = { {4,5,6},{2,1,3},{7,8,9} };
  
  public static void main(String[] args){
    System.out.println(checkUpperLeftCorner(sud));
  }
  
  private static boolean checkUpperLeftCorner(int[][]matrix){
  boolean suduko = false; //assumes it is not true 
  for(int i = 1; i<9;i++){ //looking for numbers
    if(!check(matrix,i)) //if not 
      return false;
  }
  return true;
  }
  
  private static boolean check(int[][]matrix, int num){
  for(int r=0; r<matrix.length; r++){
   for(int c=0; c<matrix[0].length;c++){
     if(matrix[r][c]== num)
     return true;
   }
  }
  return false;
 }
  
}
  
  
  
  
 