import java.util.Scanner;
class Table
{
    public static void main(String[] args) 
    {
        int n , num=1;
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++)
        {
            num=n*i;
            System.out.println(n +" x " +i +" =" +num );

        }
    }
    
}
