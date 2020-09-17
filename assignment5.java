import java.util.Scanner;
public class assignment5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no of rows:");
        n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
