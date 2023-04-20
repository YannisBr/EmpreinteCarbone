package Tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import ConsoCarbone.BienConso;

/**
 * BienConsoTest est une classe de tests JUnit pour la classe BienConso permettant de r�aliser des tests unitaires.
 * @author Yannis & Mounirou
 *
 */

public class BienConsoTest{
		
		private BienConso bienConso1;
		private BienConso bienConso2;
	    private BienConso bienConso3 = new BienConso(10.0);
	    
	   
	    
	    /**
	     * M�thode qui sera ex�cut�e avant l'ensemble des tests.
	     * Initialise trois Objets de la classe BienConso avec trois constructeurs diff�rents.
	     * @author Yannis & Mounirou
	     */
	    
	    
		@Before
		public void initialiser() throws Exception{
			bienConso1 = new BienConso();
			bienConso2=new BienConso(20.0);
	        bienConso3=new BienConso(bienConso3);
		}
		
		
	    /**
	     * M�thode qui sera ex�cut�e apres l'ensemble des tests.
	     * Permet de rendre null chaque objet cr�e.
	     * @author Yannis & Mounirou
	     */
		
		@After
		public void nettoyer() throws Exception {
		bienConso1 = null;
		bienConso2=null;
		bienConso3=null;
		}
		
	    /**
	     * Test permettant de v�rifier que l'objet bienConso1 a bien �t� cr�e.
	     * Sinon le message "L'instance n'est pas cr��e" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		
		@Test
		public void testBienConso1() {
		assertNotNull("L'instance n'est pas cr��e",
		bienConso1);


		}
		
	    /**
	     * Test permettant de v�rifier que l'objet bienConso2 a bien �t� cr�e.
	     * Sinon le message "L'instance n'est pas cr��e" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		@Test
		public void testBienConso2() {
		assertNotNull("L'instance n'est pas cr��e",
		bienConso2);
		}
		
	    /**
	     * Test permettant de v�rifier que l'objet bienConso3 a bien �t� cr�e.
	     * Sinon le message "L'instance n'est pas cr��e" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		@Test
		public void testBienConso3() {
		assertNotNull("L'instance n'est pas cr��e",
		bienConso3);
		}
		
	    /**
	     * Test permettant de verifier si la m�thode getMontant() appel�e par l'instance bienConso1 fonctionne bien.
	     * On verifie si on a �galit� entre la valeur du montant obtenue via l'appel � la m�thode getMontant() de l'instance bienConso1 et la valeur du montant ayant permis de construire l'instance bienConso1. 
	     * Sinon le message "Le Montant des d�penses annuelles est incorrect " est affich�.
	     * @author Yannis & Mounirou
	     */
		
		@Test
		public void testgetMontant1() {
		assertEquals("Le Montant des d�penses annuelles est incorrect ",0.0,
		bienConso1.getMontant(),0.0);
		}
		
	    /**
	     * Test permettant de verifier si la m�thode getMontant() appel�e par l'instance bienConso2 fonctionne bien.
	     * On verifie si on a �galit� entre la valeur du montant obtenue via l'appel � la m�thode getMontant() de l'instance bienConso2 et la valeur du montant ayant permis de construire l'instance bienConso2. 
	     * Sinon le message "Le Montant des d�penses annuelles est incorrect " est affich�.
	     * @author Yannis & Mounirou
	     */
		@Test
		public void testgetMontant2() {
		assertEquals("Le Montant des d�penses annuelles est incorrect ",20.0,
		bienConso2.getMontant(),0.0);
		}
		
	    /**
	     * Test permettant de verifier si la m�thode getMontant() appel�e par l'instance bienConso3 fonctionne bien.
	     * On verifie si on a �galit� entre la valeur du montant obtenue via l'appel � la m�thode getMontant() de l'instance bienConso3 et la valeur du montant ayant permis de construire l'instance bienConso3. 
	     * Sinon le message "Le Montant des d�penses annuelles est incorrect " est affich�.
	     * @author Yannis & Mounirou
	     */
		
