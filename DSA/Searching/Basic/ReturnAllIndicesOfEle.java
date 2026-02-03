package DSA.Searching.Basic;
import java.util.Scanner;
import java.util.ArrayList;
public class ReturnAllIndicesOfEle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        ArrayList<Integer> result=search(arr,target);
        System.out.println(result);
        sc.close();
    }
    static ArrayList<Integer> search(int []arr,int target){
         ArrayList<Integer> list=new ArrayList<>();
         for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                list.add(i);
            }
         }
         return list;
    }
}
