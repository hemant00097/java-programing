import java.util.Scanner;
class SimpleIfElse
{
    public static void main(String[] args) {
        int age;
        System.out.println("Enter the age");
        Scanner sc=new Scanner(System.in);
        age =sc.nextInt();
        sc.close();
        if(age>=18)
        {
            System.out.println("Eligible the vote");
        }
        else{
            System.out.println("not Eligible");
        }
    }
}