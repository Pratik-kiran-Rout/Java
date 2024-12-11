import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sign !");
        char symbol =sc.next().charAt(0);
        System.out.println("Enter the first number ! A");
        double Num_1=sc.nextDouble();
        System.out.println("Enter the saecond number! B");
        double Num_2 = sc.nextDouble();
        switch(symbol){
           
            case '+': double sum = Num_1 + Num_2 ;
            System.out.println(" The sum of two number is ! "+sum);
            break ;

            case '-': double minus = Num_1 - Num_2 ;
            System.out.println(" The minus of two number is ! "+minus);
            break ;
            
            case '*': double multi = Num_1 * Num_2 ;
            System.out.println(" The multiplication  of two number is ! "+multi);
            break ;

            case '/': 
            if(Num_2 != 0){
            double div = Num_1 / Num_2 ;
            System.out.println(" The division of two number is ! "+div);
            }
            else
            System.out.println("invalid !");
            break ;

            case '%':double modulo = Num_1 % Num_2 ;
            System.out.println("The modulo of two number is ! "+modulo);
            break;

            default:System.out.println("Invalid ! Enter the valid sign !");
            sc.close();

        }
    }
}
