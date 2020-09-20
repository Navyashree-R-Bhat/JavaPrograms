import java.util.Scanner;

public class assignment9 {

    public int method(int a, int b){
        int sum=a+b;
        int sq=sum*sum;
        return sq;
    }

    public int method(int a, int b,int c){
        int sum=a+b+c;
        int sq=sum*sum;
        return sq;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, b, x, y,z;
        System.out.println("Enter two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        assignment9 sq = new assignment9();
        int s1=sq.method(a,b);
        System.out.println("The square of sum of two numbers is: "+s1);

        System.out.println("Enter three numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        assignment9 sq2 = new assignment9();
        int s2=sq2.method(x,y,z);
        System.out.println("The square of sum of two numbers is: "+s2);



    }
}
