import java.util.Scanner;
public class assignment1 {
    public static void main(String[]args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a = sc.nextInt();
        if(a%2==0){
            if(a>=2 && a<=5){
                System.out.println("Not Weird");
            }
            else if(a>=6 && a<=20){
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        }
    }
}
