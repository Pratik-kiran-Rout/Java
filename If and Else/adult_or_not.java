import java.util.*;
public class adult_or_not{
    public static void main(String [] args)
    {
       Scanner sc = new Scanner(System.in); // Scanner open 
       System.out.println("Enter the Age :");
       int age = sc.nextInt();
       if(age>=18){
        System.out.println("Adult ");
       }
       else{
        System.out.println("Minor / Not Adult");
       }
       sc.close();
}
}
