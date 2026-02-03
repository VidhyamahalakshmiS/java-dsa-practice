package DSA.String.Basic;
import java.util.Scanner;
public class UppperLower {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String lower="";
        int lcount=0;
        String upper="";
        int ucount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //Lower to Upper (-32)
            if(ch>='a' && ch<='z'){
                lower=lower+(char)(ch-32);
                lcount++;
            }else{
                lower=lower+ch;
            }
            //upper to Lower (+32)
            if(ch>='A'&& ch<='Z'){
                upper=upper+(char)(ch+32);
                ucount++;
            }
            else{
                upper=upper+ch;
            }
        }
        System.out.println(lower+lcount);
        System.out.println(upper+ucount);
        sc.close();
    }
}
