package DSA.String.Basic;
import java.util.Scanner;
import java.util.HashSet;
public class CheckCharUnique {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean isUnique=true;
        HashSet<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(!set.add(ch)){    //If cant add the repeating character
                isUnique=false;
                break;
            }
        }
        System.out.println(isUnique? "All Characters are Unique " : "All Characters are not Unique");
        sc.close();
    }
}
