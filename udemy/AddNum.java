public class AddNum {
    public static float sumNum(int firstNum, int secondNum , float thirdNum ){
        
        float addNum = firstNum + secondNum + thirdNum;

        return addNum;
    
    }
    public static int multiNum(int num1, int num2){
         int multiply = num1 * num2;
        return multiply;
    }
    public static void main(String[] args){
        
       float a = sumNum (100,200,10.55f);

        System.out.println(a);

        int b = multiNum(100, 202);

        System.out.println(b);
    }
}
