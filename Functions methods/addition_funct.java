import java.util.*;
public class addition_funct {
    public static int sumOfTwoNumber(int a,int b){
        int sum=a+b;
        System.out.println("The sum is "+sum);
        return 0;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number ");
    int x=sc.nextInt();
    System.out.println("Enter the sec number ");
    int y=sc.nextInt();
    sumOfTwoNumber(x,y);
    sc.close();
    }
}
