package DSA.Array.Intermediate;
import java.util.Scanner;  
  // Kadane's Algorithm
public class MaxSubarray {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        int tempstart=0;
        for(int i=0;i<arr.length;i++){
            cursum+=arr[i];
            if(cursum>maxsum){
                maxsum=cursum;
                start=tempstart;
                end=i;
            }
            if(cursum<0){
                cursum=0;
                tempstart=i+1;
            }
        }
        System.out.println("Maximum Subarray is: "+maxsum);
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
