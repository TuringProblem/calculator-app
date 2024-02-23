/**
 * @author Override
 * @since 02/22/2024 @21:06
 * @see <href="Github.com/TuringProblem">GitHub Profile</href="Github.com/TuringProblem">
 *
 */
abstract class Data implements Calculation {
    private double x;
    private double y;
    private int intX;
    private int intY;
    private float floatX;
    private float floatY;

    @Override
    public double multiply(double x, double y) {
        setValues(x, y);
        return x * y;
    }

    @Override
    public int multiply(int x, int y) {
        setIntValues(x, y);
        return x + y;
    }

    @Override
    public double divide(double x, double y) {
        setValues(x, y);
        return x / y;
    }
    @Override
    public int divide(int x, int y) {
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

    public void setX(double x) { this.x = x; }
    public double getX() { return x; }

    public void setY(double y) { this.y = y; }
    public double getY() { return y; }

    public void setIntX(int x) { this.intX = x; }
    public int getIntX() { return intX; }

    public void setIntY(int y) {this.intY = y; }
    public int getIntY() { return intY; }

    public void setFloatY(float y) { this.floatY = y; }
    public float getFloatY() { return floatY; }

    public void setFloatX(float x) { this.floatX = x;}
    public float getFloatX() { return floatX; }



    public boolean isDivide() { return true; }
    public boolean isMultiply() { return true; }
    public boolean isAddition() { return true; }
    public boolean isSubtraction() { return true; }
    public boolean isLogarithm() { return true; }
    public boolean isExponent() { return true; }

/*    @Override
    public String toString() {
        if (isDivide()) {
            return String.format("")
        }
    }*/
}

