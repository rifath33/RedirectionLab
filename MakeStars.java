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
    
    
    
    while(scan.hasNextLine()){
        
        String currentLine = scan.nextLine();
        
        Scanner currentLineScanner = new Scanner (currentLine);
        
        while(currentLineScanner.hasNext()){

            String word = currentLineScanner.next();
            for(int i = 0; i < word.length(); i++){
                result = result + "*";
            }
            
            if(currentLineScanner.hasNext()){
                result = result + " ";
            }
            
        }
    
        if(scan.hasNextLine())
        result = result + "\n";
    
    }
    
    System.out.println( result);
    
  }


}


