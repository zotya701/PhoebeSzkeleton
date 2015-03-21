package Phoebe;

import java.awt.Point;

public class Map {
	
	private Point size;
	private Field[][] field;
	
	public Map(String str, Goo goo, Oil oil){
		System.out.println(this.toString()+"constructor()");
		
		field=new Field[2][1];
		field[0][0]=new NormalField();
		field[1][0]=new NormalField();
		
		
		System.out.println("ret "+this.toString()+"constructor()");
	}
	
	public Field getField(Point p){
		System.out.println(this.toString()+"getField(Point) : Field");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"getField(Point) : Field");
		return field[p.x][p.y];
	}
	
	public Point getNewPos(Point p, VelocityVector v){
		System.out.println(this.toString()+"getNewPos(Point, VelocityVector) : Point");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"getNewPos(Point, VelocityVector) : Point");
		return new Point(1,0);
	}
	
	public int calculateDistance(Point p1, Point p2){
		System.out.println(this.toString()+"calculateDistance(Point, Point) : int");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"calculateDistance(Point, Point) : int");
		return 2;
	}
	
	public String toString(){
		return "Map.";
	}
	
}
