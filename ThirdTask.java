import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 10;
        int b = 2;

        System.out.println("Kérem adja meg a matematikai művelet jelét (+, -, * vagy /): ");
        char type = scanner.next().charAt(0);

        mathematicalOperation(a, b, type);
    }

    private static void mathematicalOperation(int a, int b, char type) {
        int result = 0;

        if (type == '+') {
            result = a + b;
        } else if (type == '-') {
            result = a - b;
        } else if (type == '*') {
            result = a * b;
        } else if (type == '/') {
            result = a / b;
        }
        System.out.println(result);
    }
}
