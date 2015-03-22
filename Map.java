package Phoebe;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
* A pályát megvalósító osztály.
*/
public class Map {
	
	private Point size;
	private Field[][] field;
	
	/**
	 *A pálya konstruktora
	 * @param  n
	 * @param  str - alapvetõen ebbõl a fájlbõl olvasná be a fájlt,
	 * de most e szerint dönti el hogyan legyen be drótozva a pálya
	 * @param  goo A ragacs referenciája.
	 * @param  oil Az olaj referenciája.
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
	 * A megfelelõ koordinátán lévõ Fieldet adja vissza
	 * @param  p A Field koordinátája amit le akarunk kérni
	 * @param  
	 * @return A Field aminek a koordinátáit lekértük
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
	 * Kezdõpont és sebességvektor megadásával kiszámolja az új poziciót.
	 * @param  p A kezdõpont.
	 * @param  v A sebességvektor.
	 * @param  
	 * @return Az új pozició
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
	 * A Mapon lévõ két pont közötti távolságot számolja ki
	 * @param  p1 Az egyik pont
	 * @param  p2 A másik pont
	 * @param  
	 * @return A két pont közötti távolság
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
