import java.util.*;
public class unit_matrix {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println(" Enter the row number");
     int n=sc.nextInt();
     System.out.println("Enter the coloumn number");
     int m=sc.nextInt();
     int[][] matrix=new int[n][m];
     if(m==n){
        // Enter the element of the element
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j)
                matrix[i][j]= 1;
                else
                matrix[i][j]=0;
            }
            System.out.println();
        }
     }
     // Now the unit matrix is 
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
     }
     sc.close();
    }
}
