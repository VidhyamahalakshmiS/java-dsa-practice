package DSA.String.Basic;
import java.util.Scanner;
import java.util.HashMap;
public class LeastFreqChar {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char minchar=s.charAt(0);
        int leastcount=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()){
            if(map.get(ch)<leastcount){
                minchar=ch;
                leastcount=map.get(ch);
            }
        }
        System.out.println("Least Frequent Character: "+minchar);
        sc.close();
    }
}
