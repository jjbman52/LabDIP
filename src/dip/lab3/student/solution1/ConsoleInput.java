/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author jordanrehbein
 */
public class ConsoleInput implements Input {
    
    @Override
    public final String getInput() {
        // Prompt for Console input is Console - output maybe any Class that implements Output
        Output output = new ConsoleOutput();
        output.produceOutput("Please enter what you would like your message to say: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        if(input == null || input.isEmpty() || input.length() < 2){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            return input;
        }
    }
}
