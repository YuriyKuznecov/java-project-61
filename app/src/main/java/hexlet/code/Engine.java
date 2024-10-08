package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_INT_100 = 100;
    public static final int MAX_ATTEMPT = 3;

    public static  void engine(String questionMessage, String[][] questionAndAnswer) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var userName = scan.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(questionMessage);
        for (var i = 0; i < MAX_ATTEMPT; i++) {
            System.out.println("Question: " + questionAndAnswer[i][0]);
            System.out.print("Your answer: ");
            String answer = scan.next();
            if (answer.equals(questionAndAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("""
                '%s' is wrong answer :(. Correct answer was '%s'.
                Let's try again, %s!\s""", answer, questionAndAnswer[i][1], userName);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
