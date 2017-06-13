package dpp;

public class ASAExprEntier extends ASAExpr {
    
    private final int valeur;
    
    public ASAExprEntier(int valeur) {
        this.valeur = valeur;
    }
      
    public String getLabelExplorateur() {
        return "ENTIER = " + valeur;
    }
    
    public int evalue() {
        return valeur;
    }
}