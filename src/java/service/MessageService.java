/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.io.Serializable;

/**
 *
 * @author F03 H4MM3R
 */
public class MessageService implements Serializable{
    
    public String guessSmallerNumber(){
        return "Guess a smaller number";
    }
    public String guessLargerNumber(){
        return "Guess a larger number";
    }
    public String guessCorrect(){
        return "You guessed correctly";
    }
    
}
