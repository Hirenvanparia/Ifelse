import java.util.Scanner;

public class Interchange {


    public void swap()
    {
       //Create an instance of the Scanner class
         Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number");
        int num2=scanner.nextInt();
        System.out.println("Before Swapping numbers are: ");
        System.out.println("The first Number is "+num1);
        System.out.println("The second Number is "+num2);
    //Use a temporary variable to swap the numbers
         int temp=num1;
          num1=num2;
           num2=temp;
           // Swapping the values
        System.out.println("After Swapping numbers are: ");
        System.out.println("The first Number is "+num1);
        System.out.println("The second Number is "+num2);
    }

       public static void main(String[] args)
       {
           // creating class object to call not - static method in static area
          Interchange interchange = new Interchange();
           // calling method using class object
           interchange.swap();
       }
}