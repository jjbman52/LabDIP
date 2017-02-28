/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author jordanrehbein
 */
public class GuiInput implements Input {

    @Override
    public final String readInput() {
        String input = JOptionPane.showInputDialog(null, "Enter Message");
        
        if(input == null || input.isEmpty() || input.length() < 2){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            return input;
        }
    }
}
