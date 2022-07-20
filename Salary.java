import java.util.Scanner;
class Salary
{
   public static void main(String[] args) {
     int sal;
     double tax;
     System.out.println("Enter the salary");
     Scanner sc=new Scanner (System.in);
     sal=sc.nextInt();
     sc.close();
     if(sal<=10000){
        System.out.println("No tax "+ sal);
     }
     else if(sal>10000 && sal<=100000)
        {
          tax=sal*0.10;
         System.out.println("tax 10 % " +tax);   
        }
     else{
        tax=sal*0.20;
         System.out.println("tax 20 % " +tax); 
        }

   }
    
}