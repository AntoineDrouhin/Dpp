/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpp;

import canvas.Tortue;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antoine
 */
public class ASAInstrBloc implements ASAInstr {

    private List<ASAInstr> l;
    
    public ASAInstrBloc() {
        l = new ArrayList<>();
    }
    
    public void add(ASAInstr instr){
        l.add(instr);
    }
    
    @Override
    public void execute(Tortue t) {
        for (ASAInstr i : l) {
            i.execute(t);
        }
    }
    
}
