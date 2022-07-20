class Variable {
         static int b =20; //static variable
         int c = 30 ; //intance variable

    public static void main(String[] args){

        Variable new_var = new Variable();
        int a= 10;  //local variable
        System.out.println(a);
        System.out.println(b);
        System.out.println(new_var.c);
    }
}
