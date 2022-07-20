import java.util.Scanner;
class UserInput{
        public static void main(String[] args)
        {
            int a,b;
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the Number");
            a= obj.nextInt();
            b=obj.nextInt();
            obj.close();
            System.out.println(a+ "  "+b);
        }

}
