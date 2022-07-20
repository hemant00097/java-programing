import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter any number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
