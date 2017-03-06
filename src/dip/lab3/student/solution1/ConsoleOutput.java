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
public class ConsoleOutput implements Output {
    
    @Override
    public final void produceOutput(String line) {
        if(line == null || line.isEmpty() || line.length() < 2){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            System.out.println(line);
        }
    }
}
