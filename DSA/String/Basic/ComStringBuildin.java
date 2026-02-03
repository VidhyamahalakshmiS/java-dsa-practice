package DSA.String.Basic;
import java.util.Scanner;
public class ComStringBuildin {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a=sc.nextLine();
        if(s.equals(a)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        sc.close();
    }
}
