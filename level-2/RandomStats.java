public class RandomStats {
    public static void main(String[] args) {
        RandomStats rs = new RandomStats();
        int[] randomNumbers = rs.generate4DigitRandomArray(5);
        double[] stats = rs.findAverageMinMax(randomNumbers);

        System.out.println("Average: " + stats[0]);
        System.out.println("Min: " + stats[1]);
        System.out.println("Max: " + stats[2]);
    }

    // Generates an array of size 'size' with numbers between 1000 and 9999
    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }
        return arr;
    }

    // Calculates [Average, Minimum, Maximum]
    public double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) return new double[0];

        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[]{average, (double) min, (double) max};
    }
}

