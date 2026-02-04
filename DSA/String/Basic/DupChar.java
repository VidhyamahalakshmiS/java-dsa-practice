package DSA.String.Basic;
import java.util.Scanner;
import java.util.HashMap;
public class DupChar {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()){     //for iterating through only keys 
            if(map.get(ch)>1){
                System.out.println("Duplicates: "+ch);
            }
        }
        sc.close();
    }
}
