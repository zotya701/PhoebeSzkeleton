package Phoebe;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
* A p�ly�t megval�s�t� oszt�ly.
*/
public class Map {
	
	private Point size;
	private Field[][] field;
	
	/**
	 *A p�lya konstruktora
	 * @param  n
	 * @param  str - alapvet�en ebb�l a f�jlb�l olvasn� be a f�jlt,
	 * de most e szerint d�nti el hogyan legyen be dr�tozva a p�lya
	 * @param  goo A ragacs referenci�ja.
	 * @param  oil Az olaj referenci�ja.
	 */
	public Map(int n, String str, Goo goo, Oil oil){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"constructor()");
		//
		
		field=new Field[3][1];
		if(str.equals("jump normal") || str.equals("jump robot") || str.equals("new") || str.contains("place")){
			field[0][0]=new NormalField(n+1);
			field[1][0]=new NormalField(n+1);
			field[2][0]=new NormalField(n+1);
		}
		else if(str.equals("jump outside")){
			field[0][0]=new NormalField(n+1);
			field[1][0]=new NormalField(n+1);
			field[2][0]=new OutsideField(n+1);
		}
		else if(str.equals("jump oil")){
			field[0][0]=new NormalField(n+1);
			field[1][0]=new NormalField(n+1);
			NormalField nf=new NormalField(n+1);
			nf.addTrap(n+1, oil);
			field[2][0]=nf;
		}
		else if(str.equals("jump goo")){
			field[0][0]=new NormalField(n+1);
			field[1][0]=new NormalField(n+1);
			NormalField nf=new NormalField(n+1);
			nf.addTrap(n+1, goo);
			field[2][0]=nf;
		}
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"constructor()");
		//
	}
	

	/**
	 * A megfelel� koordin�t�n l�v� Fieldet adja vissza
	 * @param  p A Field koordin�t�ja amit le akarunk k�rni
	 * @param  
	 * @return A Field aminek a koordin�t�it lek�rt�k
	 */
	public Field getField(int n, Point p){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"getField(Point) : Field");
		//
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"getField(Point) : Field");
		//
		return field[p.x][p.y];
	}
	
	/**
	 * Kezd�pont �s sebess�gvektor megad�s�val kisz�molja az �j pozici�t.
	 * @param  p A kezd�pont.
	 * @param  v A sebess�gvektor.
	 * @param  
	 * @return Az �j pozici�
	 */

	public Point getNewPos(int n, Point p, VelocityVector v){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"getNewPos(Point, VelocityVector) : Point");
		//
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"getNewPos(Point, VelocityVector) : Point");
		//
		return new Point(2,0);
	}
	
	/**
	 * A Mapon l�v� k�t pont k�z�tti t�vols�got sz�molja ki
	 * @param  p1 Az egyik pont
	 * @param  p2 A m�sik pont
	 * @param  
	 * @return A k�t pont k�z�tti t�vols�g
	 */

	public int calculateDistance(int n, Point p1, Point p2){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"calculateDistance(Point, Point) : int");
		//
		
		//To do
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"calculateDistance(Point, Point) : int");
		//
		return 2;
	}
	
	/**
	 * 
	 */
	public String toString(){
		return "Map.";
	}
	
}
