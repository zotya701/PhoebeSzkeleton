package Phoebe;

/**
*  Az olaj csapda (Trap) viselkedését megvalósító osztály
*/
public class Oil implements Landable, Trap{

	/**
	 * Az olaj konstruktora
	 * @param  n Segédparaméter, a tabuláláshoz segítség  
	 */
	public Oil(int n){
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
	 * Az olaj interakciója a "ráugrókkal".
	 * @param  jumping a Jumping típusú objektum amivel kapcsolatba lép az olaj
	 * @param n Segédparaméter, a tabuláláshoz segítség  
	 */
	public void interact(int n, Jumping jumping) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"interact(Jumping)");
		//
		
		jumping.onOil(n+1);
		
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
		return "Oil.";
	}

}
