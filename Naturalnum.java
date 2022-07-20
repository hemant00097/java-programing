import java.util.Scanner;
class Naturalnum 
{
    public static void main(String[] args)
    {
       int n;
       System.out.println("Enter the nachural num");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt(); 
       sc.close();
       for(int i=1;i<=n;i++)
       {
        System.out.println(i+ " ");
       }
    }
}
