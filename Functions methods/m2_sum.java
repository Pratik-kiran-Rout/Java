import java.util.*;
public class m2_sum {
    public static int twoNumberSum(int a,int b){
        int sum =a+b;
        return sum; // here it will retrun sum
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number ");
        int x=sc.nextInt();
        System.out.println("Enter the sec number");
        int y=sc.nextInt();
        int sum =twoNumberSum(x, y);
        System.out.println("The sum  is "+sum);
        sc.close();

    }
}
