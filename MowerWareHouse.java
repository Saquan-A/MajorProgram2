/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author saqua
 */
public class MowerWareHouse {
    private String storeName;
    private ArrayList<Mower> mowers;
    
    public MowerWareHouse() {
        storeName = " ";
        mowers = new ArrayList<>();
    }
    public MowerWareHouse(int y){
        mowers = new ArrayList<>();
    }
    /**
     * @return the storeName
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * @param storeName the storeName to set
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * @return the mowers
     */
     public int getNumMowers(){
        return mowers.size();
    }
    public Mower getMowers(int item){
        return mowers.get(item); 
    }
    public void setMowers(int index, Mower item ) {
       mowers.set(index, item);
    }
    public void addMowers( Mower item) {
        mowers.add(item);
    }
    public void removeMowers(int index){
        mowers.remove(index);
    }
   
    
    public void readMowerData(String inputFileName)  {
        
        
        try{
             File data = new File(inputFileName);
             Scanner reader = new Scanner(data);
                 String N1;
                 String N2;
                 int num1;
                 double num2;
                 String N3;
                 
             storeName = reader.nextLine();
             while(reader.hasNext()){
                 
                 N1 = reader.nextLine();
                 num1 = Integer.parseInt(reader.nextLine());
                 N2 = reader.nextLine();
                 N3 = reader.nextLine();
                    if(N3.equals("L")){
                        
                      LawnTractor L = new LawnTractor();
                    //  MowerWareHouse m = new MowerWareHouse(0);
                      L.setManufacturer(N1);
                      L.setYear(num1);
                      L.setSerialNumber(N2);
                        N2 = reader.nextLine();
                        num2 = Double.parseDouble(reader.nextLine());
                        num1 = Integer.parseInt(reader.nextLine());
                        Engine e = new Engine(N2, num2, num1);
                        L.setEngine(e);
                        N1 = reader.nextLine();
                        num2 = Double.parseDouble(reader.nextLine());
                        L.setModel(N1);
                        L.setDeckWidth(num2);
                        mowers.add(L);
                       // m.addMowers(L);
                        
                        
                        
                    } else if (N3.equals("C")){
                        CommercialMower C = new CommercialMower();
                        C.setManufacturer(N1);
                        C.setYear(num1);
                        C.setSerialNumber(N2);
                        N2 = reader.nextLine();
                        num2 = Double.parseDouble(reader.nextLine());
                        num1 = Integer.parseInt(reader.nextLine());
                        Engine e = new Engine(N2, num2, num1);
                        C.setEngine(e);
                        N1 = reader.nextLine();
                        num2 = Double.parseDouble(reader.nextLine());
                        C.setModel(N1);
                        C.setDeckWidth(num2);
                        num2 = Double.parseDouble(reader.nextLine());
                        boolean TF = Boolean.parseBoolean(reader.nextLine());
                        C.setZeroTurnRadius(TF);
                        C.setOperatingHours(num2);
                        
                        mowers.add(C);
                        
                        
                        
                        
                    } else if (N3.equals("G")){
                        GasPoweredMower G = new GasPoweredMower();
                        G.setManufacturer(N1);
                        G.setYear(num1);
                        G.setSerialNumber(N2);
                        num2 = Double.parseDouble(reader.nextLine());
                        double num3 = Double.parseDouble(reader.nextLine());
                        G.setCutWidth(num2);
                        G.setWheelDiameter(num3);
                         N2 = reader.nextLine();
                        num2 = Double.parseDouble(reader.nextLine());
                        num1 = Integer.parseInt(reader.nextLine());
                        Engine e = new Engine(N2, num2, num1);
                        G.setEngine(e);
                        boolean TF = Boolean.parseBoolean(reader.nextLine());
                        
                        G.setSelfPropelled(TF);
                        mowers.add(G);
                    }else if (N3.equals("P")){
                        PushReelMower P = new PushReelMower();
                        P.setManufacturer(N1);
                        P.setYear(num1);
                        P.setSerialNumber(N2);
                         num2 = Double.parseDouble(reader.nextLine());
                        double num3 = Double.parseDouble(reader.nextLine());
                        P.setCutWidth(num2);
                        P.setWheelDiameter(num3);
                        num1 = Integer.parseInt(reader.nextLine());
                        P.setNumWheels(num1);
                        mowers.add(P);
                        
                    }
                 
                    
             for (Mower m : mowers) {
                 if (m instanceof LawnTractor) {
                     System.out.println("*****\n" + m.toString());
                }
             }
                 
             
             
             }
        
        }catch(FileNotFoundException ex){
        
            System.out.println("The file was not found. Try again.");
        }        
    
    }
    
    public void saveMowerData(String outputFileName){
        JFrame parentFrame = new JFrame();
        String sb = "SampleOutput1";
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        int userSelection = fileChooser.showSaveDialog(parentFrame);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath() );
                try {
                     PrintStream output = new PrintStream(new File(fileChooser.getSelectedFile()+".txt"));
                    System.setOut(output);
                     output.print(toString());
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        }
    }
 public String toString(){
     String s = storeName+"\n";
     for(Mower m:mowers){
         s+=m.toString();
     
     }
     return s;
 }
//method to try to call the different items in the array list 
 public String getLawnTractor() {
    String s = "";
    Mower m = new Mower() {};
    
    for(int i = 0; i<mowers.size(); i++){
     mowers.get(0);
     
 }
     return s;
 }
}
