public class Ternary {
    public static void main(String[] args) {
        int a=10,b=20,c=30,MAX;
        MAX = (a>b) ? ( a>c ? a:c ) : (b>c ? b:c);
        System.out.println(MAX);
    }
    
}
