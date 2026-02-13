package DSA.String.Intermediate;
import java.util.Scanner;
public class OnlyAlphabets {
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    System.out.println(Alphabets(s));
    sc.close();
   } 
   public static boolean Alphabets(String s){
    return s.matches("[a-zA-Z]+");
        
   }
   
}
