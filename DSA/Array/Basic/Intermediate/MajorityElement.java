package DSA.Array.Intermediate;
import java.util.Scanner;
public class MajorityElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(majority(arr));
        sc.close();
    }
    static int majority(int []arr){
        int candidate=0;
        int count=0;
        for(int num:arr){
            if(count==0){
                candidate=num;
            }
            if(candidate==num){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        for(int num:arr){
            if(candidate==num){
                count++;
            }
        }
        if(count>arr.length/2){
            return candidate;
        }
        return -1;
    }
}
