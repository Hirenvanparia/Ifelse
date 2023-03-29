import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;
   // city name start from  A to F

public class CityName {

    public static void main(String[] args)
    { //Scanner class to read value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter from A to F :");
        char letter = scanner.next().charAt(0);

        if (letter == 'a' )
        {
            System.out.println("Ahmedabad");
        } else if (letter == 'b')
            {
                System.out.println("Bhavnagar");
            } else if (letter == 'c')
               {
                   System.out.println("Chennai");
               } else if (letter == 'd')
                 {
                     System.out.println("Delhi");
                 } else if (letter == 'e')
                    {
                        System.out.println("Eklara");
                    } else if (letter  == 'f')
                        {
                            System.out.println("Fatepur");
                        } else
                            {
                                System.out.println("Invalid Entry");

        }
    }

}
