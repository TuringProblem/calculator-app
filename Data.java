public class Data implements Calculation {
    private double x;
    private double y;
    private int intX;
    private int intY;
    @Override
    public double calculateDouble(double x, double y) {
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
}

