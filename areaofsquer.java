import java.util.Scanner;
class areaofsquer {
    public static void main(String[] args) {
        int side,area;
        System.out.println("enter side of squer ");
        Scanner sc=new Scanner(System.in);
        side=sc.nextInt();
        sc.close();
        area=side*side;
        System.out.println("Area of crical " + area);
    }
}
