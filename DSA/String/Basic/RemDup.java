package DSA.String.Basic;
import java.util.Scanner;
import java.util.HashSet;
public class RemDup {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder res=new StringBuilder();
        HashSet<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(set.add(ch)){
                res.append(ch);
            }
        }
        System.out.println("After Removing Duplicates: "+res);
        sc.close();
    }
}
