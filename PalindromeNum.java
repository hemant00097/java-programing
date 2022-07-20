import java.util.Scanner;
class PalindromeNum {
    public static void main(String[] args) {
         int n,r ,sum=0;
         System.out.println("Enter the range of numbers ");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         sc.close();

         while(n>0)
         {
            r=n%10;
            sum=sum+r;
            n=n/10;
            
            // System.out.print(" reverse number " + r);
        
         }
         System.out.print(sum);
    }
    
}
