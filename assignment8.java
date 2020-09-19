import java.util.Scanner;
public class assignment8 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int[][] arr1;
        int[][] arr2;
        int[][] arr3;
        int r1,c1,r2,c2;
        System.out.println("Enter the row and column size of first array: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        arr1=new int[r1][c1];
        System.out.println("Enter the elements of first array: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the row and column size of second array: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        arr2=new int[r2][c2];
        System.out.println("Enter the elements of second array: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        if(r1==r2&&c1==c2){
            arr3=new int[r1][c1];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    arr3[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            System.out.println("Sum of two arrays is: ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    System.out.print("  "+arr3[i][j]);
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Arrays cannot be added");
        }
    }
}
