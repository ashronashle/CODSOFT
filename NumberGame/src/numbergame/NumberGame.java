/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numbergame;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.ArrayList;
        
/**
 *
 * @author 27749
 */
public class NumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    JOptionPane.showMessageDialog(null, "HEYY!\nWelcome to Betha Number Game\nYou will get 3 attempts");
    Random random1 =new Random();
    int totalPlayed=0;
    ArrayList<Integer> score = new ArrayList<Integer>();
    ArrayList<Integer> played = new ArrayList<Integer>();
    int random =random1.nextInt(100) +1;
       Game(random,score,played);
    while(true){
    int playAgain= 0;
    //if (playAgain == JOptionPane.CANCEL_OPTION){}
   //if( playAgain.equals(JOptionPane.OK_CANCEL_OPTION)){
   //System.exit(0);
   
   //}
    
    
     //int choice=Integer.parseInt(playAgain);
      try {
            playAgain=Integer.parseInt(JOptionPane.showInputDialog("""
                                                 Thank you for Playing!!
                                                 
                                                 Please choose an option below by inputting the relevent number:
                                                 1.) Play Again
                                                 2.) View Score
                                                 3.) Exit the Game"""));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, " Please Enter a Number as listed Above" );
        }
        // Ensure that the number entered is are not equals to 0 or  greater than 3
        if (playAgain<0||playAgain>3 ) {
           JOptionPane.showMessageDialog(null, " Please Enter a Number as listed Above" );
        }
       
        switch (playAgain) {
            case 1:
                random =random1.nextInt(100) +1;
                Game(random,score,played);
                break;
            case 2:
                int total=0;
                 for(int j=0;j<score.size();j++){
              total+= score.get(j);
                 }
                 totalPlayed = 0;
              for(int n=0;n<played.size();n++){
              totalPlayed+= played.get(n);
                                       }
                JOptionPane.showMessageDialog(null, "Your Score is: " + total + "\nGame Played: " +totalPlayed );
                break;
            case 3:System.exit(0);
                break;}
    }
    }
    
    public static void Game(int random ,ArrayList score,ArrayList played){ 
    int play=0;
    
         int answer =random;
        int guessedNum = 0;
    while(play<3){
    String guess ="";
        boolean validInput = false;

        // Loop until the user enters a valid numerical guess
        while (!validInput) {
            guess = JOptionPane.showInputDialog("Guess a number between 1 and 100");
            try {
                // Attempt to convert the input to an integer
                guessedNum = Integer.parseInt(guess);
                if (guessedNum<=0 ||guessedNum>=100){
            JOptionPane.showMessageDialog(null, "Please enter a number that more than 0 and less than 100");
                 validInput =false;
             }
                else{validInput = true;}
                 // If successful, mark input as valid
            } catch (NumberFormatException e) {
                // If conversion fails, show error message and continue loop
                JOptionPane.showMessageDialog(null, "Please enter a numerical value.");
            
            }
            
             
        }
    
    
   
   
    if (guessedNum==answer){
    JOptionPane.showMessageDialog(null, "Congratulations!!!\n The Number was " + answer+"\n");
    score.add(1);
    break;
    
    }
    else if (guessedNum >answer ){
     JOptionPane.showMessageDialog(null, "Sorry, The number you guessed was: Too High\n\n Try guessing lower!");
    }
    else{
     JOptionPane.showMessageDialog(null, "Sorry, The number you guessed was: Too low \n\n Try guessing higher!");
     
    }
    
    play++;
    
              }
    if(guessedNum != answer){
        JOptionPane.showMessageDialog(null, "Sorry! You are out of attempts!\nThe number was: " + answer+"\n");
    
    }
    played.add(1);
    }
    
}
    
