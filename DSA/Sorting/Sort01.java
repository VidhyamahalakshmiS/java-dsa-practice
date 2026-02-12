package DSA.Sorting.Basic;
import java.util.Scanner;
public class Sort01 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=arr.length-1;
        for(int i=0;i<n;i++){
            if(arr[left]==1){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                right--;
            }else{
                left++;
            }
        }
        System.out.println("After Sorting: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
