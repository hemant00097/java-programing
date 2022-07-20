import java.util.Scanner;
class Sumn
 {
 public static void main(String[] args) 
 {
    int n,sum=0;
    System.out.println("Enter tha number");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    sc.close();
    for(int i=1;i<=n;i++)
    {
       sum=sum+i;
    }
    System.out.println("Addisem "+sum);
 }
}
