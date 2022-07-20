public class logical {
    public static void main(String[] args){
        System.out.println("logical and");
        System.out.println((10>5)&&(2>1));  //ture
        System.out.println((10>5)&&(2<1));  //false
        System.out.println((10<5)&&(2<1));  //false
    
        System.out.println("logical OR");
        System.out.println((10>5)||(2>1));  //true
        System.out.println((10>5)||(2<1));  //true
        System.out.println((10<5)||(2<1));  //false
    
        System.out.println("logical not");
        System.out.println(!(10>5));  //false
        System.out.println(!(10<5));  //true
    }
}
