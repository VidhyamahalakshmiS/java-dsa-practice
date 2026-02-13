package DSA.String.Intermediate;
import java.util.Scanner;
public class Alphanumeric {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(alpnum(s));
        sc.close();
    }
    public static boolean alpnum(String s){
        return s.matches("[a-zA-Z0-9]+");
    }
}
