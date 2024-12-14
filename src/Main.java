import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true)
                System.out.println(calc(scanner.nextLine()));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static String calc(String input) throws Exception {
        String[] operation = input.strip().split(" ");
        if (operation.length != 3) {
            throw new Exception("Invalid format");
        }

        int result = 0;
        String operand = operation[1];
        int term1 = Integer.parseInt(operation[0]);
        int term2 = Integer.parseInt(operation[2]);
        if (!"+-*/".contains(operand)){
            throw new Exception("Not a mathematical operation");
        }
        result = switch (operand) {
            case ("+") -> term1 + term2;
            case ("-") -> term1 - term2;
            case ("*") -> term1 * term2;
            case ("/") -> term1 / term2;
            default -> result;
        };
        return String.valueOf(result);
    }
}
