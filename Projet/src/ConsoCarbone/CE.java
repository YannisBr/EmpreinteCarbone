package ConsoCarbone;

/**
 * CE est une Enumeration avec 7 instances nomm�es {A, B, C, D, E, F, G} repr�sentant les diff�rentes classes �nerg�tiques possibles d�un logement.
 * @author Yannis & Mounirou
 *
 */
public enum CE{
    A("A",0.005),B("B",0.01),C("C",0.02),D("D",0.035),E("E",0.055),F("F",0.08),G("G",0.1);
    private String ce;
    private double alpha;
    private CE(String c, double a){
        this.ce = c;
        this.alpha = a;
    }

    /**
     * M�thode permettant l'acc�s en lecture � l'attribut alpha.
     * @return La valeur de l'attribut alpha associ� � la classe �nergetique de l'instance courante.
     * @author Yannis & Mounirou
     */
    
    public double getAlpha(){
        return this.alpha;
    }
    
    /**
     * M�thode permettant l'acc�s en lecture � l'attribut ce repr�sentant la classe �nergetique de l'instance courante.
     * @return La classe �nergetique de l'instance courante.
     * @author Yannis & Mounirou
     */
    
    public String getCe(){
        return this.ce;
    }
}