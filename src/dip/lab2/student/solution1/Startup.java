/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author jordanrehbein
 */
public class Startup {
    public static void main(String[] args) {
        TipCalculator clac = new BartenderServiceTipCalculator(1, 5);
        
        TipCalculator clac2 = new FoodServiceTipCalculator(100.00, ServiceQuality.GOOD);

        
        TipCalculatorService service = new TipCalculatorService(clac);
        
        double tip = service.getTipAmount();
        
        System.out.println(tip);
    }
}