//Let's test what have learned about operater.
// 1.Create a doubal variable with a value of 20.00.
// 2.  Create a second variabler of type double with the valve 80.00.
// 3. Add both number together and multiply by 100.00.
//4. Use the remainder operater to figuure out  what the remainder form the result of the operation in step 3 and 40.00.
// we used the modulus or operater on into in the course ,but we can also use it on a double .
//5. Create a boolean variable that assigns the value true if the remainder in #4 is  0, or false if its not zreo.
//6. output the booleam Variable.
//7.Write  an if-then statement that displays a message "Got some remainder" if the booleam in step in step 5 is not True.
//Don't be suriprised if you see output for this step , where you might expect it not to show . l'll explain it in my solution.

public class Opedoul {
     public static void main(String[] args) {
     
      double myfirstvalue = 20.00d;
      double mysecondvalue =80.00d;
      double mytotalvalue = myfirstvalue + mysecondvalue * 100;
      System.out.println("mytotalvalue  " + mytotalvalue);
      double theRemainder = mytotalvalue % 40.00d;
      System.out.println("theRemainder " + theRemainder);  
        boolean noReminder = (theRemainder == 0 )? true : false ;
        System.out.println("noRemainder  " + noReminder);
        if ( ! noReminder )
        {
            System.out.println("Got some reminder");

        }
    }





}
