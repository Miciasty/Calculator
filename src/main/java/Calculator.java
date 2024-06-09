package src.main.java;

import src.main.java.methods.Menu;

import java.util.Scanner;

public class Calculator {

    private double base = 0;

    private void setBase(double b) { this.base = b; }
    public double getBase() { return this.base; }

    public Calculator() {
        SessionInstance.setInstance(this);
    }

    private void showMenu() {
        StringBuilder menu = new StringBuilder();

        menu.append("\n")
                .append("[Calculator]\n")
                .append("Math Commands:\n")
                .append("- 'add'        {number}\n")
                .append("- 'subtract'   {number}\n")
                .append("- 'multiply'   {number}\n")
                .append("- 'divide'     {number}\n")
                .append("Memory Commands:\n")
                .append("- 'save'\n")
                .append("- 'load'\n")
                .append("Other commands:\n")
                .append("- 'result'\n")
                .append("- 'exit'\n");

        this.systemMessage(menu.toString());
    }

    public static void main(String[] args) {

        new Calculator();
        SessionInstance.getInstance().showMenu();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            SessionInstance.getInstance().CommandHandler(input);
            SessionInstance.getInstance().result();
        }

    }

    public void result() {
        systemMessage("Result: " + this.getBase());
    }

    public void systemMessage(String m) {
        System.out.println(m);
    }

    public void systemError(Exception e) {
        System.out.println(e.getMessage());
    }

    private void CommandHandler(String input) {
        String[] args = input.split(" ");
        String command = args[0];

    }

}
