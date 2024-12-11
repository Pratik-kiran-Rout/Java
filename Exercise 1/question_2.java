import java.util.*;
// sum of all odd number from one to n
public class question_2 {
    public static int sumOfAllOddNum(int x){
        int sum =0;
        for(int i=1;i<=x;i++){
            if(i%2 != 0){
                sum= sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("The sum of all odd number is ");
        int sum=sumOfAllOddNum(a); 
        /*here in function we can use the variable multiple times 
          becaluse in function all the functions are act separatle
        */
        System.out.println(sum);

        sc.close();
    }
    
}
