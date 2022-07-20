import java.util.Scanner;
class evennum 
{
    public static void main(String[] args) 
    {
        int n;
        System.out.println("enter the Number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        for(int i=0;i<=n;i=i+2)
        {
            System.out.println(i);
        }
    }
    
}
