package DSA.String.Basic;
import java.util.HashMap;
import java.util.Scanner;
public class FrequencyOfChar {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        sc.close();
    }
}
