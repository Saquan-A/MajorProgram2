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
public class LawnTractor extends Mower {
    private Engine engine;
    private String model;
    private double deckWidth;
    
    public LawnTractor(){
        super();
        engine = new Engine();
        model = " ";
        deckWidth = 0.0;
        
    }
    
    public LawnTractor(String model, double deckWidth) {
        super();
        engine = new Engine();
        this.model = model;
        this.deckWidth = deckWidth;
         
                
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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the deckWidth
     */
    public double getDeckWidth() {
        return deckWidth;
    }

    /**
     * @param deckWidth the deckWidth to set
     */
    public void setDeckWidth(double deckWidth) {
        this.deckWidth = deckWidth;
    }
    
    @Override
    public String toString(){
        String largeString3 = super.toString()+System.getProperty("line.separator")+engine.toString()+model+System.getProperty("line.separator")+deckWidth+"\n";
        return largeString3;
    }
}
