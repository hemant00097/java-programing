import java.util.Scanner;
class relational {
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter two number");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        obj.close();
        System.out.println("true/false " +(a>b));
        System.out.println("true/false " +(a<b));
        System.out.println("true/false " +(a>=b));
        System.out.println("true/false " +(a<=b));
        System.out.println("true/false " +(a==b));
        System.out.println("true/false " +(a!=b));
    }
}
