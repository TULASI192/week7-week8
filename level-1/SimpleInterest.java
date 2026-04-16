import java.util.Scanner;
//leve1 
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("something");
//level1
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = sc.nextDouble();

        double interest = calculateInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + interest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time);
        sc.close();
    }

    // Method to calculate simple interest
    public static double calculateInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}