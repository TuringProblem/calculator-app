package src.data;

import java.util.Scanner;

public class InputReciever {
    //currently not done
    public static Scanner KEYBOARD = new Scanner(System.in);
    String result;
    InputCalulation calc = new InputCalulation();

    public void input() {

        inputHandler(result);
        if (result.equals("add")) {
            calc.addInput();
        }
        if (result.equals("subtract")) {
            calc.subtractInput();
        }
        if (result.equals("multiply")) {
            calc.multiplyInput();
        }
        if (result.equals("divide")) {
            calc.divideInput();
        } else {
            System.out.println("Invalid input.");
            System.exit(0);
        }

    }

    public void getInput() {
        final String PROMPT = "***Welcome to the calculator!***\n do you want wish to:\n [add]\n [subtract]\n [multiply],\n [or divide]\n Please enter: ";
        System.out.println(PROMPT);
        inputHandler(KEYBOARD.nextLine().toLowerCase());
        input();
    }

    public void inputHandler(String input) {
        try {
            switch(input) {
                case "add":
                    result = "add";
                    break;
                case "subtract":
                    result = "subtract";
                    break;
                case "divide":
                    result = "divide";
                    break;
                case "multiply":
                    result = "multiply";
                    break;
                default:
                    System.out.println("Invalid input.");
                    System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("An error occured: " + e);
        }

    }


}
