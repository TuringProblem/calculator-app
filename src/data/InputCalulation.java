package src.data;
import java.util.Scanner;
public class InputCalulation extends Data {
    public Scanner KEYBOARD = new Scanner(System.in);
    private final String SECONDPROMPT = "Would you like to use a double,\n float,\n or int?\n Please enter: ";
    private String input;

    public void addInput() {
        System.out.println(SECONDPROMPT);
        KEYBOARD.nextLine();
        if (isAddition()){
            if (isInteger()){
                System.out.println("Please enter the first value: ");
                setIntX(KEYBOARD.nextInt());
                System.out.println("Please enter the second value: ");
                setIntY(KEYBOARD.nextInt());
                System.out.println(add(getIntX(), getIntY()));
            } else if (isDouble()) {
                System.out.println("Please enter the first value: ");
                setX(KEYBOARD.nextDouble());
                System.out.println("Please enter the second value: ");
                setY(KEYBOARD.nextDouble());
                System.out.println(add(getX(), getY()));
            } else if (isFloat()) {
                System.out.println("Please enter the first value: ");
                setFloatX(KEYBOARD.nextFloat());
                System.out.println("Please enter the second value: ");
                setFloatY(KEYBOARD.nextFloat());
                System.out.println(add(getFloatX(), getFloatY()));
            } else {
                System.out.println("Invalid input.");
                System.exit(0);
            }
        }
    }
    public void subtractInput() {
        System.out.println(SECONDPROMPT);
        if (isSubtraction()) {
            if (isInteger()) {
                System.out.println("Please enter the first value: ");
                setIntX(KEYBOARD.nextInt());
                System.out.println("Please enter the second value: ");
                setIntY(KEYBOARD.nextInt());
                System.out.println(subtract(getIntX(), getIntY()));
            } else if (isDouble()) {
                System.out.println("Please enter the first value: ");
                setX(KEYBOARD.nextDouble());
                System.out.println("Please enter the second value: ");
                setY(KEYBOARD.nextDouble());
                System.out.println(subtract(getX(), getY()));
            } else if (isFloat()) {
                System.out.println("Please enter the first value: ");
                setFloatX(KEYBOARD.nextFloat());
                System.out.println("Please enter the second value: ");
                setFloatY(KEYBOARD.nextFloat());
                System.out.println(subtract(getFloatX(), getFloatY()));
            } else {
                System.out.println("Invalid input.");
                System.exit(0);
            }
        }
    }

    public void multiplyInput() {
        System.out.println(SECONDPROMPT);
        if (isMultiply()) {
            if (isInteger()) {
                System.out.println("Please enter the first value: ");
                setIntX(KEYBOARD.nextInt());
                System.out.println("Please enter the second value: ");
                setIntY(KEYBOARD.nextInt());
                System.out.println(multiply(getIntX(), getIntY()));
            } else if (isDouble()) {
                System.out.println("Please enter the first value: ");
                setX(KEYBOARD.nextDouble());
                System.out.println("Please enter the second value: ");
                setY(KEYBOARD.nextDouble());
                System.out.println(multiply(getX(), getY()));
            } else if (isFloat()) {
                System.out.println("Please enter the first value: ");
                setFloatX(KEYBOARD.nextFloat());
                System.out.println("Please enter the second value: ");
                setFloatY(KEYBOARD.nextFloat());
                System.out.println(multiply(getFloatX(), getFloatY()));
            } else {
                System.out.println("Invalid input.");
                System.exit(0);
            }
        }
    }

    public void divideInput() {
        double doubleSum = divide(getX(), getY());
        int intSum = divide(getIntX(), getIntY());
        
        if (isDivide()) {
            if (isInteger()){
                System.out.println("Please enter the first value: ");
                setIntX(KEYBOARD.nextInt());
                System.out.println("Please enter the second value: ");
                setIntY(KEYBOARD.nextInt());
                System.out.println(intSum);
            } else if(isDouble()) {
                System.out.println("Please enter the first value: ");
                setX(KEYBOARD.nextDouble());
                System.out.println("Please enter the second value: ");
                setY(KEYBOARD.nextDouble());
                System.out.println(divide(getX(), getY()));
            }
        }
    }



    public boolean isInteger() {
        input = KEYBOARD.nextLine().toLowerCase();
        if (input.equals("int")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDouble() {
        input = KEYBOARD.nextLine().toLowerCase();
        if (input.equals("double")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFloat() {
        input = KEYBOARD.nextLine().toLowerCase();
        if (input.equals("float")) {
            return true;
        } else {
            return false;
        }
    }
}
