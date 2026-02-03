import java.util.Scanner;
public class EvenOddCount {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
       System.out.println("Even count "+even);
       System.out.println("Odd count "+odd);
       sc.close();
    }
}
