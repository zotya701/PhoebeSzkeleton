package Phoebe;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
*
*/
public class Map {
	
	private Point size;
	private Field[][] field;
	
	/**
	 *
	 * @param  
	 * @param  String str - alapvetõen ebbõl a fájlbõl olvasná be a fájlt, de most e szerint dönti el hogyan legyen be drótozva a pálya
	 * @param  
	 * @param  
	 */
	public Map(int n, String str, Goo goo, Oil oil){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"constructor()");
		//
		
		field=new Field[3][1];
		if(str.equals("normal") || str.equals("robot") || str.equals("new")){
			field[0][0]=new NormalField(n+1);
			field[1][0]=new NormalField(n+1);
			field[2][0]=new NormalField(n+1);
		}
		else if(str.equals("outside")){
			field[0][0]=new NormalField(n+1);
			field[1][0]=new NormalField(n+1);
			field[2][0]=new OutsideField(n+1);
		}
		//else if(str.equals("robot")){
		//	
		//}
		else if(str.equals("oil")){
			field[0][0]=new NormalField(n+1);
			field[1][0]=new NormalField(n+1);
			NormalField nf=new NormalField(n+1);
			nf.addTrap(n+1, oil);
			field[2][0]=nf;
		}
		else if(str.equals("goo")){
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
	 *
	 * @param  
	 * @param  
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
	 *
	 * @param  
	 * @param  
	 * @param  
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
	 *
	 * @param  
	 * @param  
	 * @param  
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
