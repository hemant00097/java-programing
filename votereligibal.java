import java.util.Scanner;
class votereligibal 
{
    public static void main(String[] args) 
    {
        int age;
        System.out.println("Enter your ages");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        sc.close();

        if(age>=18){
            System.out.println("Eligibal ");
        }
        else{
            System.out.println("not eligibal");
        }
        
    }
    
}
