/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author saqua
 */
public class MajorProgram2 extends MowerWareHouse {
MowerWareHouse user = new MowerWareHouse();
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Gui fram = new Gui();
         fram.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //Set up the content pane.
          //frame.setSize(450, 250);
          fram.pack();

        //Display the window.
        fram.setVisible(true);
    
      /*  MowerWareHouse user = new MowerWareHouse();
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
    }*/
   }
}
