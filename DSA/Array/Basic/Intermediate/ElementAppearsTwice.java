package DSA.Array.Intermediate;
import java.util.Scanner;
import java.util.HashSet;
public class ElementAppearsTwice {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(FindDup(arr));
        sc.close();
    }
    static int FindDup(int []arr){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}
