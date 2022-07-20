import java.util.Scanner;
class Armstong {
    public static void main(String[] args) {
        int num,arm=0,rem,c;
        System.out.println("Enter any number ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sc.close();
        c=num;
        while(num>0)
        {
            rem=num%10;
            arm=(rem*rem*rem)+arm;
            num=num/10;

        }
        if(c==arm){
            System.out.println("Armstong Number");
        }
         else{
            System.out.println("not Armstong Number");
        }
        
    }
}