import java.util.*;
public class cylinder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Leteral surface and Surface area 
        System.out.println("The radious of the cylinder");
        double r=sc.nextDouble();
        System.out.println("Enter the hight of the Cylinder");
        double H=sc.nextDouble();
        double L_S = 2*3.141*r*H; 
        System.out.println("The leteral surface value is "+L_S);
        double S_A = 2*(3.141*Math.sqrt(r))+L_S;
        System.out.println("The Surface area is "+S_A);
        sc.close(); 
    }
}
