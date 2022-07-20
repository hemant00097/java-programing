import java.util.Scanner;
class SumEvenOdd
{
    public static void main(String[] args) 
    {
        int n,sum=0;
        System.out.println("enter the range");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        if(n%2==0)
        {
            for(int i=0;i<=n;i=i+2)
            {
                sum=sum+i;
            }
            System.out.println("sum of even number " + sum);
        }
        else
        {
            for(int i=1;i<=n;i=i+2)
            {
                sum=sum+i;
            }

            System.out.println("sum of odd number " + sum);
        }
    }
    
}
