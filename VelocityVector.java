package Phoebe;

import java.awt.Point;

/**
 * Sebességvektor, tárol egy irányt és egy sebességet.
 */
public class VelocityVector {
	
	private Point direction;
	private int velocity;
	
	/**
	 * Az osztály kontruktora.
	 * @param  p Kezdõirány
	 * @param  v Kezdõsebesség
	 * @param  n Segédparaméter, a tabuláláshoz segítség 
	 */
	public VelocityVector(int n, Point p, int v){
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
	 * Az irány változtatását  kezelõ függvény.
	 * @param  p Beállítandó irány.
	 * @param  n Segédparaméter, a tabuláláshoz segítség 
	 */
	public void setDirection(int n, Point p){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"setDirection(Point)");
		//
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"setDirection(Point)");
		//
	}
	
	/**
	 *A sebesség változtatását kezelõ függvény
	 * @param  v A beállítandó sebesség
	 * @param   n Segédparaméter, a tabuláláshoz segítség 
	 */
	public void setVelocity(int n, int v){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"setVelocity(int)");
		//
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"setVelocity(int)");
		//
	}
	
	/**
	 * Az irány lekérdezése
	 * @param   n Segédparaméter, a tabuláláshoz segítség 
	 * @return Egy pointot ad vissza az iránynak megfelelõen.
	 */
	public Point getDirection(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"getDirection() : Point");
		//
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"getDirection() : Point");
		//
		return direction;
	}
	
	
	/**
	 * A sebesség lekérdezése
	 * @param  n Segédparaméter, a tabuláláshoz segítség 
	 * @return A sebességet adja vissza.
	 */
	public int getVelocity(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"getVelocity() : int");
		//
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"getVelocity() : int");
		//
		return velocity;
	}
	
	/**
	 * Hozzáad egy sebességvektort az eddigi sebességvektorhoz
	 * @param   v Ezt adjuk hozzá a sebességvektorunkhoz.
	 * @param   n Segédparaméter, a tabuláláshoz segítség 
	 */
	public void add(int n, VelocityVector v){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"add(VelocityVector)");
		//
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"add(VelocityVector)");
		//
	}
	
	/**
	 *
	 */
	public String toString(){
		return "VelocityVector.";
	}
	
}
