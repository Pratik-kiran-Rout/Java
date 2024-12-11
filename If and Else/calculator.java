import java.util.*;
public class calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator (+,-,*,/,%)");
        char symbol=sc.next().charAt(0);// week = ;
        System.out.println("Enter the 1st number:");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int y =sc.nextInt();

        switch(symbol)
        {
            case '+':System.out.println("The sum of x + y is = "+(x+y));
            break ;

            case '-' :System.out.println("The minus of x - y is = "+(x-y));
            break ;

            case '*':System.out.println("The multiplication of x * y is = "+(x*y));
            break ;

            case '/':System.out.println("The divion of x / y is = "+(x/y));
            break ;

            case '%':System.out.println("The reminder of x % y is = "+(x%y));
            break ;

            default:System.out.println("Enter the valid sign ");
        
        }
        sc.close();
    }
    
}
