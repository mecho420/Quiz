import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main {

    public static void mathCategory () {
        Scanner scan = new Scanner(System.in);
        String csvMathList = "test.csv";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(csvMathList));
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
                String csvContentMath = stringBuilder.toString();
                String[] split = csvContentMath.split(",");
                for (String index : split) {
                    System.out.printf("%10s%n", index);
                }
                System.out.println();
                String answer = scan.next();
                if (answer == "четири") {
                    System.out.println("Правилно!");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
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
