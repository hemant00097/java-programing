import java.util.Scanner;
class CalculateAvg {
    public static void main(String[] args) {
        
        int a,b,c,d,e;
        System.out.println("Enter the marks");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        sc.close();

        int sum=a+b+c+d+e;
        System.out.println("Totel marks " +sum);

        double avg=sum/5.0;
        System.out.println("totel average " +avg);
        
    }
}
