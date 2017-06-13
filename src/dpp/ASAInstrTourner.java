/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpp;

import canvas.Tortue;

/**
 *
 * @author Antoine
 */
public class ASAInstrTourner implements ASAInstr {
    
    private ASAExpr angle;
    
    public ASAInstrTourner(ASAExpr angle) {
        this.angle = angle;
    }
    
    @Override
    public void execute(Tortue t) {
        t.tourner(angle.evalue());
    }
    
}

