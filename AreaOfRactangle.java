import java.util.Scanner;
class AreaOfRactangle {
    public static void main(String[] args) {
        
    int l,b ,area;
    System.out.println("enter the value");
    Scanner sc= new Scanner(System.in);
    l=sc.nextInt();
    b=sc.nextInt();
    sc.close();
    area=l*b;
    System.out.println("Area of ractangle " +  area);


  }

}
