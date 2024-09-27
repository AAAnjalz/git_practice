import java.util.Scanner;

public class Hello{
    public static void main(String args[]){
        System.out.println("Hello world");
        Scanner scnr = new Scanner(System.in);
        System.out.println("ENter your age");
        int age = scnr.nextInt();
        System.out.println(age);
    }
}