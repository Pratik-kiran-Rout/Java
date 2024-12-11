
public class quize {
    // cheack diff between while and do-while
    public static void main(String [] args)
    {
        int i=11;
        while(i>12) // false condi so it can't run
        {
            System.out.println(" hello ");
        }
        //but in do-while
        do{
            System.out.println("pratik");
        }while(i>=12); 
        // false condi but it runs at least one time
        // so it only print pratik

    }
    
}
