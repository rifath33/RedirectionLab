import java.util.Scanner;

public class PigLatin{
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    while (s.hasNextLine()) {
      String str = s.nextLine();
      String newstr = "";
      String[] words = str.split(" ");
      for (int i = 0; i < words.length; i++) {
  
          newstr += pigLatinBest(words[i]) + " ";
      }
      System.out.println(newstr);
    }

  }
  
  public static String pigLatinSimple(String s){
    String workingString = s.toLowerCase();
    String result = "";
    
    if(
    
    workingString.charAt(0) == ('a') ||
    workingString.charAt(0) == ('e') ||
    workingString.charAt(0) == ('i') ||
    workingString.charAt(0) == ('o') ||
    workingString.charAt(0) == ('u')
    
    )
    result = workingString + "hay";
    else{
        
        result = workingString.substring(1) + workingString.charAt(0);
        result = result + "ay";
        
    }
    
    return result;
    
  }
  
  public static String pigLatin(String s){
    String workingString = s.toLowerCase();
    String result = "";
    
    if(
        (workingString.length() > 1)
        &&
        (
        workingString.substring(0,2).equals("bl") ||
        workingString.substring(0,2).equals("br" ) ||
        workingString.substring(0,2).equals("ch" ) ||
        workingString.substring(0,2).equals("ck" ) ||
        workingString.substring(0,2).equals( "cl" ) ||
        workingString.substring(0,2).equals(  "cr") ||
        workingString.substring(0,2).equals( "dr") ||
        workingString.substring(0,2).equals( "fl" ) ||
        workingString.substring(0,2).equals("fr" ) ||
        workingString.substring(0,2).equals("gh" ) ||
        workingString.substring(0,2).equals("gl" ) ||
        workingString.substring(0,2).equals( "gr" ) ||
        workingString.substring(0,2).equals("ng" ) ||
        workingString.substring(0,2).equals("ph" ) ||
        workingString.substring(0,2).equals("pl" ) ||
        workingString.substring(0,2).equals("pr" ) ||
        workingString.substring(0,2).equals("qu" ) ||
        workingString.substring(0,2).equals("sc" ) ||
        workingString.substring(0,2).equals("sh" ) ||
        workingString.substring(0,2).equals("sk" ) ||
        workingString.substring(0,2).equals("sl" ) ||
        workingString.substring(0,2).equals( "sm" ) ||
        workingString.substring(0,2).equals("sn" ) ||
        workingString.substring(0,2).equals( "sp" ) ||
        workingString.substring(0,2).equals("st" ) ||
        workingString.substring(0,2).equals("sw" ) ||
        workingString.substring(0,2).equals("th" ) ||
        workingString.substring(0,2).equals("tr" ) ||
        workingString.substring(0,2).equals("tw" ) ||
        workingString.substring(0,2).equals("wh" ) ||
        workingString.substring(0,2).equals( "wr" )
       ) 
    )
    {
        
        result = workingString.substring(2) + workingString.substring(0,2);
        result = result + "ay";
        
    }
    else{
    
        if(
    
        workingString.charAt(0) == ('a') ||
        workingString.charAt(0) == ('e') ||
        workingString.charAt(0) == ('i') ||
        workingString.charAt(0) == ('o') ||
        workingString.charAt(0) == ('u')
    
        )
        result = workingString + "hay";
        else{
        
            result = workingString.substring(1) + workingString.charAt(0);
            result = result + "ay";
        
        }
    
    }
    
    return result;
    
  }
  
  public static String pigLatinBest(String s){
    String workingString = s.toLowerCase();
    String result = "";
    char beginning = workingString.charAt(0);
    char ending = workingString.charAt(workingString.length()-1);
    
    if(Character.isLetter(beginning)){
        
        if(!Character.isLetter(ending)){
            
            result = pigLatin(workingString.substring(0,workingString.length()-1)) + ending;
            return result;
        
        }
        else{
            
            result = pigLatin(workingString);
            return result;
            
        }
    
    }
    else{
    
        return pigLatin(workingString);
    
    }
    
  }
  
}
























