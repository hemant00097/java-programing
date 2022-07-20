import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        int n1,n2,ch,totel;
        System.out.println("Enter the two number");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Enter salect operater");
        ch=sc.nextInt();
        sc.close();
        if(ch==1){
           totel=n1+n2;
           System.out.println("addition "+ totel);
        }
        else if(ch==2){
            totel=n1-n2;
            System.out.println("subtraction "+ totel);
        }
        else if(ch==3){
            totel=n1*n2;
            System.out.println("multiplication "+ totel);
        }
        else if(ch==4){
            totel=n1/n2;
            System.out.println("division "+ totel);
        }
        else {
            totel=n1%n2;
            System.out.println("remainder "+ totel);
        }
    }
}
