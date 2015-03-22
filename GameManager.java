package Phoebe;

import java.awt.Point;

/**
 * Ez az oszt�ly fogja �ssze programot.
 * T�rolja a robotokat, a p�ly�t, a csapd�kat.
 * Sz�mon tartja hanyadik k�rben j�runk, 
 * �s hogy ki az �pp soron l�v� j�t�kos.
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
	 * Az oszt�ly konstruktora, l�trehozza a Trap-eket �s a robotokat.
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g
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
	 * A p�lya bet�lt�s�re szolg�l� f�ggv�ny. 
	 * F�jb�l beolvassa a p�lya adatait �s a robotok kezd�poz�ci�it
	 * @param  n Seg�dparam�ter, a tabul�l�shoz seg�ts�g
	 * @param  filename A f�jl neve ahonnan beolvassuk az adatokat. 
	 * Itt most a felhaszn�l� parancsa hogy melyik use-case szerint inicializ�l�djon a p�lya.
	 */
	public void loadMap(int n, String filename){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"loadMap(String)");
		//
		
		map=new Map(n+1, filename, goo, oil);
		robots[0]=new Robot(n+1, map, new Point(0,0), new VelocityVector(n+1, new Point(1,0), 2));
		
		if(filename.equals("jump robot")){//csak akkor kell még egy robot ha a robotra ugrás use-case-t akarjuk futtatni
			robots[1]=new Robot(n+1, map, new Point(2,0), new VelocityVector(n+1, new Point(0,0), 0));
		}
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"loadMap(String)");
		//
	}
	
	/**
	 * Ez a f�ggv�ny ind�tja el a j�t�kot
	 * @param  Seg�dparam�ter, a tabul�l�shoz seg�ts�g
	 * @param  String command - ez d�nti el hogyan inicializ�l�djon a futtat�si parancs szerint
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
	 * A robotok egym�s ut�ni ugrat�s�t v�gz� f�ggv�ny
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g  
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
	 * A j�t�k v�g�n h�v�d� f�ggv�ny,
	 * 
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g  
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
	 * Az eredm�nyek �sszegz�s�t v�gz� f�ggv�ny
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g  
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
	 * @return Visszaadja az oszt�ly nev�t tartalmaz� stringet
	 */

	public String toString(){
		return "GameManager.";
	}
	

	/**
	 * A j�t�k bel�p�si pontja, inicializ�lja a GameManagert �s elind�tja a j�t�kot.
	 * @param args A futtat�si param�ter, tesztel�shez haszn�ljuk. 
	 * Ett�l f�gg�en fut le a megfelel� teszteset. 
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
