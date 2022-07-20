import java.util.Scanner;
public class Calci {
    public static void main(String[] args){
    int a,b;
    System.out.println("Enter the number");
    Scanner obj =new Scanner(System.in);
    a=obj.nextInt();
    b=obj.nextInt();
    obj.close();
    System.out.println("addition "+(a+b));
    System.out.println("division  "+(a/b));
    System.out.println("multiplication "+(a*b));
    System.out.println("subtraction "+(a-b));
    System.out.println("remainder "+(a%b));
    }
}
