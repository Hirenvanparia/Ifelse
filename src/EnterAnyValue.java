import java.util.Scanner;

public class EnterAnyValue {

    public void value() {
        //Create an instance of the Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Value : ");
        char ch = scanner.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            // CHECKING FOR ALPHABET
             {
               System.out.println(ch + " is A ALPHABET.");

            }
            // CHECKING FOR DIGITS
              else if(ch >= '0' && ch <= '9')

            {
              // OTHER SPECIAL CHARACTER
               System.out.println(ch + " is A DIGIT.");

            } else

              {

                 System.out.println(ch + " is A SPECIAL CHARACTER.");
              }

            }
         // Calling above function to
         // reverse the numbers

    public static void main(String[] args)
           // creating class object to call not - static method in static area
        {        EnterAnyValue enterAnyValue = new EnterAnyValue();
            // calling method using class object
                  enterAnyValue.value();
        }
}


