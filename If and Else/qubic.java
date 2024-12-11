import java.util.*;
public class qubic{
    public static void main(String[ ]args){
        Scanner sc =new Scanner(System.in);
        
System.out.println("Enter the coefficient of x cube:");
int a = sc.nextInt();

System.out.println("Enter the coefficient of x square:");
int b = sc.nextInt();

System.out.println("Enter the coefficient of x:");
int c = sc.nextInt();

System.out.println("Enter the constant:");
int d = sc.nextInt();
int i;
sc.close();

for (i=-9;i<=9;i++) { // Loop
if((a*(i*i*i)+b*(i*i)+c*(i)+d)==0){
break;
  }
}
// For qubic
double f1 = i;
double a1 = f1*a;
double b1 = b+a1;
double c1 = c+(f1*b1); 
//double z = d+(f1*c1);
double d1 = b1*b1-(4*a*c1);

if(d1>0) {                                         // For quadratic
double r1 = (-b1+Math.pow(d1,0.5))/2*a;
double r2 = (-b1-Math.pow(d1,0.5))/2*a; 
System.out.println("The roots are " + r1 + "and " + r2 + "and " +f1);
}
else if(d1==0) {
double r1=-b1/2*a;
double r2=-b1/2*a;
System.out.println("The roots r1="+r1+"and"+r2+"and"+f1);
}
else if(d1<0){
    System.out.println("the roots are complex and imaginary");
    double real=-b1/2*a;
    double imaginary=Math.sqrt(-d1); // -d use for convert d from -ve to +ve
    System.out.println("one of the root is"+f1);
    System.out.println("The roots are r1= "+real+"+i"+imaginary);
    System.out.println("The roots are r2= "+real+"-i"+imaginary);
}
else {
    System.out.println("Enter the valid numbers");
    }
  }
}

