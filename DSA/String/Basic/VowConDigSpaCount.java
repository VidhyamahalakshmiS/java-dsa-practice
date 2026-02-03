package DSA.String.Basic;
import java.util.Scanner;
public class VowConDigSpaCount {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int vowels=0;
        int con=0;
        int digits=0;
        int space=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                space++;
            }
            else if(ch>='0' && ch<='9'){
                digits++;
            }
            else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U'){
                vowels++;
            }
            else if((ch>='a'&& ch<='z')|| (ch>='A' && ch<='Z')){
                con++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+con);
        System.out.println("Space: "+space);
        System.out.println("Digits: "+digits);
        sc.close();
    }
}
