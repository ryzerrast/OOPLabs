import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    private static final double a = 16.5;
    private static final double b = 3.4;
    private static final double x = 0.61;

    private static double calculateS(double x, double a, double b) {
        return Math.pow(x, 3) * Math.pow(Math.tan(x + b), 2) * Math.pow((x + b), 2) + a / Math.sqrt(x + b);
    }

    private static double calculateQ(double x, double a, double b) {
        return (b * Math.pow(x, 2) - a) / (Math.exp(a * x) - 1);
    }

    private static void print() {
        double resultS = calculateS(x, a, b);
        double resultQ = calculateQ(x, a, b);

        System.out.println("Результат обчислення методу calculateS:");
        System.out.println("s = " + resultS);
        System.out.println("Результат обчислення методу calculateQ:");
        System.out.println("Q = " + resultQ);
    }

    private static void printDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println("Поточна дата і час: " + formattedDateTime);
    }

    private static void inputInitialValues() {
        System.out.println("Початкові значення:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);
    }

    private static void run() {
        inputInitialValues();
        print();
        printDateTime();
    }

    public static void main(String[] args) {
        run();
    }
}
