package Phoebe;

import java.awt.Point;

public class Map {
	
	private Point size;
	private Field[][] field;
	
	public Map(int n, String str, Goo goo, Oil oil){
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"constructor()");
		
		field=new Field[2][1];
		field[0][0]=new NormalField(n+1);
		field[1][0]=new NormalField(n+1);
		
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"constructor()");
	}
	
	public Field getField(int n, Point p){
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"getField(Point) : Field");
		//To do
		//To do
		//To do
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"getField(Point) : Field");
		return field[p.x][p.y];
	}
	
	public Point getNewPos(int n, Point p, VelocityVector v){
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"getNewPos(Point, VelocityVector) : Point");
		//To do
		//To do
		//To do
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"getNewPos(Point, VelocityVector) : Point");
		return new Point(1,0);
	}
	
	public int calculateDistance(int n, Point p1, Point p2){
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"calculateDistance(Point, Point) : int");
		//To do
		//To do
		//To do
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"calculateDistance(Point, Point) : int");
		return 2;
	}
	
	public String toString(){
		return "Map.";
	}
	
}
