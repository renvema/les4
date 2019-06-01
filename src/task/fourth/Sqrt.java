package task.fourth;

public class Sqrt {
    public static void main(String[] args) {
        double result = sqrt(49);
        System.out.println(result);
    }

    public static double sqrt(double x) {
        if (x >= 0) {
            double sqrt = Math.sqrt(x);
            return sqrt;
        } else {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
    }
}
