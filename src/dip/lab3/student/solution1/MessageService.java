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
public class MessageService {
    private Input input;
    private Output output;

    public MessageService(Input input, Output output) {
        this.input = input;
        this.output = output;
    }
    
    public void getMessage() {
        String line = input.getInput();
        output.produceOutput(line);
    }

    public final Input getInput() {
        return input;
    }

    public final void setInput(Input input) {
        if(input == null){
            throw new IllegalArgumentException("Input is not valid.");
        }else {
            this.input = input;
        }
    }

    public final Output getOutput() {
        return output;
    }

    public final void setOutput(Output output) {
        if(output == null){
            throw new IllegalArgumentException("Output is not valid.");
        }else {
            this.output = output;
        }
    }
}
