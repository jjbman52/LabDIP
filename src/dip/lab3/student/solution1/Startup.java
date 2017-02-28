/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author jordanrehbein
 */
public class Startup {
    public static void main(String[] args) {
        Input input = new GuiInput();
        Output output = new ConsoleOutput();
        
        MessageSystem messageSystem = new MessageSystem(input, output);
        
        messageSystem.getMessage();
    }
}
