package DSA.String.Basic;
import java.util.Scanner;
import java.util.HashMap;
public class MostFreqChar {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char maxchar=s.charAt(0);
        int maxcount=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()){
            if(map.get(ch)>maxcount){
                maxcount=map.get(ch);
               maxchar=ch;
            }
        }
        System.out.println("Most Frequent Character is: "+maxchar);
        sc.close();
    }
}
