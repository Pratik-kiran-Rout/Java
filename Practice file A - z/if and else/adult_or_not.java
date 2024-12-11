import java.util.*;
public class adult_or_not {
    public static void main(String args[]){
System.out.println("Enter the age");
      Scanner sc = new Scanner(System.in); // sc is a object
      int age = sc.nextInt();
      if(age>=18){
        System.out.println(" you can vote !");
      }
      else{
        System.out.println("You can't vote !");
      }
       sc.close();

    }
    
}
