package Phoebe;

/**
*  A ragacs csapda (Trap) viselked�s�t megval�s�t� oszt�ly
*/
public class Goo implements Landable, Trap{

	/**
	 * A ragacs konstruktora
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g  
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
	 * A ragacs interakci�ja a "r�ugr�kkal".
	 * @param  jumping a Jumping t�pus� objektum amivel kapcsolatba l�p a ragacs
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g  
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
