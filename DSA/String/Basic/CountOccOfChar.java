package DSA.String.Basic;
import java.util.Scanner;
public class CountOccOfChar {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char target=sc.next().charAt(0);
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch==target)
               count++;
        }
        System.out.println(count);
        sc.close();
    }
}
