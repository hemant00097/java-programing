import java.util.Scanner;
class simpleif {
   public static void main(String[] args)
   {
    int n;
    System.out.println("Enter the number");
    Scanner r=new Scanner(System.in);
    n=r.nextInt();
    r.close();
    if(n>=0)
    {
        System.out.println("+ve Number");
    }
    else
    {
        System.out.println("-ve Number");
    }
   }
}
