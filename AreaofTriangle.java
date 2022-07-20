import java.util.Scanner;
class AreaofTriangle {
    public static void main(String[] args) {
         int b,h;
         float sum;
         System.out.println("Enter value for side for angle ");
        Scanner sc=new Scanner(System.in);
        b=sc.nextInt();
        h=sc.nextInt();
        sc.close();

        sum=b*h/2;
        System.out.println(" Area of Triangle "+ sum);
    }
}
