package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Even {
    public static void event() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        do {
            var question = (int) (Math.random() * Engine.RANDOM_INT);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scan.next();
            String correctAnswer;
            if (question % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            Engine.engine(answer, correctAnswer);
        } while (Engine.getIsCorrect() && Engine.getCount() < Engine.MAX_COUNT);
    }

}
