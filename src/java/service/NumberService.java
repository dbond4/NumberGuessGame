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
public class NumberService implements Serializable{
    public String createNumberMessage(int number) {
        return "You guessed " + number;
    }

}
