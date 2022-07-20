import java.util.Scanner;
class month {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        if(n==1){
            System.out.println("Jan = 31 Day ");
        }
        else if(n==2)
        {
            System.out.println("Far = 28 Day ");
        }
        else if(n==3)
        {
            System.out.println("March = 31 Day ");
        }
        else if(n==4)
        {
            System.out.println("Apr = 30 Day ");
        }
        else if(n==5)
        {
            System.out.println("May = 31 Day ");
        }
        else if(n==6)
        {
            System.out.println("Jun = 30 Day ");
        }
        else if(n==7)
        {
            System.out.println("July = 31 Day ");
        }
        else if(n==8)
        {
            System.out.println("Aug = 3Day ");
        }
        else if(n==9)
        {
            System.out.println("Sep = 31 Day ");
        }
        else if(n==10)
        {
            System.out.println("Oct = 31 Day ");
        }
        else if(n==11)
        {
            System.out.println("Nov = 30 Day ");
        }
        else if(n==12)
        {
            System.out.println("Dec = 31 Day ");
        }
        else 
        {
            System.out.println("Envlade number ");
        }
    
    }
}
