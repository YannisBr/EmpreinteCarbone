package ConsoCarbone;
import java.util.*;

/**
 * Alimentation est une classe caracterisant le poste de consommation Carbone de l'utilisateur concernant son Alimentation.
 * Elle h�rite de la Classe ConsoCarbone.
 * @author Yannis & Mounirou
 *
 */
public class Alimentation extends ConsoCarbone{
    private double txBoeuf, txVege;
    private final double a = 8, b = 1.6, c = 0.9;
    private void makeImpact(){
        this.impact = this.a * this.txBoeuf + this.b * (1 - this.txVege - this.txBoeuf) + this.c * this.txVege;
    }

    /**
     * Constructeur par d�fault permettant d'initialiser un objet de la Classe Alimentation.
     * @author Yannis & Mounirou
     *
     */
    public Alimentation(){
        super();
        this.txBoeuf = 0.0;
        this.txVege = 0.0;
    }
    
    /**
     * Constructeur param�tr� permettant d'initialiser un objet de la Classe Alimentation.
     * @param txB d�crivant le taux de repas (une valeur entre 0 et 1) � base de boeuf de l'utilisateur.rice.
     * @param  txV d�crivant le taux de repas (une valeur entre 0 et 1) v�g�tariens de l'utilisateur.rice.
     * @author Yannis & Mounirou
     * @throws Exception 
     *
     */
    public Alimentation(double txB, double txV) throws Exception  {
    	super();
    	
    	if (txB<0 || txB>1)
    		throw new Exception("La valeur du taux de repas � base de Boeuf doit �tre comprise entre 0 et 1");
    	
    	if (txV<0 || txV>1)
    		throw new Exception("La valeur du taux de repas vegetariens doit �tre comprise entre 0 et 1");
    	
        this.txBoeuf = txB;
        this.txVege = txV;
        this.makeImpact();
    }
    
    /**
     * Constructeur param�tr� permettant d'initialiser un objet de la Classe Alimentation � partir d'une instance de la classe Alimentation :
     * @param a un poste de consommation carbone concernant l'Alimentation.
     * @author Yannis & Mounirou
     */
    
    public Alimentation(Alimentation a){
        super();
        this.txBoeuf = a.getTxBoeuf();
        this.txVege = a.getTxVege();
        this.makeImpact();
    }

    /**
     * M�thode permettant l'acc�s en lecture � l'attribut txBoeuf d�crivant le taux de repas (une valeur entre 0 et 1) � base de boeuf de l'instance courante.
     * @return le Taux de repas � base de Boeuf de l'instance courante.
     * @author Yannis & Mounirou
     */
    
    public double getTxBoeuf(){
        return this.txBoeuf;
    }
    
    /**
     * M�thode permettant l'acc�s en lecture � l'attribut txVege d�crivant le taux de repas v�g�tariens de l'instance courante.
     * @return le taux de repas vegetariens de l'instance courante.
     * @author Yannis & Mounirou
     */
    public double getTxVege(){
        return this.txVege;
    }
    
    /**
     * M�thode permettant l'acc�s en lecture � l'attribut ID correspondant � un identifiant unique attribu� � l'objet parent.
     * @return l'ID de l'objet parent.
     * @author Yannis & Mounirou
     */
    
    public int getId(){
        return super.getId();
    }
    
    /**
     * M�thode permettant de demander un changement d'�tat de l'attribut txBoeuf de l'instance courante par le parametre txB.
     * @param txB  Le taux de repas (une valeur entre 0 et 1) � base de boeuf de l'utilisateur.rice.
     * @author Yannis & Mounirou
     * @throws Exception 
     */
    
    public void setTxBoeuf(double txB) throws Exception{
    	
    	if (txB<0 || txB>1)
    		throw new Exception("La valeur du taux de repas � base de Boeuf doit �tre comprise entre 0 et 1");
    	
        this.txBoeuf = txB;
        
    }
    
    /**
     * M�thode permettant de demander un changement d'�tat de l'attribut txVege de l'instance courante par le parametre txV.
     * @param txV  Le taux de repas v�g�tariens de l'utilisateur.rice.
     * @author Yannis & Mounirou
     * @throws Exception 
     */
    
    public void setTxVege(double txV) throws Exception{
    	if (txV<0 || txV>1)
    		throw new Exception("La valeur du taux de repas vegetariens  doit �tre comprise entre 0 et 1");
        this.txVege = txV;
    }
    
    /**
     * M�thode statique d�taillant sur la console l�empreinte carbone moyenne d�un.e fran�ais.e vis-�-vis de l'Alimentation. 
     * @author Yannis & Mounirou
     */
    
    public static void empreinteCarbonneMoyenne(){
        String msg = "Empreinte carbonne moyenne d'un français pour l'alimentation en Kg eq CO2 / an\n";
        msg+="Viandes et poissons : 1144\nProduit laitiers et oeufs : 408\nAutes : 538\nBoissons : 263\nTotal : 2353";
        System.out.println(msg);
    }
    

    /**
     * {@inheritDoc}
     * On demande successivement via la console les Taux de repas � base de Boeuf et v�g�tariens de l'utilisateur.rice.
     * On cr�e un Scanner "scan" permettant de stocker les valeurs indiqu�es par l'utilisateur.rice. dans les attributs de l'instance courante.
     * On calcule l'impact de l�alimentation de l�utilisateur.rice en terme d��missions de GES en TCO2eq.
     * @author Yannis & Mounirou
     */
    
    
    @Override
    public void init(){
        System.out.println("************************ALIMENTATION*************************");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nTaux de repas à base de boeuf (en pourcentage): ");
        this.txBoeuf = scan.nextDouble()/100;
        System.out.print("\nTaux de repas v�g�tariens (en pourcentage): ");
        this.txVege = scan.nextDouble()/100;
        this.makeImpact();
    }
    
    /**
     * {@inheritDoc}
     * Affiche le Taux de repas � base de Boeuf, le taux de repas v�g�tariens ainsi que l'impact de l'instance courante.
     * @return Cha�ne de caractere d�crivant le Taux de repas � base de Boeuf, le taux de repas v�g�tariens ainsi que l'impact de l'instance courante.
     * @author Yannis & Mounirou
     */
    
    
    @Override
    public String toString(){
        String msg = super.toString();
        msg+=" / type : alimentation / taux de repas � base de Boeuf : "+this.getTxBoeuf()+" / taux de repas v�g�tariens : "+this.getTxVege()+" / impact : "+this.impact+" ]";
        return msg;
    }
}