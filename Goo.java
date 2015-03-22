package Phoebe;

/**
*  A ragacs csapda (Trap) viselkedését megvalósító osztály
*/
public class Goo implements Landable, Trap{

	/**
	 * A ragacs konstruktora
	 * @param n Segédparaméter, a tabuláláshoz segítség  
	 */
	public Goo(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"constructor()");
		//
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"constructor()");
		//
	}
	
	/**
	 * A ragacs interakciója a "ráugrókkal".
	 * @param  jumping a Jumping típusú objektum amivel kapcsolatba lép a ragacs
	 * @param n Segédparaméter, a tabuláláshoz segítség  
	 */
	public void interact(int n, Jumping jumping) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"interact(Jumping)");
		//
		
		jumping.onGoo(n+1);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"interact(Jumping)");
		//
	}
	
	/**
	 *
	 */
	public String toString(){
		return "Goo.";
	}

}
