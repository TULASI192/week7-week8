
public class Quadratic {

    public static void main(String[] args) {

        // Example: x^2 - 5x + 6 = 0
        double[] roots = findRoots(1, -5, 6);

        for (double r : roots) {
            System.out.println("Root: " + r);
        }
    }

    public static double[] findRoots(double a, double b, double c) {

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};

        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};

        } else {
            System.out.println("No real roots");
            return new double[]{};
        }
    }
}