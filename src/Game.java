public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;


    //post condition all instance variables have been initialized
    public Game(){
        // instance of the game class
    }

    public boolean isBonus(){
        return true; //if this game is a bonus game and returns false otherwise
    }

    public void play(){
        //simulates the play of this GAME (consisting of three levels) and updates all relevant game data
    }

    public int getScore(){ //implemented in part a
        //returns the score earned in the most recently played game, as described in part(a)
        //precondition: num>0
        int result =0;
        if(levelOne.goalReached()) {
            result += levelOne.getPoints();
            if (levelTwo.goalReached()) {
                result += levelTwo.getPoints();
                if (levelThree.goalReached()) {
                    result += levelThree.getPoints();
                }
            }
        }

        if(isBonus()){
            result*=3;
        }
        return result;
    }

    public int playManyTimes(int num){
        int result = 0;
        for(int i=0;i<num;i++){
            play();
            if(getScore()>result){ // find the maximum score
                result=getScore();
            }
        }

        return result;
    }



}
