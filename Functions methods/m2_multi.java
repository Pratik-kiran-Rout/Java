import java.util.*;
public class m2_multi {
    public static int multiOfTwoNumber(int a, int b){
        int multi=a*b;
        System.out.println("The multiplicatin is "+multi);
        return 0;
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 1st number ");
    int x=sc.nextInt();
    System.out.println("Enter the sec number ");
    int y=sc.nextInt();
    multiOfTwoNumber(x,y);
    sc.close();

}

}
