package src.data;

import java.util.Scanner;
public class InputReciever extends Data {
    //currently not done
    public static Scanner KEYBOARD = new Scanner(System.in);
    String result;
    InputCalulation calc = new InputCalulation();

    public void input() {
        inputHandler();
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

    public void inputHandler() {
        final String PROMPT = "***Welcome to the calculator!***\n do you want wish to:\n [add]\n [subtract]\n [multiply],\n [or divide]\n Please enter: ";
        System.out.println(PROMPT);
        String userInput = KEYBOARD.nextLine();
        if (userInput.equals("add") || userInput.equals("a")) {
            result = "add";
        }
        if (userInput.equals("subtract") || userInput.equals("s")) {
            result = "sub";
        }
        if (userInput.equals("divide") || userInput.equals("d")) {
            result = "divide";
        }
        if (userInput.equals("multiply") || userInput.equals("m")) {
            result = "multiply";
        }
    }



}
