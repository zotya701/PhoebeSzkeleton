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
	 * Ez az oszt�ly fogja �ssze programot.
	 * T�rolja a robotokat, a p�ly�t, a csapd�kat.
	 * Sz�mon tartja hanyadik k�rben j�runk, 
	 * �s hogy ki az �pp soron l�v� j�t�kos.
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
	 * A p�lya bet�lt�s�re szolg�l� f�ggv�ny. 
	 * F�jb�l beolvassa a p�lya adatait �s a robotok kezd�poz�ci�it
	 * @param  n
	 * @param  filename A f�jl neve ahonnan beolvassuk az adatokat. Itt most a felhazsn�l� parancsa hogy melyik use-case szerint inicializ�l�djon a p�lya.
	 */
	public void loadMap(int n, String filename){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"loadMap(String)");
		//
		
		map=new Map(n+1, filename, goo, oil);
		if(filename.equals("robot")){//csak akkor kell m�g egy robot ha a robotra ugr�s use-case-t akarjuk futtatni
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
	 * Ez a f�ggv�ny ind�tja el a j�t�kot
	 * @param  
	 * @param  String command - ez d�nti el hogyan inicializ�l�djon a futtat�si parancs szerint
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
	 * A robotok egym�s ut�ni ugrat�s�t v�gz� f�ggv�ny
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
	 * A j�t�k v�g�n h�v�d� f�ggv�ny,
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
	 * Az eredm�nyek �sszegz�s�t v�gz� f�ggv�ny
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
	 * A j�t�k bel�p�si pontja, inicializ�lja a GameManagert �s elind�tja a j�t�kot.
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
