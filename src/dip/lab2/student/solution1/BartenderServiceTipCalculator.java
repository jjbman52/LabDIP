package dip.lab2.student.solution1;

public class BartenderServiceTipCalculator implements TipCalculator {
    private double amountPerDrink;
    private int drinkCount;

    public BartenderServiceTipCalculator(double amountPerDrink, int drinkCount) {
        this.amountPerDrink = amountPerDrink;
        this.drinkCount = drinkCount;
    }
    
    @Override
    public final double getTipAmount(){
        return amountPerDrink * drinkCount;
    }

    public final double getAmountPerDrink() {
        return amountPerDrink;
    }

    public final void setAmountPerDrink(double amountPerDrink) {
        this.amountPerDrink = amountPerDrink;
    }

    @Override
    public final double getGoodTip() {
        return 0;
    }

    @Override
    public final void setGoodTip(double goodTip) {
        
    }

    @Override
    public final double getFairTip() {
        return 0;
    }

    @Override
    public final void setFairTip(double fairTip) {
        
    }

    @Override
    public final double getPoorTip() {
        return 0;
    }

    @Override
    public final void setPoorTip(double poorTip) {
        
    }

    public final int getDrinkCount() {
        return drinkCount;
    }

    public final void setDrinkCount(int drinkCount) {
        this.drinkCount = drinkCount;
    }

    @Override
    public ServiceQuality getServiceQuality() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setServiceQuality(ServiceQuality serviceQuality) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
