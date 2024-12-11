package patterns;
// pattern 1
import java.util.*;
public class half_pyramid {
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the rows");
 int x=sc.nextInt();
 for(int i=1;i<=x;i++){
    for(int j=1;j<=i;j++)
    System.out.print("*");
    System.out.print("\n");
 }
 sc.close();
} 
}
