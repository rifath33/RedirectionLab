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
    String result = "";
    
    if(
    
    s.charAt(0) == ('a') ||
    s.charAt(0) == ('e') ||
    s.charAt(0) == ('i') ||
    s.charAt(0) == ('o') ||
    s.charAt(0) == ('u')
    
    )
    result = s + "hay";
    else{
        
        result = s.substring(1) + s.charAt(0);
        result = result + "ay";
        
    }
    
    return result;
    
  }
  
  public static String pigLatin(String s){
    String result = "";
    
    if(
    
    s.substring(0,2).equals("bl") ||
    s.substring(0,2).equals("br" ) ||
    s.substring(0,2).equals("ch" ) ||
    s.substring(0,2).equals("ck" ) ||
    s.substring(0,2).equals( "cl" ) ||
    s.substring(0,2).equals(  "cr") ||
    s.substring(0,2).equals( "dr") ||
    s.substring(0,2).equals( "fl" ) ||
    s.substring(0,2).equals("fr" ) ||
    s.substring(0,2).equals("gh" ) ||
    s.substring(0,2).equals("gl" ) ||
    s.substring(0,2).equals( "gr" ) ||
    s.substring(0,2).equals("ng" ) ||
    s.substring(0,2).equals("ph" ) ||
    s.substring(0,2).equals("pl" ) ||
    s.substring(0,2).equals("pr" ) ||
    s.substring(0,2).equals("qu" ) ||
    s.substring(0,2).equals("sc" ) ||
    s.substring(0,2).equals("sh" ) ||
    s.substring(0,2).equals("sk" ) ||
    s.substring(0,2).equals("sl" ) ||
    s.substring(0,2).equals( "sm" ) ||
    s.substring(0,2).equals("sn" ) ||
    s.substring(0,2).equals( "sp" ) ||
    s.substring(0,2).equals("st" ) ||
    s.substring(0,2).equals("sw" ) ||
    s.substring(0,2).equals("th" ) ||
    s.substring(0,2).equals("tr" ) ||
    s.substring(0,2).equals("tw" ) ||
    s.substring(0,2).equals("wh" ) ||
    s.substring(0,2).equals( "wr" )
        
    )
    {
        
        result = s.substring(2) + s.substring(0,2);
        result = result + "ay";
        
    }
    else{
    
        if(
    
        s.charAt(0) == ('a') ||
        s.charAt(0) == ('e') ||
        s.charAt(0) == ('i') ||
        s.charAt(0) == ('o') ||
        s.charAt(0) == ('u')
    
        )
        result = s + "hay";
        else{
        
            result = s.substring(1) + s.charAt(0);
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
























