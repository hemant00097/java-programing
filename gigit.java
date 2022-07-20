import java.util.Scanner;
class gigit 
{
    public static void main(String[] args) 
    {
        int n,count=0;
        System.out.println("Enter tha reng number ");
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
