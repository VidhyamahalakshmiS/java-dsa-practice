package DSA.String.Basic;
import java.util.Scanner;
public class LengthofStringManually {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(char ch : str.toCharArray()){
            count++;
        }
        System.out.println("Length of the String: "+count);
        sc.close();
    }
}
