class Compare {      
   static int a=10; //static variabl
   void fun(){
    int b= 20; //local variabl
    System.out.println(a+" "+b);
    ++a; ++b;
   }
   public static void main(String[] args)
   {
    Compare r= new Compare();
    r.fun();
    r.fun();
   }
}
