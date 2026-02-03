package DSA.Searching.Basic;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int index=Linear(arr,target);
        if(index!=-1){
            System.out.println("Element Found at "+index);
        }else{
            System.out.println("Element not found");
        }
        sc.close();
    }
    static int Linear(int []arr,int target){
          for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
          }
          return -1;
    }
}
