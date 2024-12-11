import java.util.*;
public class input_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int[] num = new int[size];
        for(int i=0;i<size;i++){ // for input 
            System.out.println("Enter the numbers");
            num[i]=sc.nextInt();
        }
       System.out.println("\n The entered numbers are :");
        for(int i=0;i<size;i++){
            System.out.println(num[i]);
        }
        sc.close();
    }
}
