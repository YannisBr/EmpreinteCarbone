package ConsoCarbone;
/**
 * ServicesPublics est une classe caracterisant le poste de consommation Carbone induit par les services publics (justice, police, �ducation, sant�, ...). 
 * Ce poste de consommation carbone a la particularit� que tou.te.s les Fran�ais.e.s ont la m�me empreinte de 1.5TCO2eq pour ce poste de consommation.
 * Elle h�rite de la Classe ConsoCarbone.
 * @author Yannis & Mounirou
 *
 */
public final class ServicesPublics extends ConsoCarbone{
    private static ServicesPublics instance = null;
    private void makeImpact(){
        this.impact = 1.5;
    }
    private ServicesPublics(){
        super();
        this.makeImpact();
    }
    
    /**
     * M�thode statique qui pourra �ventuellement invoquer le constructeur. 
     * Le design pattern Singleton permettant de s'assurer qu'une classe ne puisse cr�er qu'une seule unique instance. 
     * @return Objet unique de la classeServicesPublics.
     * @author Yannis & Mounirou
     */

    public static ServicesPublics getInstance(){
        if (instance == null){
            instance = new ServicesPublics();
        }
        return instance;
    }
    
    /**
     * {@inheritDoc}
     * Affiche l'impact de l'instance courante.
     * @return Cha�ne de caractere d�crivant l'impact de l'instance courante.
     * @author Yannis & Mounirou
     */
    

    public String toString(){
        String msg = super.toString();
        msg += " / type : service public / impact : "+this.getImpact()+" ]";
        return msg;
    }
}
