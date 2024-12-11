import java.util.*;
public class all_datatype {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nRoll number ");
        int roll_no = sc.nextInt();

        System.out.println("name");
        String name = sc.next();

        System.out.println("full name");
        String F_name=sc.nextLine();

        System.out.println("section");
        char sec = sc.next().charAt(0);

        System.out.println("percentage");
        double per=sc.nextDouble();

        System.out.println("CGPA");
        float CGPA = sc.nextFloat();

        System.out.println("\noutput\n");
        System.out.println(name);
        System.out.println(F_name);
        System.out.println(roll_no);
        System.out.println(sec);
        System.out.println(per);
        System.out.println(CGPA);
        
        sc.close();
    }
}
