import java.util.*;
public class check
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int x =sc.nextInt();
        int y =sc.nextInt();
        if(x==y){
            System.out.println("Two numbers are Equal");
        }
        else if(x>=y){
            System.out.println(x+" x is greater");
        }
        else{
            System.out.println(x+" y is lesser");
        }
        sc.close();

    }
}