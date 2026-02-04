package DSA.Array.Intermediate;
import java.util.Scanner;
public class MinSubarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cursum=0;
        int minsum=Integer.MAX_VALUE;
        int start=9;
        int end=0;
        int tempstart=0;
        for(int i=0;i<arr.length;i++){
            cursum+=arr[i];
            if(cursum<minsum){
                minsum=cursum;
                start=tempstart;
                end=i;
            }
            if(cursum>0){
                cursum=0;
                tempstart=i+1;
            }
        }
        System.out.println("Minimum Subarray value: "+minsum);
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
