package Phoebe;

import java.util.ArrayList;

/**
 * Az árkot megvalósító osztály
 */
public class OutsideField implements Field{

	/**
	 * Az árok konstruktora
	 * @param n Segédparaméter, a tabuláláshoz segítség   
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
	 * Az interfészben megkövetelt függvény megvalósítása.
	 * Meghívja a ráugró megfelelõ függvényét
	 * @param  jumping Aki ráugrott a mezõre
	 * @param  n Segédparaméter, a tabuláláshoz segítség  
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
