import java.util.*;
public class revision{
    public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    int posi=0,neg=0,zero=0;
    System.out.println("Enter 1 to continue and 0 to end");
    int input =sc.nextInt();
    while(input==1){
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        if(number>0){
            posi++;
        }
        else if(input<0){
            neg++;
        }
        else{
            zero++;
        }
        System.out.println("Enter 1 to continue and 0 to end ");
        input=sc.nextInt();
       
    }
    System.out.println("The number of positive number enter is"+posi);
    System.out.println("The number of negetive number enter is"+neg);
    System.out.println("The number time zero entered"+zero);
    sc.close();

    }
}