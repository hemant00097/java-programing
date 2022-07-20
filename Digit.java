import java.util.Scanner;
class Digit 
{
    public static void main(String[] args) 
    {
        int n,count=0;
        System.out.println("Enter the range number ");
        Scanner sc= new Scanner (System.in);
        n=sc.nextInt();
        sc.close();
        while(n>0)
         {
            n=n/10;
            count++;
            
        }  
        System.out.println("Num. of Digit "+ count); 
    }
}
