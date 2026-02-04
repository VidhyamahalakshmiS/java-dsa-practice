package DSA.Sorting.Basic;
import java.util.Scanner;
public class MaxMinAfterSorting {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]);
        }
        System.out.println();
        int max=arr[arr.length-1];
        int min=arr[0];
        System.out.println("Maximum Element after Sorting: "+ max);
        System.out.println("Minimum Element after Sorting: "+min);
        sc.close();
    }
}
