class compair {      
   static int a=10; //static variabl
   void fun(){
    int b= 20; //local variabl
    System.out.println(a+" "+b);
    ++a; ++b;
   }
   public static void main(String[] args)
   {
    compair r= new compair();
    r.fun();
    r.fun();
   }
}
