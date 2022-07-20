import java.util.Scanner;
class Ascii 
{
    public static void main(String[] args) 
    {
        char ch;
        System.out.println("Enter the Character ");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        sc.close();
        int a= ch;
        System.out.println("Ascii value is " + ch +  " is "+ a);

        
    }
    
}
