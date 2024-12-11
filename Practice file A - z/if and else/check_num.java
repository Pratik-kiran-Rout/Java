import java.util.*;
public class check_num {
    public static void main(String args[]){
        System.out.println(" enter two Number ");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the second number ");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Both are equal !");
        }
        else if(a<=b){
            System.out.println("a= "+a+" is less then b= "+b);
        }
        else
        {
            System.out.println(" a is greater !");
        }
        sc.close();
    }
}
