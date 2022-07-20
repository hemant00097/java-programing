// #  TOTAL NUMBER TO MULTPLIYE NUMBER

// class Factorial 
// {
//     public static void main(String[] args) 
//     {
//         int n=5,num=1;
      
//         for(int i=1; i<=n ;i++)
//         {
//             num=num*i;
            
//         }
//         System.out.println(num);
        
//     }
    
//}


// # WAP TO 5x4x3x2x1=120

// class Factorial  
// {
//     public static void main(String[] args) 
//     {
//         int n=5,num=1;
      
//         for(int i=n; i>=1 ;i--)
//         {
//             num=num*i;
//             System.out.print(i);
//             if(i==1)
//             {
//                 break;
//             }
//             else{
//                 System.out.print("x");
//             }
//         }
//         System.out.println(" = " +num);
        
//     }
//  }

import java.util.Scanner;
class Factorial 
{
    public static void main(String[] args) 
    {
        int n,num=1;
        System.out.println("Enter the Number");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        obj.close();
        for(int i=n; i>=1 ;i--)
        {
            num=num*i;
            System.out.print(i);
            if(i==1)
            {
                break;
            }
            else{
                System.out.print("x");
            }
        }
        System.out.println(" = " +num);       
    }
}    
