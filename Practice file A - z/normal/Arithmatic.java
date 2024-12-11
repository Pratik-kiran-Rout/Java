import java.util.*;
public class Arithmatic {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in); // For input the Variable
    System.out.println("\nFor all Arithmatic Program");
    System.out.println("Enter the first number");
    double A = sc.nextDouble();
    System.out.println("Enter the second number");
    double B = sc.nextDouble();
    System.out.println("The sum is "+(A+B));
    System.out.println("The minus is "+(A-B));
    System.out.println("The multiplecation is "+(A*B));
    System.out.println("The division is "+(A/B));
    System.out.println("The modulo of the numbers is "+(A%B));
    sc.close();
    }

}
