import java.util.Scanner;

public class Eligible_For_Vote {


    Scanner scanner = new Scanner(System.in);
    public void age()
    {  // acknowledge the user what to enter
        System.out.println("Please enter your age in inter value");
        // strong age in variable using scanner object
        int age = scanner.nextInt();
        if (age>=18)
        {
            System.out.println("You are eligible for vote as you age is :" + age);
        }else
        {
            System.out.println("You are not eligible for vote as you age is :" + age);

        }
    }
    public static void main(String[] args)
        {
        // creating class object to call not - static method in static area
            Eligible_For_Vote eligibleForVote = new Eligible_For_Vote();
        // calling method using class object
             eligibleForVote.age();
        }
}

