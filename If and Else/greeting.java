import java.util.*;
public class greeting
{ // By if else condition
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 - 3");
        int button =sc.nextInt();
        if(button==1){
            System.out.println("Hello");
        }
        else if (button==2){
            System.out.println("Namaste");
        }
        else if (button==3){
            System.out.println("Bonjour");
        }
        else {
            System.out.println("invalid number");
        }
        sc.close();
    }
} 