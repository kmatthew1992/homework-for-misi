import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 10;

        int b = 2;

        System.out.println("Kérem adja meg a metamatikai művelet jelét(+ , -, * vagy /): ");
        char type = scanner.next().charAt(0);

        if(type == '+') {
            int sum = a + b;
            System.out.println(sum);
        } else if (type == '-') {
            int subtraction = a - b;
            System.out.println(subtraction);
        } else if (type == '*') {
            int multiplication = a * b;
            System.out.println(multiplication);
        } else if (type == '/'){
            int division = a / b;
            System.out.println(division);
        }
    }
}
