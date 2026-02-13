package DSA.String.Intermediate;
import java.util.Scanner;
public class OnlyDigits {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Digits(s));
        sc.close();
    }
    public static boolean Digits(String s){
        return s.matches("\\d+");
    }
}
