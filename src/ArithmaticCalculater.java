import java.util.Scanner;

public class ArithmaticCalculater {


   public void Calculater (){
       Scanner scanner = new Scanner(System.in);

       // taking input from the user using the Scanner
       // class
       System.out.print("Please Enter Your First Number:");
       int a = scanner.nextInt();
       System.out.println("Please Enter Your Second Number:");
       int b = scanner.nextInt();

       // selecting the operand for the calculations
       System.out.print(
               "Choose and Enter the type of operation you want to perform (+, -, *, /,) - ");
       char op = scanner.next().charAt(0);
       solve(a, b, op);
   }
    public static int solve(int a, int b, char op)
    {
        int ans = 0;
        // addition
        if (op == '+') {
            ans = a + b;
            // subtraction
        }
        else if (op == '-') {
            ans = a - b;
            // multiplication
        }
        else if (op == '*') {
            ans = a * b;

        }

        // division

        else if (op == '/') {
            ans = a / b;
        }

        // printing the final result
        System.out.println("Your answer is - " + ans);
        return ans;
   }

    public static void main(String[] args) {
        ArithmaticCalculater arithmaticCalculater =new ArithmaticCalculater();
        arithmaticCalculater.Calculater();
    }
}

