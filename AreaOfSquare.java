import java.util.Scanner;
class AreaOfSquare {
    public static void main(String[] args) {
        int side,area;
        System.out.println("enter side of square ");
        Scanner sc=new Scanner(System.in);
        side=sc.nextInt();
        sc.close();
        area=side*side;
        System.out.println("Area of square " + area);
    }
}
