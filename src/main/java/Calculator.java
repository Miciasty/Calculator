package src.main.java;

import src.main.java.methods.Menu;

import java.util.Scanner;

public class Calculator {

    private double base = 0;
    private Menu menu;

    public void setBase(double b) { this.base = b; }
    public double getBase() { return this.base; }

    public Calculator() {
        SessionInstance.setInstance(this);

        menu = new Menu();
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

    public boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void CommandHandler(String input) {
        String[] args = input.split(" ");
        String command = args[0];

        if (args.length > 1 && isNumeric(args[1])) {
            double value = Double.parseDouble(args[1]);

            switch (command) {
                case "add":
                    menu.Add(value); break;

                case "subtract":
                    menu.Subtract(value); break;

                case "multiply":
                    menu.Multiply(value); break;

                case "divide":
                    menu.Divide(value); break;

                default:
                    this.systemMessage("Unknown command."); break;
            }
        } else {
            this.systemMessage("Unknown command.");
        }
    }

}
