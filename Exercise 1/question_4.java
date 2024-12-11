import java.util.*;
// ares and circumference of a circle by function 
public class question_4 {
    
    // first function 
    public static double area(int radious){ 
        double area = 3.14*(Math.pow(radious,2));
        return area;
    }
    // second function
    public static double circum(int radious){
        double circumference=2*3.14*radious;
        return circumference;
    }
    // main  function 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radious");
        int r=sc.nextInt();
        double Area = area(r);
        double circumference = circum(r);
        System.out.println("\nThe area of the circle is "+Area);
        System.out.println("\nThe cercumference of the circle is "+circumference);
        sc.close();
    }
}
