package ConsoCarbone;

/**
 * ConsoCarbone est une classe impl�mentant l'interface Comparable et caracterisant un poste de Consommation Carbone g�n�rique.
 * @author Yannis & Mounirou
 *
 */
public class ConsoCarbone implements Comparable{
    
    private static int counter;
    private final int id;
    protected double impact;
    
    /**
     * Constructeur par d�fault permettant d'initialiser un objet de la Classe ConsoCarbone.
     * @author Yannis & Mounirou
     *
     */

    public ConsoCarbone(){
        counter++;
        this.id = counter;
        this.impact = 0.0;
    }
    
    
    /**
     * M�thode permettant l'acc�s en lecture � l'attribut id d�crivant l'ID de l'instance courante.
     * @return L'ID de l'instance courante.
     * @author Yannis & Mounirou
     */
    public int getId(){
        return this.id;
    }
    
    /**
     * M�thode permettant l'acc�s en lecture � l'attribut impact d�crivant l'impact de l'instance courante.
     * @return L'impact de l'instance courante.
     * @author Yannis & Mounirou
     */
    
    public double getImpact(){
        return this.impact;
    }
    
    /**
     * M�thode permettant de comparer l'objet de type ConsoCarbone en parametre avec l'instance courante en fonction de leurs impacts en termes d��missions de GES.
     * @param cc Une instance de la classe ConsoCarbone.
     * @author Yannis & Mounirou
     */
    
    public void compare(ConsoCarbone cc){
        if(this.impact > cc.getImpact()){
            System.out.println(this+" a un impact supérieur à "+cc);
        }else{
            System.out.println(cc+" a un impact supérieur à "+this);            
        }
    }

    /**
     * M�thode qui va permettre de cr�er un menu int�ractif afin d�int�ragir dans la console avec l�utlisateur.rice.
     * @author Yannis & Mounirou
     */
    
    public void init(){}
    
    /**
     * Affiche l'ID de l'instance de courante.
     * @return Cha�ne de caractere d�crivant l'ID de l'instance.
     * @author Yannis & Mounirou
     */
    
    public String toString(){
        return "[ conso carbone ID: "+this.getId();
    }
    
    
    
 
}
