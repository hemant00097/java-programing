import java.util.Scanner;
class PosiNegaNum {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        if(n>0){
            System.out.println("+ve number");
        }
        else if(n<0){
            System.out.println("-ve number");
        }
     else{
        System.out.println(" Neither  +ve or -ve number");
     }
    }
}
