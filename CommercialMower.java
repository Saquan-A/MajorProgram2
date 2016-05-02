/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

/**
 *
 * @author saqua
 */
public class CommercialMower extends LawnTractor {
    private double operatingHours;
    private boolean zeroTurnRadius;
    
    public CommercialMower() {
        super();
        operatingHours = 0.0;
        zeroTurnRadius = true;
        
    }

    /**
     * @return the operatingHours
     */
    public double getOperatingHours() {
        return operatingHours;
    }

    /**
     * @param operatingHours the operatingHours to set
     */
    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }

    /**
     * @return the zeroTurnRadius
     */
    public boolean isZeroTurnRadius() {
        return zeroTurnRadius;
    }

    /**
     * @param zeroTurnRadius the zeroTurnRadius to set
     */
    public void setZeroTurnRadius(boolean zeroTurnRadius) {
        this.zeroTurnRadius = zeroTurnRadius;
    }
    @Override
    public String toString() {
        String largeString4 = super.toString()+System.getProperty("line.separator")+operatingHours+System.getProperty("line.separator")+zeroTurnRadius+"\n";
        return largeString4;
    }
    
    
    
}
