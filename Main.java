import java.io.File;
import java.util.Scanner;

public class Main {

    public static void mathCategory () {
        try {
            File file = new File("test1.txt");
            Scanner fileReader = new Scanner(file, "utf-8");
            while (fileReader.hasNextLine()) {
                System.out.println();
                System.out.printf(fileReader.nextLine());
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void answer () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Отговор: ");
        int answer = scan.nextInt();
        if (answer == 2) {
            System.out.println("Правилно!");
        } else if (answer != 2) {
            System.out.println("Грешно!");
        }
    }

    public static void main(String[] args) {
        try {
            String readMath = mathCategory();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}