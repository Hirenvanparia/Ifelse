import java.util.Scanner;

public class Sales_Commission {

    public void Main()
    {     //Scanner class to read value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Seller Name");
        String Name = scanner.nextLine();
        System.out.println("Enter The Seller  ID");
        int id =scanner.nextInt();
        System.out.println("Enter Sales Amount;");
        double Sales_Amount = scanner.nextDouble();
        System.out.println("Basic Salary");
        double BasicSalary = scanner.nextDouble();
        if (Sales_Amount>=10000)
        // commission amount
        {
            System.out.println("Your Commission is :" + (Sales_Amount*0.5)+"%");

        } else if (Sales_Amount>=20000)
          {
                 System.out.println("Your Commission is :" + (Sales_Amount*0.10)+"%");

          } else if (Sales_Amount>=30000)
            {
                     System.out.println("Your Commission is :" + (Sales_Amount*0.20)+"%");
            } else if (Sales_Amount>=50000)
              {
                         System.out.println("Your Commission is :" + (Sales_Amount*0.35)+"%");

              } else
                 {
                     System.out.println("");
                 }


    }

    public static void main(String[] args)
    {   // creating class object to call not - static method in static area
        Sales_Commission salesCommission = new Sales_Commission();
        salesCommission.Main();
    }


}
