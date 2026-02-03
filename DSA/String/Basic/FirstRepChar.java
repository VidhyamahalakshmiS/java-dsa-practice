package DSA.String.Basic;
import java.util.HashSet;
import java.util.Scanner;
public class FirstRepChar {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        boolean found=false;
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                System.out.println("First Repeating Charater: "+ch);
                found=true;
                break;
            }
            set.add(ch);
        }
        if(!found){
            System.out.println("No Repeating Character");
        }
      sc.close();
    }
}
