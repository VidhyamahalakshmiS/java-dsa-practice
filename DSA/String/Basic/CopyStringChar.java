package DSA.String.Basic;
import java.util.Scanner;
public class CopyStringChar {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String original=sc.nextLine();
        String copy="";
        for(int i=0;i<original.length();i++){
            copy=copy+original.charAt(i);
        }
        System.out.println(copy);
        sc.close();
    }
}
