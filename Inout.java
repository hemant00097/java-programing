import java.util.Scanner;
class Inout {
    public static void main(String [] args)
    {
        int a;
        System.out.println("Enter the data");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        sc.close();
        System.out.println("Set the data " +a);
    
    }

}
