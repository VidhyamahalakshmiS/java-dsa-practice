package DSA.Sorting.Basic;
import java.util.Scanner;
import java.util.Arrays;
public class FirstAscSechalfDes {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int mid=n/2;
        int i=mid;
        int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        sc.close();
    }
}
