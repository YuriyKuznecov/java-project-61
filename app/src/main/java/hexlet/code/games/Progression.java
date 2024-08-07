package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        do {
            var numbers = createProgression();
            var replaceIndex = (int) (Math.random() * numbers.length);
            StringBuilder question = new StringBuilder();
            String correctAnswer = Integer.toString(numbers[replaceIndex]);
            for (var i = 0; i < numbers.length; i++) {
                if (i == replaceIndex) {
                    question.append(".. ");
                } else {
                    question.append(numbers[i]).append(" ");
                }
            }
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scan.next();
            Engine.engine(answer, correctAnswer);
        } while (Engine.isCorrect && Engine.count < 3);
    }

    static int[] createProgression() {
        var arrayLength = (int) (Math.random() * 6) + 5;
        int[] numbers = new int[arrayLength];
        numbers[0] = (int) (Math.random() * 10);
        int step = (int) (Math.random() * 9) + 1;
        for (var i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + step;
        }
        return numbers;
    }
}
