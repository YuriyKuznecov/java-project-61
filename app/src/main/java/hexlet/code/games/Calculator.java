package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Calculator {
    static String correctAnswer;
    public static void calc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        String op = "";
        do {
            var number1 = (int) (Math.random() * 100);
            var number2 = (int) (Math.random() * 100);
            var operator = (int) (Math.random() * 3);
            op = randomOperarator(number1, number2);
            System.out.println("Question: " + number1 + " " + op + " " + number2);
            System.out.print("Your answer: ");
            String answer = scan.next();
            Engine.engine(answer, correctAnswer);
        } while (Engine.isCorrect && Engine.count < 3);
        scan.close();
    }

    static String randomOperarator(int a, int b) {
        var op = (int) (Math.random() * 3);
        switch (op) {
            case 0 :
                correctAnswer = Integer.toString(a + b);
                return "+";
            case 1 :
                correctAnswer = Integer.toString(a - b);
                return "-";
            default:
                correctAnswer = Integer.toString(a * b);
                return "*";
        }
    }


}
