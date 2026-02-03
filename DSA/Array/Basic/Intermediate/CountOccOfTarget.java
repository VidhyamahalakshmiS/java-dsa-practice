package DSA.Array.Intermediate;
import java.util.Scanner;
public class CountOccOfTarget {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(count(arr,target));
        sc.close();
    }
    static int count(int []arr,int target){
        int count=0;
        for(int num:arr){
            if(num==target)
            count++;
        }
        return count;
    }
}
