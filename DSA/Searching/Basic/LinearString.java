package DSA.Searching.Basic;
import java.util.Scanner;
public class LinearString {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            char ch=sc.next().charAt(0);
            int index=linear(s,ch);
            if(index!=-1){
                System.out.println("Element found at: "+index);
            }
            else{
                System.out.println("Element not found");
            }
            sc.close();
        }
    static int linear(String s,char ch){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
}
