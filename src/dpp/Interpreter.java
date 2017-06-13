/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpp;

import canvas.Tortue;
import canvas.TortueImpl;

/**
 *
 * @author aureliengarret
 */
public class Interpreter {
    private ASAInstr prog;
    private Tortue t;
    
    public Interpreter(ASAInstr prog) {
        this.prog=prog;
        t = new TortueImpl();
    }
    
    public void run() {
        prog.execute(t);
    }
}
