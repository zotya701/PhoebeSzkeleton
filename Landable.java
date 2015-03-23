package Phoebe;

/**
 * Azoknak az oszt�lyoknak az interf�sze, akik a NormalFielden el�fordulhatnak
 */
public interface Landable {
	
	/**
	 * Az �t megval�s�t� oszt�lyok azon f�ggv�nye,
	 * amely egy Jumping objektum r��rkez�sekor h�v�dik meg.
	 * @param  jumping A Jumping objektum amivel kapcsolatba l�p
	 * @param n  Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
	 */
	public void interact(int n, Jumping jumping);
	
}
