// take an array as input from the user , and search for a given number x
// and print the index numebr 
import java.util.*;
public class array_search {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
       
        int[] num=new int[size];
        // input 5 number 
        for(int i=0;i<size;i++){
            System.out.println("Enter the number ");
            num[i]=sc.nextInt();
        }

        System.out.println("Enter the number which you want to search");
        int x=sc.nextInt();

         //length is nothing but the size of an array
        for(int i=0;i<num.length;i++){                 // This is a linear search 
        if(num[i]==x){         
        System.out.println("The index number is "+i);
        }
        sc.close();
    }
}
}
