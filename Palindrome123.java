import java.util.Scanner;
class Palindrome123 {
    public static void main(String[] args) {
        int num,a,b,sum=0;
        System.out.println("Enter the order number ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sc.close();
        a=num;
        while(num>0)
        {
            b=num%10;
            sum=(sum*10)+b;
            num=num/10;

        }
        if(a==sum){
            System.out.println("Palindrome Number");
        }
         else{
            System.out.println("Not Palindrome Number");
        }
        
    }
}
