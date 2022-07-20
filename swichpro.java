 import java.util.Scanner;
 class swichpro 
 {
    public static void main(String[] args) 
    {
        int a=10, b=20,ch;
        System.out.println("Enter the choich");
        Scanner obj= new Scanner(System.in);
        ch=obj.nextInt();
        obj.close();
        switch(ch)
        {
            case 1:System.out.println("sum "+(a+b));
            break;
            case 2:System.out.println("sub "+(a-b));
            break;
            case 3:System.out.println("div "+(a/b));
            break;
            case 4:System.out.println("molti " +(a*b));
            break;
            default:System.out.println("Invalid choice ");
        }
        System.out.println("out of switch");

    }
}
