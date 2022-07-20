import java.util.Scanner;
class Simple {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        sc.close();
        if(a>=24)
        {
            System.out.println("confirm seat");
        }
    
        System.out.println("thank you");
    }

    
}