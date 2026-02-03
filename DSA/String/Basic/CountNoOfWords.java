package DSA.String.Basic;
import java.util.Scanner;
public class CountNoOfWords {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if((i==0 && s.charAt(i)!=' ') || (s.charAt(i)!=' ' && s.charAt(i-1)==' ')){
                count++;
            }
        }
        System.out.println("The Number of Words in String is: "+count);
        sc.close();
    }
}
