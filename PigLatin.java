public class PigLatin{
  public static void main(String[] args){
    
    System.out.println(pigLatinSimple("f"));
    
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("pie"));
    System.out.println(pigLatinSimple("david"));
    System.out.println(pigLatinSimple("aaron"));
    
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
  
  
  
}
