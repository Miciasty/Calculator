package src.main.java.methods;

import src.main.java.Calculator;
import src.main.java.SessionInstance;

public class Menu {

    private final Calculator base = SessionInstance.getInstance();
    private double saved = 0;

    public void Save() {
        this.saved = base.getBase();
    }

    public double Load() {
        return this.saved;
    }

    public void Add(double i) {
        base.setBase( base.getBase() + i );
    }

    public void Subtract(double i) {
        base.setBase( base.getBase() - i );
    }

    public void Multiply(double i) {
        base.setBase( base.getBase() * i );
    }

    public void Divide(double i) {
        if(i != 0) {
            base.setBase( base.getBase() / i );
        } else {
            throw new IllegalArgumentException("You can not divide by 0! :(");
        }
    }
}
