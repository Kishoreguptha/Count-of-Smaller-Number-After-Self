import java.util.Arrays;
import java.util.Scanner;

public class CounterSmall {
    public static int[] countSmall(int arr[],int n) {
        int d[]=new int[arr.length];
        for(int i=0;i<n;i++) {
            d[i]=0;
            for(int j=i+1;j<n;j++) {
                if (arr[j] < arr[i]) {
                    d[i]++;
                }
            }
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int[] value=countSmall(arr,n);
        System.out.println(Arrays.toString(value));

    }

}