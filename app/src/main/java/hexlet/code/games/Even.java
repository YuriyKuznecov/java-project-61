package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void event() {
        String questionMessage = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] question = new String[Engine.MAX_ATTEMPT];
        String[] correctAnswer = new String[Engine.MAX_ATTEMPT];
        for (var i = 0; i < Engine.MAX_ATTEMPT; i++) {
            var number = (int) (Math.random() * Engine.RANDOM_INT);
            question[i] = Integer.toString(number);
            if (number % 2 == 0) {
                correctAnswer[i] = "yes";
            } else {
                correctAnswer[i] = "no";
            }
        }
        Engine.engine(questionMessage, question, correctAnswer);
    }
}
