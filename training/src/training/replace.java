package training;

public class replace {
	 
    public static void main(String args[]) {

     String word = "Java";
    
     
     String replaced = word.replace("J", "K");
     
   
     System.out.println("Replaced String : " + replaced);
    
        
     String str = "Scala is good programming language";
     replaced = str.replaceAll("Scala", "Java");
     
     System.out.println("String after replace : " + replaced);
    
     
   
    } 
   
}

