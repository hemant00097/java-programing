import java.util.Scanner;
class Oddnum 
{
    public static void main(String[] args)
    { 
        int n;
        System.out.println("Enter the number of renge");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i=i+2)
        {
            System.out.println(i);
        }
        
    }
}