import java.util.*;
// avarage of three number in function
public class question_1 {
    // new function 
    public static double avarageOfThreeNum(int a,int b,int c){
        int ava = (a+b+c)/3;
        return ava;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x=sc.nextInt();
        System.out.println("Enter the second number");
        int y=sc.nextInt();
        System.out.println("Enter the third number");
        int z=sc.nextInt();
        double Avarage = avarageOfThreeNum(x, y, z);
        System.out.println("The avarage of three number is "+Avarage);
        
        sc.close();
    }
    
}
