public class AreaOfPercentage {
    void Percentage(int physics, int chemistery, int maths ,int java)
    {
        int totel=physics+chemistery+maths+java;
        double Percentage=totel/400.0*100.0;
        System.out.println(Percentage);
    }
    public static void main(String[] args) {
        AreaOfPercentage S1=new AreaOfPercentage();
        S1.Percentage(80,75,65,80);   
    }
    
}
