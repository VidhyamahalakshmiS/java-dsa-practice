import java.util.Scanner;
public class RightShiftArrayBy1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Before Right Shift: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=arr[arr.length-1];
        int i=arr.length-1;
        while(i>0){
            arr[i]=arr[i-1];
            i=i-1;
        }
        arr[i]=temp;
        System.out.println("After Right Shift: ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
            sc.close();
        }
    }
}
