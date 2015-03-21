package Phoebe;

import java.awt.Point;

public class GameManager {
	
	private Map map;
	private Robot[] robots;
	private int currentPlayer;
	private int round;
	private Goo goo;
	private Oil oil;
	
	public GameManager(){
		System.out.println(this.toString()+"constructor()");
		
		goo=new Goo();
		oil=new Oil();
		robots=new Robot[4];
		
		System.out.println("ret "+this.toString()+"constructor()");
	}
	
	public void loadMap(String filename){
		System.out.println(this.toString()+"loadMap(String)");
		
		map=new Map("random", goo, oil);
		robots[0]=new Robot(map, new Point(0,0), new VelocityVector(new Point(0,0), 0));
		robots[1]=new Robot(map, new Point(1,0), new VelocityVector(new Point(0,0), 0));
		
		System.out.println("ret "+this.toString()+"loadMap(String)");
	}
	
	public void start(){
		System.out.println(this.toString()+"start()");
		
		this.loadMap("valami");
		//To do
		
		System.out.println("ret "+this.toString()+"start()");
	}
	
	public void step(){
		System.out.println(this.toString()+"step()");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"step()");
	}
	
	public void end(){
		System.out.println(this.toString()+"end()");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"end()");
	}
	
	public void showResults(){
		System.out.println(this.toString()+"showResults()");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"showResults()");
	}
	
	public String toString(){
		return "GameManager.";
	}
	
	public static void main(String[] args){
		GameManager gm=new GameManager();
		gm.start();
	}
	
}
