import java.util.*;
public class even_or_odd{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int x = sc.nextInt();
    if(x%2==0)
    {
     System.out.println("Even number ");
    }
    else{
        System.out.println("Odd number ");
    }
    sc.close(); // scanner closer 

}
}