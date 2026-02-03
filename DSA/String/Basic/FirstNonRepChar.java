package DSA.String.Basic;
import java.util.HashMap;
import java.util.Scanner;
public class FirstNonRepChar {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:s.toCharArray()){
            if(map.get(ch)==1){
                System.out.println("First Non Repeating Character: "+ch);
                break;
            }
        }
        sc.close();
    }
}
