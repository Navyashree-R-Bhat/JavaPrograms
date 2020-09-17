import java.util.Scanner;
public class assignment3 {
    public static void main(String[]args){
        int n, i=0, prev=0, next=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        n=sc.nextInt();
        while(i<=n){
            System.out.print(" "+prev);
            int sum = prev+next;
            prev = next;
            next = sum;
            i++;
        }
    }
}
