/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg457_project;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author killua
 */
public class AddCheckInGUI extends JFrame{

    private JLabel pid, o, dat, ken;
    private JTextField pidF, oF, datF, kenF;
    private JButton submit, exit;
    
    public AddCheckInGUI() {
    
        pid = new JLabel("Patient ID:");      pid.setBounds(20,20, 100,30);
        o = new JLabel("Office ID:");      o.setBounds(20,60, 100,30);
        dat = new JLabel("Date:");          dat.setBounds(20,180, 100,30);
        ken = new JLabel("Kennel#:");        ken.setBounds(20,220, 100,30);
        
        
        pidF = new JTextField();    pidF.setBounds(200,20, 100,30);
        oF = new JTextField();      oF.setBounds(200,60, 100,30);
        datF = new JTextField();   datF.setBounds(200,180, 100,30);
        kenF = new JTextField();    kenF.setBounds(200,220, 100,30);
        
        submit = new JButton("Submit");
        submit.setBounds(300,500,150,30);  
        submit.addActionListener((ActionEvent event) -> {
            //implement
            String p = pidF.getText();
            String off = oF.getText();
            String d = datF.getText();
            String k = kenF.getText();

            DB database = new DB();
            database.addCheckIn(p, off, d, k);
            dispose();
            new ResultGUI(database.getCheckIn());
        });
        
        exit = new JButton("Exit");
        exit.setBounds(700,500,150,30);  
        exit.addActionListener((ActionEvent event) -> {
            //implement
            dispose();
        });
        
        add(pid);add(o);add(dat);add(ken);
        add(pidF);add(oF);add(datF);add(kenF);
        add(submit);add(exit);
        
        setSize(1000,800);  
        setLayout(null);  
        
        setVisible(true); 
    }
    
}
