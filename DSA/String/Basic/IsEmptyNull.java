package DSA.String.Basic;
import java.util.Scanner;
public class IsEmptyNull {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s==null){
            System.out.println("Null");
        }
        else if(s.isEmpty()){
            System.out.println("String is Empty");
        }
        else{
            System.out.println("String is not Empty");
        }
        sc.close();
    }
}
