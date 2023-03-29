import java.util.Locale;
import java.util.Scanner;

public class Uppercase_Lowercase {

    // main method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter any Alphabet in Uppercase  ");
        String string = scanner.nextLine();
        System.out.println("Print in Lowercase : "+ "\t" + string.toLowerCase(Locale.ROOT));
    }
}
