package Phoebe;

import java.awt.Point;

/**
 *
 */
public class GameManager {
	
	private Map map;
	private Robot[] robots;
	private int currentPlayer;
	private int round;
	private Goo goo;
	private Oil oil;
	
	/**
	 *
	 * @param  
	 */
	public GameManager(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"constructor()");
		//
		
		goo=new Goo(n+1);
		oil=new Oil(n+1);
		robots=new Robot[4];
		
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
	public void loadMap(int n, String filename){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"loadMap(String)");
		//
		
		map=new Map(n+1, "random", goo, oil);
		robots[0]=new Robot(n+1, map, new Point(0,0), new VelocityVector(n+1, new Point(0,0), 0));
		robots[1]=new Robot(n+1, map, new Point(1,0), new VelocityVector(n+1, new Point(0,0), 0));
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"loadMap(String)");
		//
	}
	
	/**
	 *
	 * @param  
	 */
	public void start(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"start()");
		//
		
		this.loadMap(n+1, "valami");
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"start()");
		//
	}
	
	/**
	 *
	 * @param  
	 */
	public void step(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"step()");
		//
		//To do
		//To do
		//To do
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"step()");
		//
	}
	
	/**
	 *
	 * @param  
	 */
	public void end(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"end()");
		//
		//To do
		//To do
		//To do
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"end()");
		//
	}
	
	/**
	 *
	 * @param  
	 */
	public void showResults(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"showResults()");
		//
		//To do
		//To do
		//To do
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"showResults()");
		//
	}
	
	/**
	 *
	 */
	public String toString(){
		return "GameManager.";
	}
	
	/**
	 *
	 * @param  
	 */
	public static void main(String[] args){
		GameManager gm=new GameManager(0);
		gm.start(0);
	}
	
}
