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
public class TipCalculatorService {
    private TipCalculator tipCalculator;

    public TipCalculatorService(TipCalculator tipCalculator) {
        setTipCalculator(tipCalculator);
    }
    
    public double getTipAmount(){
        return tipCalculator.getTipAmount();
    }

    public final TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public final void setTipCalculator(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
    
}
