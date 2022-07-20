// class Maximum {
//     public static void main(String[] args) 
//     {
//      int a=10,b=20;
//      if(a>b) {

//         System.out.println(a);
//      }  
//      else{
//         System.out.println(b);
//      }
//     }
// }
import java.util.Scanner;
class Maximum {
    public static void main(String[] args) 
    {
     int a,b,c;
     System.out.println("Enter three Number");
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     sc.close();
     if(a>b)    //
      {
         if(a>c){
            System.out.println(a);
         }
         else
         {
            System.out.println(c);
         }
        
      }
     else{
      if(b>c){
         System.out.println(b);
      }
      else
      {
         System.out.println(c);
      }
     
    }
    }
}

