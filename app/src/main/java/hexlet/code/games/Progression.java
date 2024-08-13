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
        } while (Engine.getIsCorrect() && Engine.getCount() < Engine.MAX_COUNT);
    }

    static int[] createProgression() {
        final int constLength1 = 6;
        final int constLength2 = 5;
        final int constFirstElement = 10;
        final int constStep = 9;

        var arrayLength = (int) (Math.random() * constLength1) + constLength2;
        int[] numbers = new int[arrayLength];
        numbers[0] = (int) (Math.random() * constFirstElement);
        int step = (int) (Math.random() * constStep) + 1;
        for (var i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + step;
        }
        return numbers;
    }
}
