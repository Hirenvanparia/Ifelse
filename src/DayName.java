import java.util.Scanner;

public class DayName {

    public void days (){


    int n;
        // taking input from the user using the Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        n=scanner.nextInt();
        if(n==1)
    {
        System.out.print("Sunday");
    }
        else if(n==2)
    {
        System.out.print("Monday");
    }
        else if(n==3)
    {
        System.out.print("Tuesday");
    }
        else if(n==4)
    {
        System.out.print("Wednesday");
    }
        else if(n==5)
    {
        System.out.print("Thursday");
    }
        else if(n==6)
    {
        System.out.print("Friday");
    }
        else if(n==7)
    {
        System.out.print("Saturday");
    }
        else
    {
        System.out.print("Invalid number");
    }
}

    public static void main(String[] args)
      {

        // creating class object to call not - static method in static area
        DayName dayName = new DayName();
          // calling method using class object
        dayName.days();
      }
}

