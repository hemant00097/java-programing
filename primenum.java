import java.util.Scanner;
class PrimeNum {
    public static void main(String[] args) {
        int num,count=0;
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sc.close();
        for(int i=1; i<=num;i++)
        {
          if(num%i==0)
          {
            count++;
          }
        }
        if(count==2){
            System.out.println(" prime number ");
        }
        else{
            System.out.println("not prime number ");
        }
    }
}
