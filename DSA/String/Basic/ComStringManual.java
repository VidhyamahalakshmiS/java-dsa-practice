package DSA.String.Basic;
import java.util.Scanner;
public class ComStringManual {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean isEqual=true;
        if(s1.length()!=s2.length()){
            isEqual=false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                isEqual=false;
            }
        }
        System.out.println(isEqual?"Strings are Same":"Strings are not same");
        sc.close();
    }
}
