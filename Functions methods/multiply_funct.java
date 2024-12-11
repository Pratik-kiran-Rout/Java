import java.util.*;
public class multiply_funct {
    public static int multiOfTwoNumber(int a, int b){
        int multi=a*b;
        return multi;
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 1st number ");
    int x=sc.nextInt();
    System.out.println("Enter the sec number ");
    int y=sc.nextInt();
    int multi=multiOfTwoNumber(x,y);
    System.out.println("The multiplicatin is "+multi);
    sc.close();
    }
}
