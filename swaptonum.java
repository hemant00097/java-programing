// import java.util.Scanner;
// class swaptonum {
//     public static void main(String[] args) {
//         int a ,b,c;
//         System.out.println("Enter two number ");
//         Scanner sc=new Scanner(System.in);
//         a=sc.nextInt();
//         b=sc.nextInt();
//         sc.close();

//         System.out.println("before swiping " + a +" "+ b );
//         c=a;
//         a=b;
//         b=c;
//         System.out.println("Aftre swiping "+ a + " " + b);

//     }
// }


import java.util.Scanner;
class swaptonum {
    public static void main(String[] args) {
        int a ,b,c;
        System.out.println("Enter three number ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sc.close();

        System.out.println("before swiping " + a +" "+ b +" "+c);
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.println("Aftre swiping "+ a + " " + b + " "+c);

    }
}
