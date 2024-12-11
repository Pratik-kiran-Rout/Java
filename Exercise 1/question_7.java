/*Write a program to enter the numbers till the user 
wants and at the end it should display the count of
 positive, negative and zeros numbers entered using function */

import java.util.*;

public class question_7 {
    // new function 
    public static int function(int input){ // function arguments 
        int positive=0, negetive=0, zero=0;
        Scanner sc = new Scanner(System.in);
        while(input==1){
            System.out.println("Enter the number");
            int number = sc.nextInt();
            if(number>0){
             positive++;
            }
            else if(number<0){
                negetive++;
            }
            else{
                zero++;
            }
            System.out.println("Enter 1 to continue and 0 to End ");
            input=sc.nextInt(); 
            
            }
             System.out.println("number of times positive numbers enters is "+positive);
             System.out.println("number of times negetive numbers enters is "+negetive);
             System.out.println("number of times zero numbers enters is "+zero);
        
             sc.close();
        return 0;
    } 
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 to continue and 0 to End ");
    int input=sc.nextInt();
    function(input); // function calling and passing the arguments 
    sc.close();
    }

    
}
