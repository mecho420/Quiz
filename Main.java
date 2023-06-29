import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
            }

            reader.close();

            String csvContent = stringBuilder.toString();
            System.out.println(csvContent);

            String[] split = csvContent.split(", ");
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
