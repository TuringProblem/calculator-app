package src.data;

import java.util.Scanner;

public class InputCalulation extends Data {
    public Scanner KEYBOARD = new Scanner(System.in);
    private String input;
    private final String valuePrompt = "Please enter the first value: ";
    private final String secondValuePrompt = "Please enter the second value: ";


    public void additionalPrompt() {
        try {
            final String secondPrompt = "Would you like to use:\n [a double]\n [float]\n or [int]?\n Please enter: ";
            System.out.println(secondPrompt);
            setInput(KEYBOARD.nextLine());
        } catch (Exception e) {
            System.out.println("An error occured: " + e);
        }
    }

    public void setInput(String input) {
        this.input = input;
    }
    public String getInput() {
        return input;
    }
    // need to switch this, and implement methods for the calculations isInt() -> isDouble() -> isFloat() etc.
    public void addInput() {
        if (isAddition()) {
            additionalPrompt();
            if (isInteger()) {
                System.out.println(valuePrompt);
                setIntX(KEYBOARD.nextInt());
                System.out.println(secondValuePrompt);
                setIntY(KEYBOARD.nextInt());
                int intSum = add(getIntX(), getIntY());
                System.out.println(intSum);
            } else if (isDouble()) {
                System.out.println(valuePrompt);
                setX(KEYBOARD.nextDouble());
                System.out.println(secondValuePrompt);
                setY(KEYBOARD.nextDouble());
                double doubleSum = add(getX(), getY());
                System.out.println(doubleSum);
            } else if (isFloat()) {
                System.out.println(valuePrompt);
                setFloatX(KEYBOARD.nextFloat());
                System.out.println(secondValuePrompt);
                setFloatY(KEYBOARD.nextFloat());
                System.out.println(add(getFloatX(), getFloatY()));
            } else {
                System.out.println("Invalid input.");
                System.exit(0);
            }
        }
    }

    public void subtractInput() {
        if (isSubtraction()) {
            additionalPrompt();
            if (isInteger()) {
                System.out.println(valuePrompt);
                setIntX(KEYBOARD.nextInt());
                System.out.println(secondValuePrompt);
                setIntY(KEYBOARD.nextInt());
                int intSum = subtract(getIntX(), getIntY());
                System.out.println(intSum);
            } else if (isDouble()) {
                System.out.println(valuePrompt);
                setX(KEYBOARD.nextDouble());
                System.out.println(secondValuePrompt);
                setY(KEYBOARD.nextDouble());
                double doubleSum = subtract(getX(), getY());
                System.out.println(doubleSum);
            } else if (isFloat()) {
                System.out.println(valuePrompt);
                setFloatX(KEYBOARD.nextFloat());
                System.out.println(secondValuePrompt);
                setFloatY(KEYBOARD.nextFloat());
                System.out.println(subtract(getFloatX(), getFloatY()));
            } else {
                System.out.println("Invalid input.");
                System.exit(0);
            }
        }
    }

    public void multiplyInput() {
        if (isMultiply()) {
            additionalPrompt();
            if (isInteger()) {
                System.out.println(valuePrompt);
                setIntX(KEYBOARD.nextInt());
                System.out.println(secondValuePrompt);
                setIntY(KEYBOARD.nextInt());
                int intSum = multiply(getIntX(), getIntY());

                System.out.println(intSum);
            } else if (isDouble()) {
                System.out.println(valuePrompt);
                setX(KEYBOARD.nextDouble());
                System.out.println(secondValuePrompt);
                setY(KEYBOARD.nextDouble());
                double doubleSum = multiply(getX(), getY());
                System.out.println(doubleSum);
            } else if (isFloat()) {
                System.out.println(valuePrompt);
                setFloatX(KEYBOARD.nextFloat());
                System.out.println(secondValuePrompt);
                setFloatY(KEYBOARD.nextFloat());
                System.out.println(multiply(getFloatX(), getFloatY()));
            } else {
                System.out.println("Invalid input.");
                System.exit(0);
            }
        }
    }

    public void divideInput() {
        if (isDivide()) {
            additionalPrompt();
            if (isInteger()) {
                System.out.println(valuePrompt);
                setIntX(KEYBOARD.nextInt());
                System.out.println(secondValuePrompt);
                setIntY(KEYBOARD.nextInt());
                int intSum = divide(getIntX(), getIntY());
                System.out.println(intSum);
            } else if (isDouble()) {
                System.out.println(valuePrompt);
                setX(KEYBOARD.nextDouble());
                System.out.println(secondValuePrompt);
                setY(KEYBOARD.nextDouble());
                double doubleSum = divide(getX(), getY());
                System.out.println(doubleSum);
            }
        }
    }


    public boolean isInteger() {
        getInput();
        if (getInput().equals("int")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDouble() {
        getInput();
        if (getInput().equals("double")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFloat() {
        getInput();
        if (getInput().equals("float")) {
            return true;
        } else {
            return false;
        }
    }

}
