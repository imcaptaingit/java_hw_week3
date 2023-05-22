package java_homework_week_3_ss;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class P10OperationsWithSymbol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number : ");
        int x = scanner.nextInt();
        System.out.println("Input the second number : ");
        int y = scanner.nextInt();
        System.out.println("Please select the calculation Method  +, -, *, / : ");
        char symbol = scanner.next().charAt(0);
        doOperationBySelectingSymbol(x, y, symbol);

        scanner.close();
    }
    public static void doOperationBySelectingSymbol(int x, int y, char symbol) {
        if (symbol == '+') {
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if (symbol == '-') {
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if (symbol == '*') {
            System.out.println(x + " x " + y + " = " + (x * y));
        } else if (symbol == '/') {
            System.out.println(x + " / " + y + " = " + (x / y));
        } else {
            System.out.println("Please enter correct symbol for calculation +,-,*,/");
        }
    }
}