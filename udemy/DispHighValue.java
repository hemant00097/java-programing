/* 
//create the table called displayhighScorePosition 
//it should a players name as a parameter and a 2nd paremeter as a position in the hight score table 
//you should display the  players  name along with a message like "managed to get into position "
// and the position they and a further message "on the high score table".
*/
//Create a 2nd methed called calculaterHighScorePosition 
//it should be send one argument only , the player score
//it should return an int
// the reurn data should be 
//1 if the score is > 1000
//2 if the score is > 500 and < 1000
//3 if the score is > 100 and < 500
//4 in all other cases
// call both methods  nd display the results of the following 
//a score of 1500, 900, 400, and 50


public class DispHighValue {
     
    public static void displayHighScore(String playerName , int position) {
    System.out.println(playerName + " managed to get into position "
     + position + " on the high score table ");

    }
    public static int calculaterHighScorePosition(int playerscore) {
        if(playerscore >1000){
            return 1;
        }else if (playerscore > 500 && playerscore < 1000){
            return 2;
        }else if (playerscore > 100 && playerscore < 500 ){
            return 3;
        }else{
           return 4;
        }
    }
        public static void main(String[] args){

            displayHighScore("hemant" , calculaterHighScorePosition (1500));
        }
    }