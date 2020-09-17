import java.util.Scanner;
public class assignment2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter an expression");
        char n = sc.next().charAt(0);
        switch(n){
            case '+':
                System.out.println("Sum:"+(a+b));
                break;
            case '-':
                System.out.println("Difference:"+(a-b));
                break;
            case '*':
                System.out.println("Product:"+(a*b));
                break;
            case '/':
                if(b==0){
                    System.out.println("A number cannot be divided by zero");
                }
                else {
                    System.out.println("Quotient:"+(a/b));
                }
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
