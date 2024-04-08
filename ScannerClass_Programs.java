import java.util.Scanner;

public class ScannerClass_Programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First numbers: ");
        int first = sc.nextInt();
        System.out.println("Enter Second numbers: ");
        int second = sc.nextInt();
        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;
        System.out.println("The Addition of the two numbers is: "+add);
        System.out.println("The Subtraction of the two numbers is: "+sub);
        System.out.println("The Multiplication of the two numbers is: "+mul);
        System.out.println("The Division of the two numbers is: "+div);
        System.out.println("The Modulus of the two numbers is: "+mod);
    }       
}
