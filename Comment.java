class Comment {
    int a=10;   //Intance variable
    static int b=20;  //Static variable
    public static void main(String[] args){

        int c =30;  //local variable
        final int d =40; //final variable
        Comment t=new Comment();
        System.out.println(t.a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
    
}
