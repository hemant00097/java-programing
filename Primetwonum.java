
import java.util.Scanner;
class Primetwonum {
    public static void main(String [] args)
    {
        int n1,n2,j,i;
        System.out.println("Enter the two number");
        Scanner sc= new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        sc.close();
        for(i=n1; i<=n2;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(i==j)
            {
            System.out.print( j +" ");
            }
        }
    }
}
