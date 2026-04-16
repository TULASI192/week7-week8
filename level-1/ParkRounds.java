public class ParkRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of side 1 (meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter length of side 2 (meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter length of side 3 (meters): ");
        double side3 = sc.nextDouble();

        double roundsNeeded = computeRounds(side1, side2, side3);

        System.out.println("The athlete must complete " + Math.ceil(roundsNeeded) + " rounds.");
    }

    // Method to compute rounds needed for 5km
    public static double computeRounds(double s1, double s2, double s3) {
        double perimeter = s1 + s2 + s3;
        double totalDistance = 5000; // 5km in meters
        return totalDistance / perimeter;
    }
}

