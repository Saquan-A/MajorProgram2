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
public class GasPoweredMower extends WalkBehindMower {
    private Engine engine;
    private boolean selfPropelled;
    
    public GasPoweredMower() {
        super();
        engine = new Engine();
        selfPropelled = false;
    }

    /**
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * @return the selfPropelled
     */
    public boolean isSelfPropelled() {
        return selfPropelled;
    }

    /**
     * @param selfPropelled the selfPropelled to set
     */
    public void setSelfPropelled(boolean selfPropelled) {
        this.selfPropelled = selfPropelled;
    }
    
    @Override
    public String toString() {
        String largeString6 = super.toString()+System.getProperty("line.separator")+engine.toString()+System.getProperty("line.separator")+selfPropelled+"\n";
        return largeString6;
    }
}
