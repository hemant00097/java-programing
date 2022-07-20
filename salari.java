import java.util.Scanner;
class salari
{
   public static void main(String[] args) {
     int sal;
     double tax;
     System.out.println("Enter tha salary");
     Scanner sc=new Scanner (System.in);
     sal=sc.nextInt();
     sc.close();
     if(sal<=10000){
        System.out.println("No taxt "+ sal);
     }
     else if(sal>10000 && sal<=100000)
        {
          tax=sal*0.10;
         System.out.println("text 10 % " +tax);   
        }
     else{
        tax=sal*0.20;
         System.out.println("text 20 % " +tax); 
        }

   }
    
}