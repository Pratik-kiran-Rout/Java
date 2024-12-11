import java.util.*;
public class greeting_by_if {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1-3 !");
        int num = sc.nextInt();
        if(num ==1){
            System.out.println(" Hello !");
        }
        else if(num==2){
            System.out.println("Namaste !");
        }
        else if(num == 3){
            System.out.println("Bonjour !");
        }
    else{
        System.out.println(" Invalid number !");
    }
     sc.close();
    }
}
