import java.util.*;
public class WeatherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WeatherApp app = new WeatherApp();

        System.out.print("Enter temperature (Fahrenheit): ");
        double t = sc.nextDouble();
        System.out.print("Enter wind speed (mph): ");
        double s = sc.nextDouble();

        double result = app.calculateWindChill(t, s);
        System.out.printf("The wind chill temperature is: %.2f\n", result);
    }

    public double calculateWindChill(double temperature, double windSpeed) {
        // Math.pow is used for the exponent 0.16
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
