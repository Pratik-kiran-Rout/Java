import java.util.*;
class afddz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics : ");
        int physics = sc.nextInt();
        System.out.println("Enter yoyur marks in chemistry : ");
        int chemistry = sc.nextInt();
        System.out.println("Enter your marks in biology : ");
        int bio = sc.nextInt();
        System.out.println("Enter your marks in english : ");
        int english = sc.nextInt();
        System.out.println("Enter your marks in odia : ");
        int odia = sc.nextInt();
        int mark = physics + chemistry + bio + english + odia;
        System.out.println(mark);
        double m = mark / 500;
        double per = m * 100;
        System.out.println("percentage : ");
        System.out.println(per);
        sc.close();
    }
}
