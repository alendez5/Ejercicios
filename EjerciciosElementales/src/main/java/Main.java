import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

 
    public static void main(String args[]) {
      
        String palabra = "abcdef";
        char c =' ';
        String par;
        
        if(palabra.length() %2 == 0){
            par = palabra.charAt(palabra.length()/2-1) + "" + palabra.charAt(palabra.length()/2);
            System.out.println(par);
        }
     
      
    }

 

}


