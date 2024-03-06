import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 10;
        int b = 2;

        System.out.println("Kérem adja meg a matematikai művelet jelét (+, -, * vagy /): ");
        char type = scanner.next().charAt(0);

        int result = mathematicalOperation(a, b, type);
        System.out.println(result);
    }

    private static int mathematicalOperation(int a, int b, char type) {
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
        return result;
    }
}
