import java.util.*;
public class percentage {
    public static void main(String args[]){
   System.out.println("Enter the marks");
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the math marks");
   int math=sc.nextInt();
   System.out.println("Enter the english marks");
   int eng=sc.nextInt();
   System.out.println("enter the odia marks");
   int odia=sc.nextInt();
   System.out.println("enter the physics marks");
   int phy=sc.nextInt();
   double sum = math+phy+odia+eng;
   double per = (sum/400)*100;
   System.out.println("The percentage is n"+per);
   sc.close();
    }
}
