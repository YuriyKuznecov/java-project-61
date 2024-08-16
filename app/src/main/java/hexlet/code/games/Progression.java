package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int CONST_LENGTH_1 = 6;
    private static final int CONST_LENGTH_2 = 5;
    private static final int CONST_FIRST_ELEMENT = 10;
    private static final int CONST_STEP = 9;

    public static void progression() {
        Engine.questionMessage = "What number is missing in the progression?";
        String[] question = new String[Engine.MAX_ATTEMPT];
        String[] correctAnswer = new String[Engine.MAX_ATTEMPT];
        for (var i = 0; i < Engine.MAX_ATTEMPT; i++) {
            var numbers = createProgression();
            var replaceIndex = (int) (Math.random() * numbers.length);
            StringBuilder builder = new StringBuilder();
            correctAnswer[i] = Integer.toString(numbers[replaceIndex]);
            for (var j = 0; j < numbers.length; j++) {
                if (j == replaceIndex) {
                    builder.append(".. ");
                } else {
                    builder.append(numbers[j]).append(" ");
                }
            }
            question[i] = builder.toString();
        }
        Engine.engine(question, correctAnswer);
    }

    static int[] createProgression() {
        var arrayLength = (int) (Math.random() * CONST_LENGTH_1) + CONST_LENGTH_2;
        int[] numbers = new int[arrayLength];
        numbers[0] = (int) (Math.random() * CONST_FIRST_ELEMENT);
        int step = (int) (Math.random() * CONST_STEP) + 1;
        for (var i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + step;
        }
        return numbers;
    }
}
