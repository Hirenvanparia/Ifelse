import java.util.Scanner;

public class StudentResult {

     public void pass()
     {
        Scanner scanner = new Scanner(System.in);
     // enter your details
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your Roll No. :");
        int rollNumber = scanner.nextInt();
        System.out.println("Enter your maths marks :");
        int maths = scanner.nextInt();
        System.out.println("Enter your English marks :");
        int english = scanner.nextInt();
        System.out.println("Enter your science marks :");
        int science = scanner.nextInt();
        int total = (maths + english + science);
         double percentage;
        percentage = (total /(float)3);
        System.out.println(" your total marks=" + (total));
        System.out.println("your percentage is :" +percentage + "%");

       // if else method
         if(maths>=35 && english>=35 && science>=35)
           {
             System.out.print("Pass");
           }
         else
             {
               System.out.print("Fail");
             }

     }

    public static void main(String[] args) {
        // creating class object to call not - static method in static area
       StudentResult studentResult =new StudentResult();
        // calling method using class object
        studentResult.pass();
    }
}













