import java.util.Scanner;
class OddNum 
{
    public static void main(String[] args)
    { 
        int n;
        System.out.println("Enter the number of range");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i=i+2)
        {
            System.out.println(i);
        }
        
    }
}
