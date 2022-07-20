//print out a second score on the screen with the following
//score set to 4000
//levelcomplet set to 8
//bonus set to 200
// But make sure the first printout above still displays as well

public class Game {
    public static void main(String[] args) {
        boolean gameOver = true; 
        int score = 4000;
        int levelcomplet = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000 ) {
            System.out.println("your score was less than 5000 but greater than 1000");
        }
        else if(score < 1000){
            System.out.println("you score was less that 1000");
        }
        else{
            System.out.println("got here ");
        }

        if (gameOver == true){
            int finalscore =score + (levelcomplet * bonus);
            System.out.println("your fines score " +finalscore);
       }
   } 
}
