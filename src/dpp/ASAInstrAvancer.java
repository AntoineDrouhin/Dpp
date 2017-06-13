/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpp;

/**
 *
 * @author Antoine
 */
public class ASAInstrAvancer implements ASAInstr {
    
    private ASAExpr dist;
    
    public ASAInstrAvancer(ASAExpr dist) {
        this.dist = dist;
    }
    
    @Override
    public void execute(Tortue t) {
        t.avancer(dist.evalue());
    }
    
}
