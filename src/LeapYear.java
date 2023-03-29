import java.util.Scanner;

public class LeapYear {
    //
    Scanner scanner = new Scanner(System.in);{
        // acknowledge the user what to enter
        System.out.println("Please Enter 4 digit of the Year(e.g. = 1928)");
        int year = scanner.nextInt();

        if (((year % 4) == 0)|| (((year % 400) == 0) && ((year % 100) != 0)))
        {
            System.out.println("Specified year is a leap year " + " : " +year);

        }else
              {
                  System.out.println("Specified year is not a leap year "+ " : "+ year);
              }
    }
    public static void main(String[] args) {
        // creating class object to call not - static method in static area
        LeapYear leapYear = new LeapYear();
    }

    }

