/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.TicTac;

/*
* IT-2650 Java Programming, Spring 2018
* Instructor: Martin P. Walsh
* Student Name: Daniel Fox
* Homework Assignment: Chap 17, Problem 2
* Purpose of Assignment: To create a GUI tic tac toe game.
*/


public class GameMethods {
    
    public char tileMarker(boolean xTurn, boolean oTurn, int count){
        if((count % 2 == 1)&&(count <= 9)){
            xTurn = true;
        }else{
            oTurn = true;
            xTurn = false;
        }
        String letter;
        if(xTurn){
            letter =  "X";
        }else{
            letter = "O";
        }
        char tileLetter = letter.charAt(0);
        return tileLetter;
    }
    
    public boolean gameWon(char playerMark, char[][] board){
        for(int row = 0; row < 3; row++){
            int count = 0;
            for(int col = 0; col < 3; col++){
                if(board[row][col] == playerMark){
                    count++;
                }else{
                    count = 0;
                }
                if(count == 3){
                    return true;
                }
            }
        for(int col = 0; col < 3; col++){
            count = 0;
            for(row = 0; row < 3; row++){
                if(board[row][col] == playerMark){
                    count++;
                }else{
                    count = 0;
                }
                if(count == 3){
                    return true;
                }
            }
            
            }
        }
        if(board[1][1] == playerMark &&
           board[0][0] == playerMark &&
           board[2][2] == playerMark){
        return true;
        }
        return false;
    }
    
    public String check(boolean gameWon, boolean xTurn, boolean oTurn){
        if(gameWon && xTurn){
            return("X has won the game!");
        }else if(gameWon && oTurn){
            return("O has won the game!");
        }else{
            return("The game was a tie.");
        }
    }
    
}
