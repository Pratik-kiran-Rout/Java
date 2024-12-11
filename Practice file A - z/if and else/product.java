import java.util.*;
public class product {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("The laptop price is : 45,000 ");
        System.out.println("How many laptops do you want ?");
        int l = sc.nextInt();
        System.out.println(("The keyboard price is 2,200 "));
        System.out.println("How many keyboard do you want ?");
        int k =sc.nextInt();
        System.out.println("The mouse price is 900 ");
        System.out.println("How many mouse do you want ?");
        int m = sc.nextInt();

          int total = 45000*l + 2200*k + 900*m;
          System.out.println(" Total amount is "+total);
          // nested if
          if(total >= 100000 && total <=150000) { // 5% discount 
              System.out.println("thank you and you got 10% discount on total ="+total+" !");
              int total_10 = total - ((total * 10)/100);
              System.out.println(" yout anoumt is now !"+total_10);
          }
            else if(total>=150000 && total <= 200000){
                System.out.println("thank you and you got 15% discount on total ="+total+" !");
              int total_15 = total - ((total * 15)/100);
              System.out.println(" yout anoumt is now !"+total_15);
            }
            
            else if(total>=200000){
                System.out.println("thank you and you got 20% discount on total ="+total+" !");
              int total_20 = total - ((total * 20)/100);
              System.out.println(" yout anoumt is now !"+total_20);
            }
          
          else{
            System.out.println("thank you and total amount is "+total);
          }

        sc.close();
    }
}
