import java.util.Scanner;
class Square {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        double m=Math.sqrt(n);
        System.out.println(" square root of " + n +" is "+ m);
    }
}
