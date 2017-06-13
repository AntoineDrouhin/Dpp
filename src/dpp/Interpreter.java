/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpp;

import canvas.Tortue;
import canvas.TortueImpl;
import javax.swing.JFrame;

/**
 *
 * @author aureliengarret
 */
public class Interpreter {
    private ASAInstr prog;
    private TortueImpl t;
    
    public Interpreter(ASAInstr prog) {
        this.prog=prog;
        t = new TortueImpl();
        
        JFrame mainFrame = new JFrame("Graphics demo");
        mainFrame.getContentPane().add(t);
        mainFrame.pack();
        mainFrame.setSize(500, 500);
        mainFrame.setVisible(true);
    }
    
    public void run() {
        prog.execute(t);
    }
}
