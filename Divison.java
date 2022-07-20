import java.util.Scanner;
class Divison {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        if(n%5==0){
          System.out.println("Divide");
        }
        else{
            System.out.println("not divide");
        }
    }
}
