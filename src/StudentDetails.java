import java.util.Scanner;

public class StudentDetails {
    public void score() {
        Scanner scanner = new Scanner(System.in);
        // acknowledge the user what to enter
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
        if (percentage >= 75)
        {
            System.out.println("Grade = Dist");
        } else if (percentage >= 60)
              {
               System.out.println("Grade = First");
              } else if (percentage>=50)
                 {
                  System.out.println("Grade = Second");
                 } else if (percentage>=35)
                     {
                        System.out.println("Grade = Pass");
                     }else
                           {
                                System.out.println("Grade = Fail");
                           }
    }
    public static void main(String[] args) {
        // creating class object to call not - static method in static area
        StudentDetails studentDetails =new StudentDetails();
        // calling method using class object
        studentDetails.score();
    }
}

