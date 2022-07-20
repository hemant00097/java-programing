import java.util.Scanner;
class iadderifelse {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        if(a>=80)
        {
           System.out.println("Toper"); 
        }
        else if(a<80 && a>=60)
        {
            System.out.println("first");
        }
        else if(a<60 && a>=35)
        {
            System.out.println("second");
        }
        else
        {
            System.out.println("Fale");
        }
        obj.close();
    }
}
