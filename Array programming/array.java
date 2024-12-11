import java.util.*;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        for(int i=0;i<3;i++){
        System.out.println("Enter the marks");
          marks[i]=sc.nextInt();
        }
        /*
         * marks[0]=96;
         * marks[1]=95;
         * marks[2]=87;
         */
        System.out.println("The marks are:");
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
        /*
         * System.out.println(marks[0]);
         * System.out.println(marks[1]);
         * System.out.println(marks[2]);
         */
      sc.close();
      

    }
}
