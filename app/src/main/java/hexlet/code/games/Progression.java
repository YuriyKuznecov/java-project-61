package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MAX_LENGTH = 10;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_INT_10 = 10;

    public static void progression() {
        String questionMessage = "What number is missing in the progression?";
        String[][] questionAndAnswer = new String[Engine.MAX_ATTEMPT][2];
        for (var i = 0; i < Engine.MAX_ATTEMPT; i++) {
            var arrayLength = Utils.randomInt(MIN_LENGTH, MAX_LENGTH);
            var firstElement = Utils.randomInt(0, MAX_INT_10);
            var step = Utils.randomInt(0, MAX_INT_10);
            var numbers = createProgression(arrayLength, firstElement, step);
            var replaceIndex = Utils.randomInt(0, numbers.length - 1);
            questionAndAnswer[i][0] = getQuestion(numbers, replaceIndex);
            questionAndAnswer[i][1] = Integer.toString(numbers[replaceIndex]);
        }
        Engine.engine(questionMessage, questionAndAnswer);
    }

    private static String getQuestion(int[] numbers, int index) {
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

    private static int[] createProgression(int length, int first, int step) {
        int[] numbers = new int[length];
        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = first + i * step;
        }
        return numbers;
    }
}
