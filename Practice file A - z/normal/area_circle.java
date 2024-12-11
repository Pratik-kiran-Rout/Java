
import java.util.*;
public class area_circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radious of the circle");
        double r =sc.nextDouble();
        System.out.println("The area is "+(3.141*Math.sqrt(r)));
        // math.pow use for square or math.sqrt
        System.out.println("The perimeter is "+(2*3.141*r));
        sc.close();
    }
}
