import java.util.Scanner;
class SumDigitNum {
   public static void main(String[] args) {
     int n , r,sum=0;
     System.out.println("Enter  the  number ");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     sc.close();
     while(n>0)
     {
       r=n%10;
       sum=sum+r;
       n=n/10; 

     }
     System.out.println("sum of digit " + sum);
   } 
}
