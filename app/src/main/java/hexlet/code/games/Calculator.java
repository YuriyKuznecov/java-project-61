package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

@SuppressWarnings("ALL")
public class Calculator {
    private static final int RANDOM_OPERATOR = 3;

    public static void calc() {
        String questionMessage = "What is the result of the expression?";
        String op;
        String[] question = new String[Engine.MAX_ATTEMPT];
        String[] correctAnswer = new String[Engine.MAX_ATTEMPT];
        for (var i = 0; i < Engine.MAX_ATTEMPT; i++) {
            String[] results = calculator();
            question[i] = results[0];
            correctAnswer[i] = results[1];
        }
        Engine.engine(questionMessage, question, correctAnswer);
    }

    static String[] calculator() {
        String[] questionAndAnswer = new String[2];
        var a = Utils.randomInt(0, Engine.MAX_INT_100);
        var b = Utils.randomInt(0, Engine.MAX_INT_100);
        String operators = "+-*";
        var index = Utils.randomInt(0, operators.length() -1);
        var operator = operators.charAt(index);
        switch (operator) {
            case '+' -> {
                questionAndAnswer[0] = String.format("%d + %d", a, b);
                questionAndAnswer[1] = Integer.toString(a + b);
            }
            case '-' -> {
                questionAndAnswer[0] = String.format("%d - %d", a, b);
                questionAndAnswer[1] = Integer.toString(a - b);
            }
            default -> {
                questionAndAnswer[0] = String.format("%d * %d", a, b);
                questionAndAnswer[1] = Integer.toString(a * b);
            }
        }
        return questionAndAnswer;
    }

}
