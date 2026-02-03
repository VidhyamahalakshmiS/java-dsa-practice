import java.util.Scanner;
public class LengthOfArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            count++;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Length of the Array: "+count);
        sc.close();
    }
}
