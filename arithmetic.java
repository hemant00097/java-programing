import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args){
    int a,b;
    System.out.println("Enter the number");
    Scanner obj =new Scanner(System.in);
    a=obj.nextInt();
    b=obj.nextInt();
    obj.close();
    System.out.println("add "+(a+b));
    System.out.println("div "+(a/b));
    System.out.println("milti "+(a*b));
    System.out.println("sub "+(a-b));
    System.out.println("remi "+(a%b));
    }
}
