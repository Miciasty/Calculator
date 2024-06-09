package src.main.java.methods;

public class menu {

    private double saved = 0;
    private double base;

    public void Save() {
        this.saved = this.base;
    }

    public double Load() {
        return this.saved;
    }

    public double Add(double i) {
        return this.base + i;
    }

    public double Subtract(double i) {
        return this.base - i;
    }

    public double Multiply(double i) {
        return this.base * i;
    }

    public double Divide(double i) {
        if(i != 0) {
            return this.base / i;
        } else {
            throw new IllegalArgumentException("You can not divide by 0! :(");
        }
    }
}
