import java.util.Scanner;
class LadderIfElse {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        if(a>=80)
        {
           System.out.println("Topper"); 
        }
        else if(a<80 && a>=60)
        {
            System.out.println("second");
        }
        else if(a<60 && a>=35)
        {
            System.out.println("third");
        }
        else
        {
            System.out.println("Fail");
        }
        obj.close();
    }
}
