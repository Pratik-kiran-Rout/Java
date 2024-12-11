// linear search
import java.util.*;
public class twoD_array_search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows=sc.nextInt();
        System.out.println("Enter the coloumn");
        int cols=sc.nextInt();
        // declaration of an array
        int[][] matrix=new int[rows][cols];

        // input 
        System.out.println("Enter the elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            matrix[i][j]=sc.nextInt();
            }
        } 
        System.out.println(); // this is for spacing

         // The matrix is 
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j] + " "); // only print
            }
            System.out.println();
         }

        // seach element
        System.out.println("Enter the search element");
        int x=sc.nextInt();

        // searching 
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==x){
                    System.out.println("The search element is at index number "+i+","+j);
                }
            }
        }
        sc.close();

    }
    
}
