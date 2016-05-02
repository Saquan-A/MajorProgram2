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
 */
public class AddBtn extends Gui{
    //JPanel panel = new JPanel();
    JPanel frame = new JPanel();
    JButton L = new JButton("LawnTractor");
    JButton C = new JButton("CommericalMower");
    JButton G = new JButton("GasPoweredMower");
    JButton P = new JButton("PushReelMower");
    JTextField f1 = new JTextField();
    JTextField f2 = new JTextField();
    JTextField f3 = new JTextField();
    JTextField f4 = new JTextField();
    JTextField f5 = new JTextField();
    JTextField f6 = new JTextField();
    JTextField f7 = new JTextField();
    JTextField f8 = new JTextField();
    JTextField f9 = new JTextField();
    JTextField f10 = new JTextField();
    JTextField f11 = new JTextField();
    JTextField f12 = new JTextField();
    JTextField f13 = new JTextField();
    JTextField f14 = new JTextField();
    JTextField f15 = new JTextField();
  public AddBtn(){
      //setSize(750,100);
      
      frame.add(L);
      frame.add(C);
      frame.add(G);
      frame.add(P);
      add(frame , BorderLayout.SOUTH);
      L.addActionListener(this);
      C.addActionListener(this);
      G.addActionListener(this);
      P.addActionListener(this);
  }
    @Override
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == L) {
           LawnTractor L = new LawnTractor();
           JPanel p = new JPanel(new BorderLayout(5,5));
           JPanel panel = new JPanel(new GridLayout(0,1,2,2));
           panel.add(new JLabel("manufacturer(Mower)", SwingConstants.RIGHT));
           panel.add(new JLabel("Year", SwingConstants.RIGHT));
           panel.add(new JLabel("SerialNumber", SwingConstants.RIGHT));
           panel.add(new JLabel("manufacturer", SwingConstants.RIGHT));
           panel.add(new JLabel("hoursePower", SwingConstants.RIGHT));
           panel.add(new JLabel("cylinders", SwingConstants.RIGHT));
           panel.add(new JLabel("model", SwingConstants.RIGHT));
           panel.add(new JLabel("deckWidth", SwingConstants.RIGHT));
           p.add(panel, BorderLayout.WEST);
           
           JPanel control = new JPanel(new GridLayout(0,1,2,2));
           control.add(f1);
           control.add(f2);
           control.add(f3);
           control.add(f4);
           control.add(f5);
           control.add(f6);
           control.add(f7);
           control.add(f8);
           p.add(control, BorderLayout.CENTER);
           JOptionPane.showMessageDialog(null, p);
            L.setManufacturer(f1.getText());
            L.setYear(Integer.parseInt(f2.getText()));
            L.setSerialNumber(f3.getText());
           Engine ge = new Engine(f4.getText(), Double.parseDouble(f5.getText()), Integer.parseInt(f6.getText()));
           L.setEngine(ge);
           L.setModel(f7.getText());
           L.setDeckWidth(Double.parseDouble(f8.getText()));
           MowerWareHouse mowers = new MowerWareHouse();
           user.addMowers(L);
           
            JOptionPane.showMessageDialog(null, user.toString());
           
        } else if (e.getSource() == C) {
             CommercialMower C = new CommercialMower();
             JPanel p = new JPanel(new BorderLayout(5,5));
           JPanel panel = new JPanel(new GridLayout(0,1,2,2));
           panel.add(new JLabel("manufacturer(Mower)", SwingConstants.RIGHT));
           panel.add(new JLabel("Year", SwingConstants.RIGHT));
           panel.add(new JLabel("SerialNumber", SwingConstants.RIGHT));
           panel.add(new JLabel("manufacturer", SwingConstants.RIGHT));
           panel.add(new JLabel("hoursePower", SwingConstants.RIGHT));
           panel.add(new JLabel("cylinders", SwingConstants.RIGHT));
           panel.add(new JLabel("model", SwingConstants.RIGHT));
           panel.add(new JLabel("deckWidth", SwingConstants.RIGHT));
           panel.add(new JLabel("OperatingHours", SwingConstants.RIGHT));
           panel.add(new JLabel("ZeroTurnRadius", SwingConstants.RIGHT));
           p.add(panel, BorderLayout.WEST);
           
           JPanel control = new JPanel(new GridLayout(0,1,2,2));
           control.add(f1);
           control.add(f2);
           control.add(f3);
           control.add(f4);
           control.add(f5);
           control.add(f6);
           control.add(f7);
           control.add(f8);
           control.add(f9);
           control.add(f10);
           p.add(control, BorderLayout.CENTER);
           JOptionPane.showMessageDialog(null, p);
            C.setManufacturer(f1.getText());
            C.setYear(Integer.parseInt(f2.getText()));
            C.setSerialNumber(f3.getText());
           Engine ge = new Engine(f4.getText(), Double.parseDouble(f5.getText()), Integer.parseInt(f6.getText()));
           C.setEngine(ge);
           C.setModel(f7.getText());
           C.setDeckWidth(Double.parseDouble(f8.getText()));
           C.setOperatingHours(Double.parseDouble(f9.getText()));
           C.setZeroTurnRadius(Boolean.parseBoolean(f10.getText()));
           MowerWareHouse mowers = new MowerWareHouse();
           user.addMowers(C);
           JOptionPane.showMessageDialog(null, user.toString());
        } else if (e.getSource() == G) {
            GasPoweredMower G = new GasPoweredMower();
            JPanel p = new JPanel(new BorderLayout(5,5));
           JPanel panel = new JPanel(new GridLayout(0,1,2,2));
           panel.add(new JLabel("manufacturer(Mower)", SwingConstants.RIGHT));
           panel.add(new JLabel("Year", SwingConstants.RIGHT));
           panel.add(new JLabel("SerialNumber", SwingConstants.RIGHT));
           panel.add(new JLabel("manufacturer", SwingConstants.RIGHT));
           panel.add(new JLabel("hoursePower", SwingConstants.RIGHT));
           panel.add(new JLabel("cylinders", SwingConstants.RIGHT));
           panel.add(new JLabel("cutWidth", SwingConstants.RIGHT));
           panel.add(new JLabel("WheelDiameter", SwingConstants.RIGHT));
           panel.add(new JLabel("SelfPropelled", SwingConstants.RIGHT));
           p.add(panel, BorderLayout.WEST);
           
           JPanel control = new JPanel(new GridLayout(0,1,2,2));
           control.add(f1);
           control.add(f2);
           control.add(f3);
           control.add(f4);
           control.add(f5);
           control.add(f6);
           control.add(f7);
           control.add(f8);
           control.add(f9);
           p.add(control, BorderLayout.CENTER);
           JOptionPane.showMessageDialog(null, p);
           G.setManufacturer(f1.getText());
            G.setYear(Integer.parseInt(f2.getText()));
            G.setSerialNumber(f3.getText());
           Engine ge = new Engine(f4.getText(), Double.parseDouble(f5.getText()), Integer.parseInt(f6.getText()));
           G.setEngine(ge);
           G.setCutWidth(Double.parseDouble(f7.getText()));
           G.setWheelDiameter(Double.parseDouble(f8.getText()));
           G.setSelfPropelled(Boolean.parseBoolean(f9.getText()));
           MowerWareHouse mowers = new MowerWareHouse();
           user.addMowers(G);
           
           JOptionPane.showMessageDialog(null, user.toString());
           
        } else if (e.getSource() == P) {
           PushReelMower P = new PushReelMower();
           JPanel p = new JPanel(new BorderLayout(5,5));
           JPanel panel = new JPanel(new GridLayout(0,1,2,2));
           panel.add(new JLabel("manufacturer(Mower)", SwingConstants.RIGHT));
           panel.add(new JLabel("Year", SwingConstants.RIGHT));
           panel.add(new JLabel("SerialNumber", SwingConstants.RIGHT));
          
           panel.add(new JLabel("cutWidth", SwingConstants.RIGHT));
           panel.add(new JLabel("WheelDiameter", SwingConstants.RIGHT));
           panel.add(new JLabel("NumberWheels", SwingConstants.RIGHT));
           p.add(panel, BorderLayout.WEST);
           
           JPanel control = new JPanel(new GridLayout(0,1,2,2));
           control.add(f1);
           control.add(f2);
           control.add(f3);
          
           control.add(f7);
           control.add(f8);
           control.add(f9);
           p.add(control, BorderLayout.CENTER);
           JOptionPane.showMessageDialog(null, p);
           P.setManufacturer(f1.getText());
            P.setYear(Integer.parseInt(f2.getText()));
            P.setSerialNumber(f3.getText());
           
           P.setCutWidth(Double.parseDouble(f7.getText()));
           P.setWheelDiameter(Double.parseDouble(f8.getText()));
           P.setNumWheels(Integer.parseInt(f9.getText()));
           MowerWareHouse mowers = new MowerWareHouse();
           user.addMowers(P);
           JOptionPane.showMessageDialog(null, user.toString());

        }
      }   
}
