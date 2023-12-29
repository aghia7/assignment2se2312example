package helpers;

public class Calculation {
    private Calculation() {}

    public static double sum(Iterable<Double> data) {
        double s = 0;
        for (double item : data)
            s += item;

        return s;
    }

    public static double heron(double a, double b, double c) {
        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
