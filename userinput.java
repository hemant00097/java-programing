import java.util.Scanner;
class userinput{
        public static void main(String[] args)
        {
            int a,b;
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the number");
            a= obj.nextInt();
            b=obj.nextInt();
            obj.close();
            System.out.println(a+ "  "+b);
        }

}
