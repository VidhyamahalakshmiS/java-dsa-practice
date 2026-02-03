
import java.util.Scanner;
public class Reverse {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int start=0;
        int end=n-1;
        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        sc.close();
    }
}
