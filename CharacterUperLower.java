import java.util.Scanner;
class CharacterUperLower {
   public static void main(String[] args) {
    char ch,ch2;
    System.out.println("enter the character ");
    Scanner sc=new Scanner(System.in);
    ch=sc.next().charAt(0);
    sc.close();
    if(ch>'A'&& ch<='Z')
    {
        ch2=Character.toLowerCase(ch);
        System.out.println("Lowercase "+ch2);

    }
    else
    {
        ch2=Character.toUpperCase(ch);
        System.out.println("Uppercase "+ch2);

    }
   } 
}
// class CharecterUperLower{
//     public static void main(String[] args) {
//         char ch1='a',ch2='B',ch3='w';

//         char ch1UpperCase=Character.toUpperCase(ch1);
//         char ch2LOwerCase=Character.toLowerCase(ch2);
//         char ch3UpperCase=Character.toUpperCase(ch3);
//        System.out.println(ch1UpperCase);
//        System.out.println(ch2LOwerCase);
//        System.out.println(ch3UpperCase);
//     }
// }