package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int RANDOM_INT = 100;
    public static final int MAX_ATTEMPT = 3;

    public static  void engine(String questionMessage, String[] question, String[] correctAnswer) {
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
                System.out.print("""
                        '%s' is wrong answer :(. Correct answer was '%s'.
                        Let's try again, %s!
                        """.formatted(answer, correctAnswer[i], Cli.getUserName()));
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
}
