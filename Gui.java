/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.Locale.Category;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import static oracle.jrockit.jfr.events.Bits.length;
import static sun.security.krb5.KrbException.errorMessage;

/**
 *
 * @author saqua
 * Adds all the buttons to the Gui However the view button only proves that the data is read into an array list.
 */
public class Gui extends javax.swing.JFrame implements java.awt.event.ActionListener{
    JButton View = new JButton("Viewing");
    JButton Add = new JButton("Adding");
    JButton Save = new JButton("Saving");
    JButton Exit = new JButton("Exiting");
    JPanel Control = new JPanel();
    JPanel nControl = new JPanel();
    //MowerWareHouse m = new MowerWareHouse();
    MowerWareHouse user = new MowerWareHouse();
    //JLabel Text1 = new JLabel("MajorProgram2 Mower Editor" );
    public Gui(){
        
        
        //nControl.add(Text1);
        Control.add(View);
        Control.add(Add);
        Control.add(Save);
        Control.add(Exit);
        add(Control , BorderLayout.SOUTH);
        add(nControl , BorderLayout.CENTER);
        View.addActionListener(this);
        Add.addActionListener(this);
        Save.addActionListener(this);
        Exit.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == View) {
            
         JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "Text File", "txt");
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(null);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
        System.out.println("You chose to open this file: " +
                chooser.getSelectedFile().getName());
        File loc = chooser.getSelectedFile();
        String loc1 = loc.getPath();
        user.readMowerData(loc1);
        System.out.println(user.toString());
        JOptionPane.showMessageDialog(null, user.toString());
       }
       }
        if(e.getSource() == Save){
            
            JFrame parentFrame = new JFrame();
        String sb = "SampleOutput1";
        String s = user.toString();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        int userSelection = fileChooser.showSaveDialog(parentFrame);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath() );
                try {
                     PrintStream output = new PrintStream(new File(fileChooser.getSelectedFile()+".txt"));
                    System.setOut(output);
                     output.print(sb);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        }
        }
        
        if(e.getSource() == Add){
             AddBtn frame = new AddBtn();
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             frame.pack();
             frame.setVisible(true);
        
        }
       if(e.getSource() == Exit){
           String ObjButtons[] = {"Yes", "No"};
           int promptResult = JOptionPane.showOptionDialog(Exit, "Are you sure you want to Exit Before Saving?", null, WIDTH, WIDTH, null, ObjButtons, e);
           if(promptResult == JOptionPane.YES_OPTION){
            System.exit(0);
           } else if (promptResult == JOptionPane.NO_OPTION) {
               JFrame parentFrame = new JFrame();
        String sb = "SampleOutput1";
        String s = user.toString();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        int userSelection = fileChooser.showSaveDialog(parentFrame);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath() );
                try {
                     PrintStream output = new PrintStream(new File(fileChooser.getSelectedFile()+".txt"));
                    System.setOut(output);
                     output.print(s);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        }
        System.exit(0);
           }
           
       }
   
    }   
}
