import java.util.*;
public class even_odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, to check weather the number is even or odd");
        int num = sc.nextInt();
        if(num%2==0){ // relational opearator
        System.out.println("It is a even number !");
        }
        else
        System.out.println("it is a odd number !");
        sc.close();
        
    }
    }
