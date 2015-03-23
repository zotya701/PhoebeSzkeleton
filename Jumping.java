package Phoebe;

/**
 * Az ugrani k�pes oszt�lyok interf�sze
 */
public interface Jumping {
	
	/**
	 * Ez a f�ggv�ny h�v�dik meg ha a Jumping objektum normalField-re �rkezik
	 * @param  nf A NormalField amire �rkezik.
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g  
	 */
	public void normalField(int n, NormalField nf);
	
	/**
	 * Ha a Jumping objektum ragacs csapd�ra(Goo-ra) 
	 * l�pett, ez a f�ggv�ny h�v�dik meg
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g  
	 */
	public void onGoo(int n);
	
	/**
	 * Ha a Jumping objektum olaj csapd�ra(Oil-ra)
	 *  l�pett, ez a f�ggv�ny h�v�dik meg
	 * @param  Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
	 */
	public void onOil(int n);
	
	/**
	 * Ha a Jumping objektum m�sik robottal 
	 * �tk�zik, ez a f�ggv�ny h�v�dik meg
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g  
	 */
	public void onRobot(int n);
	
	/**
	 * Ha a Jumping objektum �rokba(OutsideField-re) 
	 * l�pett, ez a f�ggv�ny h�v�dik meg
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g  
	 */
	public void onOutside(int n);
	
}
