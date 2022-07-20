import java.util.Scanner;
class ReverseNum {
    public static void main(String[] args) {
        int n,m;
        System.out.println("Enter multiple number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        while(n>0)
        {
            m=n%10;
            System.out.print(m);
            // System.out.print(" revers number " + m);
            n=n/10;
        }
    }
}
