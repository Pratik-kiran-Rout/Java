 // make a 2d array of 2x4 matrix important
import java.util.*;
public class twod_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the rows");
         int rows =sc.nextInt();
         System.out.println("Enter the coloumn");
         int cols=sc.nextInt();
         // declaration of 2D array
         int[][] matrix=new int[rows][cols];
  
         // input
         System.out.println("Enter the numbers");
         for(int i=0;i<rows;i++){ // for rows 
            for(int j=0;j<cols;j++){ // for coloumn
                matrix[i][j] = sc.nextInt();
            }
         }
                 
         // output
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" "); // here only write "print "
            }
            System.out.println(); // imp point 
         }

        sc.close();
    }
    
}
