import java.util.Scanner;

public class PosNegZero {
    public void check() {


        int num;
        //Scanner class to read value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        num = scanner.nextInt();

        //checks the number is greater than 0 or not
        if (num > 0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if (num < 0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println("IT's ZERO.");

    }

    public static void main(String[] args)
    // creating class object to call not - static method in static area
    {
        PosNegZero posNegZero = new PosNegZero();
        posNegZero.check();
    }
}


