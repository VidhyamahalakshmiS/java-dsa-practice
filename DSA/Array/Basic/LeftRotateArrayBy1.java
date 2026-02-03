import java.util.Scanner;
public class LeftRotateArrayBy1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Before Left shift: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=arr[0];
        int i=0;
        while(i<arr.length-1){
           arr[i]=arr[i+1];
           i=i+1;
        }
        arr[i]=temp;
        System.out.println("After Left shift: ");
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }
}
