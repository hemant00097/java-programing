import java.util.Scanner;
class Nameday {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the case number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        switch(n)
        {
            case 1: System.out.println("SUNDAY");
            break;
            case 2: System.out.println("MONDAY");
            break;
            case 3: System.out.println("TUESDAY");
            break;
            case 4: System.out.println("WEDNESDAY");
            break;
            case 5: System.out.println("THURSDAY");
            break;
            case 6: System.out.println("FRIDAY");
            break;
            case 7: System.out.println("SATURDAY");
            break;
            default: System.out.println("invalid number");
            break;
        }
    }
}

// class Nameday {
 
      
//     public class JavaDateGetDayExample1 {  
  
//         public static void main(String[] args) 
//         {  
//             Date d=new Date();  
//             System.out.println("day of the week is  : "+d.getDay());  
//         }  
//     }  
//   }