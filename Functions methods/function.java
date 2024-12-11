  import java.util.*;
public class function {

    public static void printMyName(String name){ // function
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String myname = sc.nextLine();
         printMyName(myname); // function calling and 
         // here we pass the arg to new function " printMyName"
         sc.close();
  
    }
}
