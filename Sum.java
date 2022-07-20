import java.util.Scanner;
class Sum 
{
    public static void main(String[] args)
    {
        int a,b,sum;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        sum= a+b;
        System.out.println("addisen "+sum);
    }
    
}
