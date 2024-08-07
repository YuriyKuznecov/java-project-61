package hexlet.code;

import hexlet.code.games.Greeting;

public class Engine {
    public static int count;
    public static boolean isCorrect;

    public static  void engine(String answer, String correctAnswer) {

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            count++;
            isCorrect = true;
        } else {
            System.out.println("'" + answer + "' is wrong answer :(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + Greeting.userName + "!");
            isCorrect = false;
        }
        if (count == 3) {
            System.out.println("Congratulations, " + Greeting.userName + "!");
        }
    }
}
