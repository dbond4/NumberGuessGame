/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managed.beans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import service.MessageService;
import service.NumberService;

/**
 *
 * @author F03 H4MM3R
 */
@Named
@SessionScoped
public class NumberBean implements Serializable{
    private int number;
    private int randomNumber;
    private String hint;
    @Inject
    private NumberService numberService;
    @Inject
    private MessageService messageService;

    public NumberBean() {
        randomNumber = (int)(Math.random()*10);
    }
        
  public String checkGuess() {
     
    if ( number == randomNumber ) {
       hint = messageService.guessCorrect();
    } 
    else {
        
      if ( number > randomNumber ) 
         hint = messageService.guessSmallerNumber();
      else 
          hint = messageService.guessLargerNumber();
    }
    return null;
  }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public NumberService getNumberService() {
        return numberService;
    }

    public void setNumberService(NumberService numberService) {
        this.numberService = numberService;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
       
    
}
