package Phoebe;

import java.util.ArrayList;

/**
 * Az �rkot megval�s�t� oszt�ly
 */
public class OutsideField implements Field{

	/**
	 * Az �rok konstruktora
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g   
	 */
	public OutsideField(int n){
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
	 * Az interf�szben megk�vetelt f�ggv�ny megval�s�t�sa.
	 * Megh�vja a r�ugr� megfelel� f�ggv�ny�t
	 * @param  jumping Aki r�ugrott a mez�re
	 * @param  n Seg�dparam�ter, a tabul�l�shoz seg�ts�g  
	 */
	public void arrived(int n, Jumping jumping) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"arrived(Jumping)");
		//
		
		jumping.onOutside(n+1);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"arrived(Jumping)");
		//
	}
	
	/**
	 *
	 */
	public String toString(){
		return "OutsideField.";
	}

}
