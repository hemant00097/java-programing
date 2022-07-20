 
import java.util.Scanner;
class StringInOut {
    public static void main(String [] args)
    {
        String a;
        System.out.println("Enter the data");
        Scanner sc=new Scanner(System.in);
        a= sc.nextLine();
        sc.close();
        System.out.println("Get the data " +a);
    
    }

}