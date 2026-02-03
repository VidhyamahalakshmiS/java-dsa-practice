package DSA.String.Basic;
import java.util.Scanner;
public class ReplaceWords {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a=sc.nextLine();
        String res=s.replace(s,a);
        System.out.println(res);
        sc.close();
    }
}
