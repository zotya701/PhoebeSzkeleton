package Phoebe;

/**
 * A mez�k �ltal�nos viselked�s�t defini�l� interf�sz.
 */
public interface Field {
	
	/**
	 * A mez�(Field) lesz�rmazottainak k�telez�en meg kell val�s�tania ezt a f�ggv�ny.
	 * A mez�re ugr� objektumok �s a mez� k�z�tti interakci�t val�s�tja meg
	 * @param  jumping Az ugrani k�pes (Jumping) objektum
	 * @param  n  Seg�dparam�ter, a tabul�l�shoz seg�ts�g
	 */
	public void arrived(int n, Jumping jumping);
	
}
