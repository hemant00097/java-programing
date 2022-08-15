class Student3  
{
    int Boy(int physics, int chemistery, int maths)
    {
        return physics+chemistery+maths;
    }
    void girls(int total)
    {
        double pere=total/300*100;
        System.out.println(pere);
    }
    public static void main(String[] args) 
    {
        Student3 S1=new Student3();
        int X=S1.Boy(85,85,70);
        S1.girls(X);
        
    }
}