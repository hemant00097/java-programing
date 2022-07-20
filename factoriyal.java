import java.util.Scanner;
class factoriyal {
    public static void main(String[] args) {
        int n,fun=1;
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            fun=fun*i;
           
        }
        System.out.println("factoriyl "+ fun);
    }
}
