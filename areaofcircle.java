import java.util.Scanner;
class AreaOfCircle {
    public static void main(String[] args) {
        double PI=3.14,area;
        int r;
        System.out.println("Enter the range ");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        sc.close();
        area= PI*r*r;
        System.out.println("Area of circle " + area );
    }
}
