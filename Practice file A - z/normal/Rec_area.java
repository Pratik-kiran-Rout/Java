import java.util.*;
public class Rec_area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rec");
        // width = W and length = L
        int W = sc.nextInt();
        System.out.println("Enter the length of the rec");
        int L = sc.nextInt();
        int area = W*L;
        int peri = 2*(W+L);
        System.out.println("The is "+area);
        System.out.println("The perimeter is "+peri);
        sc.close();
}

    }
