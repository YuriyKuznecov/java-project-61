package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int RANDOM_INT = 100;
    public static final int MAX_ATTEMPT = 3;
    public static String questionMessage;

    public static  void engine(String[] question, String[] correctAnswer) {
        Cli.greeting();
        Scanner scan = new Scanner(System.in);
        System.out.println(questionMessage);
        for (var i = 0; i < MAX_ATTEMPT; i++) {
            System.out.println("Question: " + question[i]);
            System.out.print("Your answer: ");
            String answer = scan.next();
            if (answer.equals(correctAnswer[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer :(. Correct answer was '" + correctAnswer[i] + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
}
