package Phoebe;

/**
 * Az ugrani képes osztályok interfésze
 */
public interface Jumping {
	
	/**
	 * Ez a függvény hívódik meg ha a Jumping objektum normalField-re érkezik
	 * @param  nf A NormalField amire érkezik.
	 * @param n Segédparaméter, a tabuláláshoz segítség  
	 */
	public void normalField(int n, NormalField nf);
	
	/**
	 * Ha a Jumping objektum ragacs csapdára(Goo-ra) 
	 * lépett, ez a függvény hívódik meg
	 * @param n Segédparaméter, a tabuláláshoz segítség  
	 */
	public void onGoo(int n);
	
	/**
	 * Ha a Jumping objektum olaj csapdára(Oil-ra)
	 *  lépett, ez a függvény hívódik meg
	 * @param  Segédparaméter, a tabuláláshoz segítség 
	 */
	public void onOil(int n);
	
	/**
	 * Ha a Jumping objektum másik robottal 
	 * ütközik, ez a függvény hívódik meg
	 * @param n Segédparaméter, a tabuláláshoz segítség  
	 */
	public void onRobot(int n);
	
	/**
	 * Ha a Jumping objektum árokba(OutsideField-re) 
	 * lépett, ez a függvény hívódik meg
	 * @param n Segédparaméter, a tabuláláshoz segítség  
	 */
	public void onOutside(int n);
	
}
