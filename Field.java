package Phoebe;

/**
 * A mezõk általános viselkedését definiáló interfész.
 */
public interface Field {
	
	/**
	 * A mezõ(Field) leszármazottainak kötelezõen meg kell valósítania ezt a függvény.
	 * A mezõre ugró objektumok és a mezõ közötti interakciót valósítja meg
	 * @param  jumping Az ugrani képes (Jumping) objektum
	 * @param  n  Segédparaméter, a tabuláláshoz segítség
	 */
	public void arrived(int n, Jumping jumping);
	
}