		@Test
		public void testgetMontant3() {
		assertEquals("Le Montant des d�penses annuelles est incorrect ",10.0,
		bienConso3.getMontant(),0.0);
		}
		
	    /**
	     * Test permettant de verifier si la m�thode getId() appel�e par l'instance bienConso1 fonctionne bien.
	     * On verifie si on a �galit� entre la valeur du montant obtenue via l'appel � la m�thode getId() de l'instance bienConso1 et la valeur du montant ayant permis de construire l'instance bienConso1. 
	     * Sinon le message "L'ID est incorrect" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		@Test
	    public void testgetId1(){
		assertEquals("L'ID est incorrect", 2,
		bienConso1.getId(),0.0);
			}
		
	    /**
	     * Test permettant de verifier si la m�thode getId() appel�e par l'instance bienConso2 fonctionne bien.
	     * On verifie si on a �galit� entre la valeur du montant obtenue via l'appel � la m�thode getId() de l'instance bienConso2 et la valeur du montant ayant permis de construire l'instance bienConso2. 
	     *  Sinon le message "L'ID est incorrect" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		
		@Test
	    public void testgetId2(){
		assertEquals("L'ID est incorrect", 7,
		bienConso2.getId(),0.0);
		}
		
	    /**
	     * Test permettant de verifier si la m�thode getId() appel�e par l'instance bienConso3 fonctionne bien.
	     * On verifie si on a �galit� entre la valeur du montant obtenue via l'appel � la m�thode getId() de l'instance bienConso3 et la valeur du montant ayant permis de construire l'instance bienConso3. 
	     * Sinon le message "L'ID est incorrect" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		
		@Test
	    public void testgetId3(){
		assertEquals("L'ID est incorrect", 12,
		bienConso3.getId(),0.0);
		}
		

	    /**
	     * Test permettant de verifier si la m�thode setMontant() permet bien de modifier l'etat de l'attribut Montant de l'instance bienConso1.
	     * On modifie l'etat de l'attribut Montant de l'instance bienConso1 par la m�thode setMontant().
	     * On verifie si on a �galit� entre la valeur du montant obtenue via l'appel � la m�thode getMontant() et la valeur du montant introduite en parametre de la m�thode setMontant().
	     * Sinon le message "Le Montant des d�penses annuelles est incorrect" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		
		
		@Test
		public void testsetMontant1() {
		bienConso1.setMontant(50.0);
		assertEquals("Le Montant des d�penses annuelles est incorrect",
		50.0, bienConso1.getMontant(),0.0);
		}

		
	    /**
	     * Test permettant de verifier si la m�thode setMontant() permet bien de modifier l'etat de l'attribut Montant de l'instance bienConso2.
	     * On modifie l'etat de l'attribut Montant de l'instance bienConso2 par la m�thode setMontant().
	     * On verifie si on a �galit� entre la valeur du montant obtenue via l'appel � la m�thode getMontant() et la valeur du montant introduite en parametre de la m�thode setMontant().
	     * Sinon le message "Le Montant des d�penses annuelles est incorrect" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		
		
		@Test
		public void testsetMontant2() {
		bienConso2.setMontant(50.0);
		assertEquals("Le Montant des d�penses annuelles est incorrect",
		50.0, bienConso2.getMontant(),0.0);
		}
		
	    /**
	     * Test permettant de verifier si la m�thode setMontant() permet bien de modifier l'etat de l'attribut Montant de l'instance bienConso3.
	     * On modifie l'etat de l'attribut Montant de l'instance bienConso3 par la m�thode setMontant().
	     * On verifie si on a �galit� entre la valeur du montant obtenue via l'appel � la m�thode getMontant() et la valeur du montant introduite en parametre de la m�thode setMontant().
	     * Sinon le message "Le Montant des d�penses annuelles est incorrect" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		
		
		@Test
		public void testsetMontant3() {
		bienConso3.setMontant(50.0);
		assertEquals("Le Montant des d�penses annuelles est incorrect",
		50.0, bienConso3.getMontant(),0.0);
		}
		
		
	    /**
	     * Test permettant de verifier si la m�thode getImpact() appel�e par l'instance bienConso1 fonctionne bien.
	     * On verifie si on a �galit� entre la valeur de l'impact obtenue via l'appel � la m�thode getImpact() de l'instance bienConso1 et la valeur de l'impact obtenu par calcul via l'appel � la m�thode getMontant().
	     * Sinon le message "L'impact est incorrect" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		
		
		@Test
		public void testgetImpact1() {
		assertEquals("L'impact est incorrect", bienConso1.getMontant()/1750,
		bienConso1.getImpact(),0.0);
		}
		
		
	    /**
	     * Test permettant de verifier si la m�thode getImpact() appel�e par l'instance bienConso2 fonctionne bien.
	     * On verifie si on a �galit� entre la valeur de l'impact obtenue via l'appel � la m�thode getImpact() de l'instance bienConso2 et la valeur de l'impact obtenu par calcul via l'appel � la m�thode getMontant().
	     * Sinon le message "L'impact est incorrect" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		
		
		@Test
		public void testgetImpact2() {		
			
		assertEquals("L'impact est incorrect",bienConso2.getMontant()/1750 ,
		bienConso2.getImpact(),0.0);
		}
		
	    /**
	     * Test permettant de verifier si la m�thode getImpact() appel�e par l'instance bienConso3 fonctionne bien.
	     * On verifie si on a �galit� entre la valeur de l'impact obtenue via l'appel � la m�thode getImpact() de l'instance bienConso3 et la valeur de l'impact obtenu par calcul via l'appel � la m�thode getMontant().
	     * Sinon le message "L'impact est incorrect" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		
		@Test
		public void testgetImpact3() {	
		assertEquals("L'impact est incorrect",bienConso3.getMontant()/1750,
		bienConso3.getImpact(),0.0);
		}
		
	    /**
	     * Test permettant de verifier si la m�thode toString() appel�e par l'instance bienConso1 fonctionne bien.
	     * On verifie si on a �galit� entre le message affich� via l'appel � la m�thode toString() et le message attendu.
	     * Sinon le message "Le message affich� est incorrect" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		
		@Test
	    public void testToString1()
	    {
			String msg1="[ conso carbone ID: "+bienConso1.getId();
	        String expected1= msg1+" / type : bien conso / montant : "+bienConso1.getMontant()+" / impact : "+bienConso1.getImpact()+" ]";
	        assertEquals("Le message affich� est incorrect",expected1, bienConso1.toString());
	    }
		
		
	    /**
	     * Test permettant de verifier si la m�thode toString() appel�e par l'instance bienConso2 fonctionne bien.
	     * On verifie si on a �galit� entre le message affich� via l'appel � la m�thode toString() et le message attendu.
	     * Sinon le message "Le message affich� est incorrect" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		
		@Test
	    public void testToString2()
	    {
			String msg2="[ conso carbone ID: "+bienConso2.getId();
	        String expected2= msg2+" / type : bien conso / montant : "+bienConso2.getMontant()+" / impact : "+bienConso2.getImpact()+" ]";
	        assertEquals("Le messsage affich� est incorrect",expected2, bienConso2.toString());
	    }
		
	    /**
	     * Test permettant de verifier si la m�thode toString() appel�e par l'instance bienConso3 fonctionne bien.
	     * On verifie si on a �galit� entre le message affich� via l'appel � la m�thode toString() et le message attendu.
	     * Sinon le message "Le message affich� est incorrect" est affich�.
	     * @author Yannis & Mounirou
	     */
		
		
		@Test
	    public void testToString3()
	    {
		    String msg3="[ conso carbone ID: "+bienConso3.getId();
	        String expected3= msg3+" / type : bien conso / montant : "+bienConso3.getMontant()+" / impact : "+bienConso3.getImpact()+" ]";
	        assertEquals("Le message affich� est incorrect",expected3, bienConso3.toString());
	    }
		
		
}
	

