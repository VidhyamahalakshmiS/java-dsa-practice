package DSA.String.Intermediate;
import java.util.Scanner;
public class ConvertAlternate {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        alternate(s);
        sc.close();
    }
    public static void alternate(String s){
        StringBuilder result=new StringBuilder();
        int uppercount=0;
        int lowercount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(i%2==0){
                    ch=Character.toUpperCase(ch);
                    uppercount++;
                }
                else{
                    ch=Character.toLowerCase(ch);
                    lowercount++;
                }
            }
            result.append(ch);
        }
        System.out.println("After convertion : "+result);
        System.out.println("Uppercase Count: "+uppercount);
        System.out.println("Lowercase Count: "+lowercount);
    }
}
