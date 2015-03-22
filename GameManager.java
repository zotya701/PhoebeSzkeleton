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
	 * Ez az osztály fogja össze programot.
	 * Tárolja a robotokat, a pályát, a csapdákat.
	 * Számon tartja hanyadik körben járunk, 
	 * és hogy ki az épp soron lévõ játékos.
	 * @param n 
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
	 * A pálya betöltésére szolgáló függvény. 
	 * Fájból beolvassa a pálya adatait és a robotok kezdõpozícióit
	 * @param  n
	 * @param  filename A fájl neve ahonnan beolvassuk az adatokat
	 */
	public void loadMap(int n, String filename){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"loadMap(String)");
		//
		
		map=new Map(n+1, "random", goo, oil);
		robots[0]=new Robot(n+1, map, new Point(0,0), new VelocityVector(n+1, new Point(0,0), 0));
		robots[1]=new Robot(n+1, map, new Point(2,0), new VelocityVector(n+1, new Point(0,0), 0));
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"loadMap(String)");
		//
	}
	
	/**
	 * Ez a függvény indítja el a játékot
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
	 * A robotok egymás utáni ugratását végzõ függvény
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
	 * A játék végén hívódó függvény,
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
	 * Az eredmények összegzését végzõ függvény
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
	 * A játék belépési pontja, inicializálja a GameManagert és elindítja a játékot.
	 * @param  
	 */
	public static void main(String[] args){
		if(args.length>=1){
			if(args[0].equals("new")){
				//
			}
			else if(args[0].equals("end")){
				//
			}
			else if(args[0].equals("jump")){
				if(args.length>=2){
					if(args[1].equals("normal")){
						//
					}
					else if(args[1].equals("outside")){
						//
					}
					else if(args[1].equals("robot")){
						//
					}
					else if(args[1].equals("oil")){
						//
					}
					else if(args[1].equals("goo")){
						//
					}
				}
			}
			else if(args[0].equals("place")){
				if(args.length>=2){
					if(args[1].equals("oil")){
						//
					}
					else if(args[1].equals("goo")){
						//
					}
				}
			}
		}
		
		
		
		GameManager gm=new GameManager(0);
		gm.start(0);
		//gm.robots[0].jump(0, null);
	}
	
}
