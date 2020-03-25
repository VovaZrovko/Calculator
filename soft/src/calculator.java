import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, it's Calculator(input numbers through space)");
        String inputed_text = input.nextLine();
        String[] text_divited = inputed_text.split(" ");
        double first_number = Double.parseDouble(text_divited[0]);
        double second_number = Double.parseDouble(text_divited[2]);
        double result=0;

        switch(text_divited[1]){
            case "+":
            result = first_number+second_number;
            break;
            case "-":
                result = first_number-second_number;
                break;
            case "*":
                result = first_number*second_number;
                break;
            case "/":
                result =second_number == 0 ? 0: first_number/second_number;
                break;
            case "%":
                result = first_number%second_number;
                break;
            default:
                System.out.println("Error input or this function doesn't exist");
                break;
        }
        System.out.printf(" = " + result);

    }

}
