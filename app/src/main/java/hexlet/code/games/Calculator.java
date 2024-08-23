package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

@SuppressWarnings("ALL")
public class Calculator {
    private static final int RANDOM_OPERATOR = 3;

    public static void calc() {
        String questionMessage = "What is the result of the expression?";
        String[][] questionAndAnswer = new String[Engine.MAX_ATTEMPT][2];
        for (var i = 0; i < Engine.MAX_ATTEMPT; i++) {
            var a = Utils.randomInt(0, Engine.MAX_INT_100);
            var b = Utils.randomInt(0, Engine.MAX_INT_100);
            String[] operators = {"+", "-", "*"};
            var randomIndex = Utils.randomInt(0, operators.length - 1);
            String operator = operators[randomIndex];
            questionAndAnswer[i][0] = String.format("%d %s %d", a, operator, b);
            questionAndAnswer[i][1] = Integer.toString(calculator(a, b, operator));
        }
        Engine.engine(questionMessage, questionAndAnswer);
    }

    private static int calculator(int a, int b, String operator) {
        switch (operator) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            default -> {
                return a * b;
            }
        }
    }

}
