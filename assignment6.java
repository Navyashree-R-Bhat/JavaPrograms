import java.util.Scanner;
public class assignment6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int sum=0,n;
        float avg;
        System.out.println("Enter array size:");
        n=sc.nextInt();
        arr= new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        avg=(float)sum/n;
        System.out.println("Sum of the given array is: "+sum);
        System.out.println("Average of the given array is: "+avg);
    }
}
