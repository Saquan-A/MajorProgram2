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
public class PushReelMower extends WalkBehindMower {
    private int numWheels;
    
    public PushReelMower() {
        super();
        numWheels = 0;
        
    }

    /**
     * @return the numWheels
     */
    public int getNumWheels() {
        return numWheels;
    }

    /**
     * @param numWheels the numWheels to set
     */
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    @Override
    public String toString() {
        String largeString7 = super.toString()+System.getProperty("line.separator")+numWheels+"\n";
        return largeString7;
    }
    
}
