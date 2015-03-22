package Phoebe;

import java.awt.Point;

/**
 * Ez az osztály fogja össze programot.
 * Tárolja a robotokat, a pályát, a csapdákat.
 * Számon tartja hanyadik körben járunk, 
 * és hogy ki az épp soron lévõ játékos.
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
	 * Az osztály konstruktora, létrehozza a Trap-eket és a robotokat.
	 * @param n Segédparaméter, a tabuláláshoz segítség
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
	 * @param  n Segédparaméter, a tabuláláshoz segítség
	 * @param  filename A fájl neve ahonnan beolvassuk az adatokat. 
	 * Itt most a felhasználó parancsa hogy melyik use-case szerint inicializálódjon a pálya.
	 */
	public void loadMap(int n, String filename){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"loadMap(String)");
		//
		
		map=new Map(n+1, filename, goo, oil);
		robots[0]=new Robot(n+1, map, new Point(0,0), new VelocityVector(n+1, new Point(1,0), 2));
		
		if(filename.equals("jump robot")){//csak akkor kell mÃ©g egy robot ha a robotra ugrÃ¡s use-case-t akarjuk futtatni
			robots[1]=new Robot(n+1, map, new Point(2,0), new VelocityVector(n+1, new Point(0,0), 0));
		}
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"loadMap(String)");
		//
	}
	
	/**
	 * Ez a függvény indítja el a játékot
	 * @param  Segédparaméter, a tabuláláshoz segítség
	 * @param  String command - ez dönti el hogyan inicializálódjon a futtatási parancs szerint
	 */

	public void start(int n, String command){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"start()");
		//
		
		this.loadMap(n+1, command);
		
		if(command.contains("jump"))
			this.robots[0].jump(n+1, null);
		if(command.equals("place oil"))
			this.robots[0].placeOil(n+1, this.oil);
		if(command.equals("place goo"))
			this.robots[0].placeGoo(n+1, this.goo);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"start()");
		//
	}
	/**
	 * A robotok egymás utáni ugratását végzõ függvény
	 * @param n Segédparaméter, a tabuláláshoz segítség  
	 */

	public void step(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"step()");
		
		//
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"step()");
		//
	}
	
	/**
	 * A játék végén hívódó függvény,
	 * 
	 * @param n Segédparaméter, a tabuláláshoz segítség  
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
	 * @param n Segédparaméter, a tabuláláshoz segítség  
	 */

	public void showResults(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"showResults()");
		//
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"showResults()");
		//
	}
	/**
	 * @return Visszaadja az osztály nevét tartalmazó stringet
	 */

	public String toString(){
		return "GameManager.";
	}
	

	/**
	 * A játék belépési pontja, inicializálja a GameManagert és elindítja a játékot.
	 * @param args A futtatási paraméter, teszteléshez használjuk. 
	 * Ettõl függõen fut le a megfelelõ teszteset. 
	 */

	public static void main(String[] args){
		GameManager gm=new GameManager(0);
		if(args.length>=1){
			if(args[0].equals("new")){
				gm.start(0, "new");
			}
			else if(args[0].equals("end")){
				gm.end(0);
			}
			else if(args[0].equals("jump")){
				if(args.length>=2){
					if(args[1].equals("normal")){
						gm.start(0, "jump normal");
					}
					else if(args[1].equals("outside")){
						gm.start(0, "jump outside");
					}
					else if(args[1].equals("robot")){
						gm.start(0, "jump robot");
					}
					else if(args[1].equals("oil")){
						gm.start(0, "jump oil");
					}
					else if(args[1].equals("goo")){
						gm.start(0, "jump goo");
					}
				}
			}
			else if(args[0].equals("place")){
				if(args.length>=2){
					if(args[1].equals("oil")){
						gm.start(0, "place oil");
					}
					else if(args[1].equals("goo")){
						gm.start(0, "place goo");
					}
				}
			}
		}
	}
	
}
