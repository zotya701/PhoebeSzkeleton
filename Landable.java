package Phoebe;

/**
 * Azoknak az osztályoknak az interfésze, akik a NormalFielden elõfordulhatnak
 */
public interface Landable {
	
	/**
	 * Az õt megvalósító osztályok azon függvénye,
	 * amely egy Jumping objektum ráérkezésekor hívódik meg.
	 * @param  jumping A Jumping objektum amivel kapcsolatba lép
	 * @param n  Segédparaméter, a tabuláláshoz segítség 
	 */
	public void interact(int n, Jumping jumping);
	
}
