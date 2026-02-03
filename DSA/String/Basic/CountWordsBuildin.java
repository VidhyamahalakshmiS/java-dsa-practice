package DSA.String.Basic;
import java.util.Scanner;
public class CountWordsBuildin {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.trim();
        if(s.isEmpty()){
            System.out.println("Zero");
        }else{
            String []word=s.split("\\s+");
            System.out.println(word.length);
        }
        sc.close();
    }
}
