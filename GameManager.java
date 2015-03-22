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
	 * @param  filename A fájl neve ahonnan beolvassuk az adatokat. Itt most a felhazsnáló parancsa hogy melyik use-case szerint inicializálódjon a pálya.
	 */
	public void loadMap(int n, String filename){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"loadMap(String)");
		//
		
		map=new Map(n+1, filename, goo, oil);
		if(filename.equals("robot")){//csak akkor kell még egy robot ha a robotra ugrás use-case-t akarjuk futtatni
			robots[1]=new Robot(n+1, map, new Point(2,0), new VelocityVector(n+1, new Point(0,0), 0));
		}
		robots[0]=new Robot(n+1, map, new Point(0,0), new VelocityVector(n+1, new Point(0,0), 0));
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"loadMap(String)");
		//
	}
	
	/**
	 * Ez a függvény indítja el a játékot
	 * @param  
	 * @param  String command - ez dönti el hogyan inicializálódjon a futtatási parancs szerint
	 */
	public void start(int n, String command){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"start()");
		//
		
		this.loadMap(n+1, command);
		
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
		
		if(robotsEliminated[currentPlayer]==false){
			RobotState state;
			robots[currentPlayer].resetJump(n+1);
			state=robots[currentPlayer].jump(n+1,velocityVector);
			if(state==Eliminated)
				robotsEliminated[currentPlayer]==true;		
		}
		int db=0;
		for(int i=0;i<4;++i)
			if(robotsEliminated[i]==true)
				db+=1;
		if(db>=3 || round>maxround)
				end();
		
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
	
		showResults(n+1);
	
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
				GameManager gm=new GameManager(0);
				gm.start(0, "new");
			}
			else if(args[0].equals("end")){
				//
			}
			else if(args[0].equals("jump")){
				if(args.length>=2){
					if(args[1].equals("normal")){
						GameManager gm=new GameManager(0);
						gm.start(0, "normal");
					}
					else if(args[1].equals("outside")){
						GameManager gm=new GameManager(0);
						gm.start(0, "outside");
					}
					else if(args[1].equals("robot")){
						GameManager gm=new GameManager(0);
						gm.start(0, "robot");
					}
					else if(args[1].equals("oil")){
						GameManager gm=new GameManager(0);
						gm.start(0, "oil");
					}
					else if(args[1].equals("goo")){
						GameManager gm=new GameManager(0);
						gm.start(0, "goo");
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
	}
	
}
