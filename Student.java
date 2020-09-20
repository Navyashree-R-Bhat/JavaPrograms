import java.util.Scanner;

public class Student {
    Student(){
        System.out.println("Name : Unknown");
    }
    Student(int a, String b){
        System.out.println("Name : "+b);
        System.out.println("Roll number : "+a);
    }

    public static void main(String[] args) {
        Student std=new Student();
        Student std1=new Student(201,"Bob");
    }
}
