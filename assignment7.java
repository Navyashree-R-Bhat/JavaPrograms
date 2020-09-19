import java.util.Scanner;
public class assignment7 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int[] arr;
        int n;
        System.out.println("Enter array size:");
        n=sc.nextInt();
        arr= new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting the elements are: ");
        for(int i=0;i<n;i++){
            System.out.println("  "+arr[i]);
        }
    }
}
