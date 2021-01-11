/* 
Write a java program MakeStars.java that will read in text input, and
convert each word to an equally long block of *. The converted text is
then printed. New Lines will be preserved. 

We will combine multiple whitespaces between words into spaces. 
*/

import java.util.Scanner;
public class MakeStars {
    
  public static void main(String args[]) {
    
    Scanner scan = new Scanner ( System.in );
    String result = "";
    
    while(scan.hasNext()){
    if(result.equals(""))
    result = result + scan.next();
    else result = result + " " + scan.next();
    }
    
    System.out.println( result);
    
  }


}


