import java.util.Scanner;
class CalculatePower {
    public static void main(String[] args) {
        int n,p , result=1;
        System.out.println("Enter the Number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the power ");
        p=sc.nextInt();
        sc.close();

        for(int i=1;i<=p;i++){

            result=result*n;
            
        }
        System.out.println( " result " + result);
    }
}
