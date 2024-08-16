package hexlet.code.games;

import hexlet.code.Engine;

@SuppressWarnings("ALL")
public class Calculator {
    private static final int RANDOM_OPERATOR = 3;

    public static void calc() {
        String questionMessage = "What is the result of the expression?";
        String op;
        String[] question = new String[Engine.MAX_ATTEMPT];
        String[] correctAnswer = new String[Engine.MAX_ATTEMPT];
        for (var i = 0; i < Engine.MAX_ATTEMPT; i++) {
            var number1 = (int) (Math.random() * Engine.RANDOM_INT);
            var number2 = (int) (Math.random() * Engine.RANDOM_INT);
            var operator = (int) (Math.random() * RANDOM_OPERATOR);
            switch (operator) {
                case 0 -> {
                    op = "+";
                    correctAnswer[i] = Integer.toString(number1 + number2);
                }
                case 1 -> {
                    op = "-";
                    correctAnswer[i] = Integer.toString(number1 - number2);
                }
                default -> {
                    op = "*";
                    correctAnswer[i] = Integer.toString(number1 * number2);
                }
            }
            question[i] = "" + number1 + " " + op + " " + number2;
        }
        Engine.engine(questionMessage, question, correctAnswer);
    }


}
