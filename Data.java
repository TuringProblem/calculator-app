/**
 * @author Override
 * @since 02/22/2024 @21:06
 * @see <href="Github.com/TuringProblem">GitHub Profile</href="Github.com/TuringProblem">
 *
 */
public class Data implements Calculation {
    private double x;
    private double y;
    private int intX;
    private int intY;

    @Override
    public double multiply(double x, double y) {
        setValues(x, y);
        return x * y;
    }

    @Override
    public int calculate(int x, int y) {
        setIntValues(x, y);
        return x + y;
    }

    @Override
    public double divide(int x, int y) {
        setIntValues(x, y);
        return x / y;
    }

    public void setValues(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setIntValues(int x, int y){
        this.intX = x;
        this.intY = y;
    }
    public double getX() { return x;}
    public double getY() { return y;}
    public int getIntX() { return intX; }
    public int getIntY() { return intY;}

    public boolean isDivide() {
            return true;
    }
    public boolean isMultiply() {
        return true;
    }
    public boolean isAddition() {
        return true;
    }

    @Override
    public String toString() {
        if (isDivide()) {
            return String.format("")
        }
    }
}

