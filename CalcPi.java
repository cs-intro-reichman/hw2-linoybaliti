public class CalcPi {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CalcPi <number of terms>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        double sum = 0.0;

        // Gregory-Leibniz series
        for (int i = 0; i < n; i++) {
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) sum += term;
            else sum -= term;
        }

        double approxPi = 4 * sum;

        // Exact formatting match: 5 spaces + 16 digits after decimal
        System.out.println("pi according to Java: 3.141592653589793");
        System.out.printf("pi, approximated:     %.16f%n", approxPi);
    }
}
