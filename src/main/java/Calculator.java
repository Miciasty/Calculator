package src.main.java;

import src.main.java.methods.menu;

public class Calculator {

    public Calculator() {
        SessionInstance.setInstance(this);
        new menu();
    }

    public static void main(String[] args) {

        new Calculator();

    }

}
