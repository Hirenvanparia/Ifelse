import java.util.Scanner;

public class EmployeeDetails {


    public void Salary() {
        //Create an instance of the Scanner class
        Scanner scanner = new Scanner(System.in);
        // enter employee details
        System.out.println("Please Enter Employee Name");
        String name = scanner.nextLine();
        System.out.println("Please Enter employee ID");
        int id = scanner.nextInt();
        System.out.println("Basic Salary: ");
        double basic_salary = scanner.nextDouble();
        double hra, ta, da, pf, gross_salary;
        hra = basic_salary * 0.10;
        System.out.println("This Is HRA:" + hra);
        da = basic_salary * 0.5;
        System.out.println("This Is DA:" + da);
        ta = basic_salary * 0.09;
        System.out.println("This Is TA:" + ta);
        pf = basic_salary * 0.11;
        System.out.println("This Is PF:" + pf);
        gross_salary = hra + da + ta + pf;
        System.out.println("This Is Gross Salary:" + gross_salary);
        // get the total gross_salary
    }
    public static void main(String[] args)
    {   // creating class object to call not - static method in static area
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.Salary();
    }
}
