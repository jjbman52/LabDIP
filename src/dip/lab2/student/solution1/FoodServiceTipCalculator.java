package dip.lab2.student.solution1;

public class FoodServiceTipCalculator implements TipCalculator {
    private double billAmount;
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(double billAmount, ServiceQuality serviceQuality) {
        this.billAmount = billAmount;
        this.serviceQuality = serviceQuality;
    }
    
    @Override
    public double getTipAmount(){
        double tip = 0;
        
        switch(serviceQuality){
            case GOOD:
                tip = billAmount * goodTip;
                break;
                
            case FAIR:
                tip = billAmount * fairTip;
                break;
                
            case POOR:
                tip = billAmount * poorTip;
                break;
        }
        
        return tip;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public double getGoodTip() {
        return goodTip;
    }

    @Override
    public void setGoodTip(double goodTip) {
        this.goodTip = goodTip;
    }

    @Override
    public double getFairTip() {
        return fairTip;
    }

    @Override
    public void setFairTip(double fairTip) {
        this.fairTip = fairTip;
    }

    @Override
    public double getPoorTip() {
        return poorTip;
    }

    @Override
    public void setPoorTip(double poorTip) {
        this.poorTip = poorTip;
    }

    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    @Override
    public void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }
}
