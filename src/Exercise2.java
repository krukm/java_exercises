//Write a code to perform basic math operations.

import java.util.Scanner;

public class Exercise2 {

    private static Double add(Double firstNum, Double secondNum) { return firstNum + secondNum; }

    private static Double subtract(Double firstNum, Double secondNum) { return firstNum - secondNum; }

    private static Double multiply(Double firstNum, Double secondNum) { return firstNum * secondNum; }

    private static Double divide(Double firstNum, Double secondNum) { return firstNum / secondNum; }

    public static void main(String[] args) {
        Double firstNum;
        Double secondNum;
        Double answer;
        Boolean cont;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter a number:");
            while (!scan.hasNextDouble()) {
                System.out.println("Please enter a valid number:");
                scan.next();
            }
            firstNum = scan.nextDouble();

            System.out.println("Please enter another number:");
            while (!scan.hasNextDouble()) {
                System.out.println("Please enter a valid number:");
                scan.next();
            }
            secondNum = scan.nextDouble();

            System.out.println("Enter a function(+, -, *, or /):");
            while (!scan.hasNext("[-+*/]")) {
                System.out.println("That's not a valid function!");
                scan.next().charAt(0);
            }
            char operator = scan.next().charAt(0);

            System.out.println("operator = " + operator);
            switch (operator) {
                case '+':
                    answer = Exercise2.add(firstNum, secondNum);
                    System.out.println(firstNum + " " + operator +
                            " " + secondNum + " = " + answer);
                    break;
                case '-':
                    answer = Exercise2.subtract(firstNum, secondNum);
                    System.out.println(firstNum + " " + operator +
                            " " + secondNum + " = " + answer);
                    break;
                case '*':
                    answer = Exercise2.multiply(firstNum, secondNum);
                    System.out.println(firstNum + " " + operator +
                            " " + secondNum + " = " + answer);
                    break;
                case '/':
                    if (firstNum != 0 && secondNum != 0) {
                        answer = Exercise2.divide(firstNum, secondNum);
                        System.out.println(firstNum + " " + operator +
                                " " + secondNum + " = " + answer);
                    } else {
                        System.out.println("Cannot divide by 0; please try another number:");
                    }
                    break;
                default:
                    System.out.println("Hopefully we don't get here!");
            }

            System.out.println("Do you want to try another equation(Y, N)?");
            if ("y".equals(scan.next().toLowerCase())) {
                cont = true;
            } else {
                cont = false;
            }
        } while (cont);
    }
}