
//second problem
import java.util.Scanner;

public class SampleCalculator {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String expression = scanner.nextLine();
            System.out.println(calculate(expression));
            scanner.close();
        } catch (Exception e) {
            System.err.println("You can use such templates \n2 + 4 = ?, \n2 + 4 = , \n2 + 4.");
        }
    }

    public static String calculate(String expression) throws Exception {
        String[] arrayWithOperands = expression.split(" ");
        int result_number = countwithOperator(arrayWithOperands);
        
        char last_char = expression.charAt(expression.length() - 1);
        if(last_char >= 48 && last_char <= 57)
        {
            return expression + " = " + result_number;
        }
        else if(last_char == '=' || last_char == '?'){
            return expression.substring(0, expression.length() - 1) + "= " + result_number;
        }
        else
        {
            throw new Exception("Valid expression");
        }
    }
    public static int countwithOperator(String[] result) throws Exception {
        int result_number;
        switch (result[1]) {
            case "+":
                result_number = Integer.parseInt(result[0]) + Integer.parseInt(result[2]);
                break;
            case "-":
                result_number = Integer.parseInt(result[0]) - Integer.parseInt(result[2]);
                break;
            case "*":
                result_number = Integer.parseInt(result[0]) * Integer.parseInt(result[2]);
                break;
            case "/":
                result_number = Integer.parseInt(result[0]) / Integer.parseInt(result[2]);
                break;
            default:
                throw new Exception("Valid operator");
        }
        return result_number;
    }
}
