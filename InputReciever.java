import java.util.Scanner;
public class InputReciever extends Data {
    //currently not done
    public static Scanner KEYBOARD = new Scanner(System.in);

    public void input() {
        String option;
        System.out.println("Welcome to the calculator!\n do you want wish to add,\n subtract,\n multiply,\n or divide?\n Please enter: ");
        option = KEYBOARD.nextLine().toLowerCase();
        if (option.equals("add")) {

        } else if (option.equals("subtract")) {

        } else if (option.equals("multiply")){
            System.out.println("would you prefer a double, int, or float?");
            String input = KEYBOARD.nextLine().toLowerCase();
            if (input.equals("double")) {
                System.out.println("Please enter the first value: ");
                setX(KEYBOARD.nextDouble());
                System.out.println("Please enter the second value: ");
                setY(KEYBOARD.nextDouble());
                setValues(getX(), getY());
                System.out.println(multiply(getX(), getY()));
            } else if (input.equals("int")) {

            } else if (input.equals("float")) {

            } else {
                System.out.println("Invalid input");
                System.exit(0);
            }
        }



    }



}
