package DSA.Array.Intermediate;
import java.util.Scanner;
public class FirstOccurenceOfElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("First Occurence of element: "+i);
                return;
            }
        }
        sc.close();
    }
}
