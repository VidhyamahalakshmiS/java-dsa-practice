import java.util.Scanner;
public class PosNegZerCount {
    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int []arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int pos=0;
      int neg=0;
      int zer=0;
      for(int i=0;i<n;i++){
        if(arr[i]==0){
            zer++;
        }
        else if(arr[i]>0){
            pos++;
        }
        else{
            neg++;
        }
      }
      System.out.println("Positives "+pos);
      System.out.println("Negative "+neg);
      System.out.println("Zeros "+zer);
      sc.close();
    }

}
