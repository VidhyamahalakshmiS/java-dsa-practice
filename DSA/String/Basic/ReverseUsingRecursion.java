package DSA.String.Basic;
import java.util.Scanner;
public class ReverseUsingRecursion {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s));
        sc.close();
    }
    static String reverse(String s){
        if(s.isEmpty()){
            return s;
        }
        return reverse(s.substring(1))+s.charAt(0);
    }
}
