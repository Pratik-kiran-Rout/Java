import java.util.Scanner;
// without function
public class rough_for_q7 {
      public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int pos=0,neg=0,zero=0;
    System.out.println("Enter 1 to continue and 0 to End ");
    int input=sc.nextInt();
   
    while(input==1){
    System.out.println("Enter the number");
    int number = sc.nextInt();
    if(number>0){
     pos++;
    }
    else if(number<0){
        neg++;
    }
    else{
        zero++;
    }
    System.out.println("Enter 1 to continue and 0 to End ");
    input=sc.nextInt();
    }
    
     System.out.println("number of times positive numbers enters is "+pos);
     System.out.println("number of times negetive numbers enters is "+neg);
     System.out.println("number of times zero numbers enters is "+zero);

     sc.close();
   }
}

