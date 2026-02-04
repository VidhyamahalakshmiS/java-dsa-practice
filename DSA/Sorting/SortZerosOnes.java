package DSA.Sorting.Basic;
import java.util.Scanner;
public class SortZerosOnes {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int zercount=0;
        for(int num:arr){
            if(num==0){
                zercount++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zercount){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        System.out.println("After Sorting: ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        sc.close();
    }
}
