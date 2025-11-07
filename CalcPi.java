public class CalcPi {
    public static void main(String[] args) {
        // Check for a valid command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java CalcPi <number of terms>");
            return;
        }

        int n = Integer.parseInt(args[0]); // number of terms
        double sum = 0.0;

        // Gregory-Leibniz series: π/4 = 1 - 1/3 + 1/5 - 1/7 + ...
        for (int i = 0; i < n; i++) {
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                sum += term;  // add when i is even
            } else {
                sum -= term;  // subtract when i is odd
            }
        }

        double approxPi = 4 * sum;

        // Output results
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + approxPi);
    }
}
