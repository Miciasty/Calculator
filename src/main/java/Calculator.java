package src.main.java;

import src.main.java.methods.menu;

import java.util.Scanner;

public class Calculator {

    private double base = 0;

    private void setBase(double b) { this.base = b; }
    public double getBase() { return this.base; }

    public Calculator() {
        SessionInstance.setInstance(this);
        new menu();
    }

    public static void main(String[] args) {

        new Calculator();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            SessionInstance.getInstance().CommandHandler(input);
        }

    }

    private void CommandHandler(String input) {
        String[] args = input.split(" ");
        String command = args[0];
    }

}
