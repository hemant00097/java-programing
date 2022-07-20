import java.util.Scanner;
class CharPrint 
{
    public static void main(String[] args) 
    {
        char ch;
        System.out.println("Enter the charecter");
        Scanner sc= new Scanner(System.in);
        ch=sc.next().charAt(0);
        sc.close();
        System.out.println(ch);
        
    }

    
}
