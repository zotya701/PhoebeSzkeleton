package Phoebe;

import java.awt.Point;

public class VelocityVector {
	
	private Point direction;
	private int velocity;
	
	public VelocityVector(Point p, int v){
		System.out.println(this.toString()+"constructor()");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"constructor()");
	}
	
	public void setDirection(Point p){
		System.out.println(this.toString()+"setDirection(Point)");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"setDirection(Point)");
	}
	
	public void setVelocity(int v){
		System.out.println(this.toString()+"setVelocity(int)");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"setVelocity(int)");
	}
	
	public Point getDirection(){
		System.out.println(this.toString()+"getDirection() : Point");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"getDirection() : Point");
		return direction;
	}
	
	public int getVelocity(){
		System.out.println(this.toString()+"getVelocity() : int");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"getVelocity() : int");
		return velocity;
	}
	
	public void add(VelocityVector v){
		System.out.println(this.toString()+"add(VelocityVector)");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"add(VelocityVector)");
	}
	
	public String toString(){
		return "VelocityVector.";
	}
	
}
