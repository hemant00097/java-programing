import java.util.Scanner;
public class Vowel 
{
    public static void main(String[] args) 
    {
       char ch;   
       System.out.println("Enter The Character ");
       Scanner sc= new Scanner(System.in); 
       ch=sc.next().charAt(0);
       sc.close();
       if( ch=='a' || ch=='e' || ch=='i' || ch=='o' ||  ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch == 'O' || ch=='U')
        {
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }

    }
    
}
