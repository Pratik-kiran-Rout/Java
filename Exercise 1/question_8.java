import java.util.*;
// power by using Math.pow
public class question_8 {
      // first function
      public static double powerOfTwoNum(int a, int b){
        double power= Math.pow(a, b); // it a double qut
        return power;
      }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int x=sc.nextInt();
        System.out.println("Enter the power");
        int y=sc.nextInt();
        double power=powerOfTwoNum(x, y);
        System.out.println(" The power of x is "+power);
        sc.close();
    }
    
}
