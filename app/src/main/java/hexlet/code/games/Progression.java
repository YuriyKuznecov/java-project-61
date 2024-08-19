package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MAX_LENGTH = 10;
    private static final int MIN_LENGTH = 5;;
    private static final int MAX_INT_10 = 10;

    public static void progression() {
        String questionMessage = "What number is missing in the progression?";
        String[] question = new String[Engine.MAX_ATTEMPT];
        String[] correctAnswer = new String[Engine.MAX_ATTEMPT];
        for (var i = 0; i < Engine.MAX_ATTEMPT; i++) {
            var arrayLength = Utils.randomInt(MIN_LENGTH, MAX_LENGTH);
            var firstElement = Utils.randomInt(0, MAX_INT_10);
            var step = Utils.randomInt(0, MAX_INT_10);
            var numbers = createProgression(arrayLength, firstElement, step);
            var replaceIndex = Utils.randomInt(0, numbers.length - 1);
            correctAnswer[i] = Integer.toString(numbers[replaceIndex]);
            question[i] = getQuestion(numbers, replaceIndex);
        }
        Engine.engine(questionMessage, question, correctAnswer);
    }

    static String getQuestion(int[] numbers, int index) {
        StringBuilder result = new StringBuilder();
        for (var i = 0; i < numbers.length; i++) {
            if (i == index) {
                result.append(".. ");
            } else {
                result.append(numbers[i]).append(" ");
            }
        }
        return result.toString();
    }

     static int[] createProgression(int length, int first, int step) {
        int[] numbers = new int[length];
        numbers[0] = first;
        for (var i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + step;
        }
        return numbers;
    }
}
