package src.data;

import java.util.Scanner;
public class InputReciever extends Data {
    //currently not done
    public static Scanner KEYBOARD = new Scanner(System.in);
    String result;
    InputCalulation calc = new InputCalulation();

    public void input() {
        final String PROMPT = "***Welcome to the calculator!***\n [do you want wish to add]\n [subtract]\n [multiply],\n [or divide]\n Please enter: ";
        System.out.println(PROMPT);
        result = KEYBOARD.nextLine().toLowerCase();
        if (result.equals("add")) {
            calc.addInput();
        } else if (result.equals("subtract")) {
            calc.subtractInput();
        }
    }



}
