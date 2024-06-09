package src.main.java.methods;

import src.main.java.SessionInstance;

public class Menu {

    private final double base = SessionInstance.getInstance().getBase();
    private double saved = 0;

    public void Save() {
        this.saved = base;
    }

    public double Load() {
        return this.saved;
    }

    public double Add(double i) {
        return base + i;
    }

    public double Subtract(double i) {
        return base - i;
    }

    public double Multiply(double i) {
        return base * i;
    }

    public double Divide(double i) {
        if(i != 0) {
            return this.base / i;
        } else {
            throw new IllegalArgumentException("You can not divide by 0! :(");
        }
    }
}
