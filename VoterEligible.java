import java.util.Scanner;
class VoterEligible 
{
    public static void main(String[] args) 
    {
        int age;
        System.out.println("Enter your Age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        sc.close();

        if(age>=18){
            System.out.println("Eligible ");
        }
        else{
            System.out.println("not Eligible");
        }
        
    }
    
}
