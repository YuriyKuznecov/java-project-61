package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void event() {
        String questionMessage = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] question = new String[Engine.MAX_ATTEMPT];
        String[] correctAnswer = new String[Engine.MAX_ATTEMPT];
        for (var i = 0; i < Engine.MAX_ATTEMPT; i++) {
            var number = Utils.randomInt(0, Engine.MAX_INT_100);
            question[i] = Integer.toString(number);
            correctAnswer[i] = getCorrectAnswer(number);
        }
        Engine.engine(questionMessage, question, correctAnswer);
    }

    static String getCorrectAnswer(int a) {
        return a % 2 == 0 ? "yes" : "no";
    }
}
