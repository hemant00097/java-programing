//write a methed called ckeckNumber with an int parameter number.
//The methed  should not return value , and it needs to print out :-
//"positive" if the parameter number is > 0;
//"negative" if the parameter number is < 0;
//"zero" if the parameter number is equal to 0 ;
//NOTE = The ckeckNumber methed needs to be defined as [public staic like we have been doing so far in the course

public class PositiveNegativeOrZero {

    public static void ckeckNumber(int number){
        if(number > 0) {
            System.out.println("positive");
        }else if(number < 0){
            System.out.println("negative");
        }else if(number == 0){
            System.out.println("Zero");
        }
    }

     public static void main(String[] args) {
        ckeckNumber(100);
    }

}
