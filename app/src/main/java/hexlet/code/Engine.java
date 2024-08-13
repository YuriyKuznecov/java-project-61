package hexlet.code;

import hexlet.code.games.Greeting;

public class Engine {
    public static final int RANDOM_INT = 100;
    public static final int MAX_COUNT = 3;
    private static int count;
    private static boolean isCorrect;

    public static int getCount() {
        return count;
    }

    public static boolean getIsCorrect() {
        return isCorrect;
    }

    public static  void engine(String answer, String correctAnswer) {

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            count++;
            isCorrect = true;
        } else {
            System.out.println("'" + answer + "' is wrong answer :(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + Greeting.getUserName() + "!");
            isCorrect = false;
        }
        if (count == MAX_COUNT) {
            System.out.println("Congratulations, " + Greeting.getUserName() + "!");
        }
    }
}
