import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the Time: ");
        double time = sc.nextDouble();
        System.out.println("Enter the Rate: ");
        double rate = sc.nextDouble();
        //double result = principal * Math.pow((1 + rate), time);
        double si = (principal*rate*time)/100;
        System.out.println("Simple Interest : "+si);
    }
}
