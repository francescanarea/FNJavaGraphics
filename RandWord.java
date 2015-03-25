import acm.util.*; 
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
//francesca narea

public class RandWord extends ConsoleProgram{
  private RandomGenerator rgen = RandomGenerator.getInstance();

  public void run(){
  String[] words = new String[5];
    for(int i = 0; i < words.length; i++){
    words[i] = genRandWord(); //creating array of random "words"
    println(words[i]);
    
    }
  }
  
public String genRandWord()
{
  int n = letters();
  String returnWord="";
  char[] word = new char[n]; //creates an array to store char values 
  
  for(int i = 0; i < word.length; i++){
    word[i] = (char)('a'+rgen.nextInt(0,24)); //will get random chars by getting random number and adding it to value of a
    if(i==0)
      word[i] = Character.toUpperCase(word[i]);
    returnWord+=word[i]; //turns the char into string 
  }
  
  return returnWord;
}

public int letters(){
  return rgen.nextInt(3,15); //number of letters will be 3-15
}

}