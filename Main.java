import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void mathCategory () {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> mathList = new ArrayList<String>();
        int answer;
        int points = 0;
        try {
            mathList.add("Въпрос 1: Колко е 3 + 4 - 2 - 2 + 1 = ?, 1. три, 2. четири, 3. две, 4. едно");
            int mathCategoryIndex = 0;
            String mathQuestionsAndAnswers = mathList.get(mathCategoryIndex);
            String[] mathData = mathQuestionsAndAnswers.split(", ");
            String question1 = mathData[0];
            String wrongAnswer1For1Question = mathData[1];
            String correctAnswerFor1Question = mathData[2];
            String wrongAnswer2For1Question = mathData[3];
            String wrongAnswer3For1Question = mathData[4];
            System.out.println(question1);
            System.out.println(wrongAnswer1For1Question + "\n" +
                    correctAnswerFor1Question + "\n" +
                    wrongAnswer2For1Question + "\n" +
                    wrongAnswer3For1Question);

            System.out.print("Отговор: ");
            answer = scan.nextInt();
            System.out.println();
            if (answer == 2) {
                points++;
                System.out.println("Правилно, твоят резултат за сега е " + points);
            } else if (answer != 2) {
                System.out.println("Грешно твоят резултат е " + points);
                System.exit(0);
            }

            mathList.add("Въпрос 2: Колко е 2 + 2 - 2 = ?, 1. четири, 2. едно, 3. две, 4. три");
            int mathCategoryIndex2 = 0;
            String mathQuestionsAndAnswers2 = mathList.get(mathCategoryIndex2);
            String[] mathData2 = mathQuestionsAndAnswers2.split(", ");
            String question2 = mathData2[0];
            String wrongAnswer1For2Question = mathData2[1];
            String wrongAnswer2For2Question = mathData2[2];
            String correctAnswerFor2Question = mathData2[3];
            String wrongAnswer3For2Question = mathData2[4];
            System.out.println(question2);
            System.out.println(wrongAnswer1For2Question + "\n" +
                    wrongAnswer2For2Question + "\n" +
                    correctAnswerFor2Question + "\n" +
                    wrongAnswer3For2Question);

            System.out.print("Отговор: ");
            answer = scan.nextInt();
            System.out.println();
            if (answer == 3) {
                points++;
                System.out.println("Правилно, твоят резултат за сега е " + points);
            } else if (answer != 3) {
                System.out.println("Грешно твоят резултат е " + points);
                System.exit(0);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Избери си категория от \n" +
                "Математика \n" +
                "История \n" +
                "Биология: ");
        String chooseCategory = scan.next();
        if (chooseCategory.equals("Математика")) {
            System.out.println();
            mathCategory();
        }
    }
}
