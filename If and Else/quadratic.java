import java.util.*;
class quadratic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-efficient of x square");
        int a=sc.nextInt();
        System.out.println("Enter the co-efficient of x");
        int b=sc.nextInt();
        System.out.println("Enter the constant value");
        int c=sc.nextInt();
        sc.close();
        int d=(b*b-(4*a*c));
        // case 1 if D>0
        if(d>0){
            System.out.println(" The roots are Real and distict");
            double r1= (-b+Math.pow(d,0.5))/2*a;
            double r2= (-b-Math.pow(d,0.5))/2*a;
            System.out.println("The roots are r1 ="+r1+"And r2 ="+r2);
        }

        else if(d==0){
            System.out.println(" The roots are Real and repeated"); 
            double r1=-b/2*a;
            double r2=-b/2*a;
            System.out.println("The roots are r1 ="+r1+" And r2 ="+r2);
        }

        else{
            System.out.println("the roots are complex and imaginary");
            double real=-b/2*a;
            double imaginary=Math.sqrt(-d); // -d use for convert d from -ve to +ve
            System.out.println("The roots are r1= "+real+"+i"+imaginary);
            System.out.println("The roots are r2= "+real+"-i"+imaginary);
        }
    }
}