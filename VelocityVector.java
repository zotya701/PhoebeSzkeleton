package Phoebe;

import java.awt.Point;

/**
 * Sebess�gvektor, t�rol egy ir�nyt �s egy sebess�get.
 */
public class VelocityVector {
	
	private Point direction;
	private int velocity;
	
	/**
	 * Az oszt�ly kontruktora.
	 * @param  p Kezd�ir�ny
	 * @param  v Kezd�sebess�g
	 * @param  n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
	 * Az ir�ny v�ltoztat�s�t  kezel� f�ggv�ny.
	 * @param  p Be�ll�tand� ir�ny.
	 * @param  n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
	 *A sebess�g v�ltoztat�s�t kezel� f�ggv�ny
	 * @param  v A be�ll�tand� sebess�g
	 * @param   n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
	 * Az ir�ny lek�rdez�se
	 * @param   n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
	 * @return Egy pointot ad vissza az ir�nynak megfelel�en.
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
	 * A sebess�g lek�rdez�se
	 * @param  n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
	 * @return A sebess�get adja vissza.
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
	 * Hozz�ad egy sebess�gvektort az eddigi sebess�gvektorhoz
	 * @param   v Ezt adjuk hozz� a sebess�gvektorunkhoz.
	 * @param   n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
