package Phoebe;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* A robotot megvalósító osztály. 
* Megvalósítja a Jumping és Landable interfészt, 
* így ugrani is képes, és rá is tudnak ugrani
*/
public class Robot implements Jumping, Landable{
	
	private static int statid=0;
	private int id;
	
	private Map map;
	private VelocityVector velocityVector;
	private RobotState state;
	private Point position;
	private NormalField currentField;
	private int routeTravelled;
	private int gooTraps;
	private int oilTraps;
	private boolean onOil;
	private boolean jumpFinished;
	
	/**
	 * A robot konstruktora, 
	 * @param  map A pálya, hogy elhelyezhessék magukat.
	 * @param  p A robot kezdõpozíciója.
	 * @param  v A robotok kezdõsebessége.
	 * @param  n Segédparaméter, a tabuláláshoz segítség 
	 */

	public Robot(int n, Map map, Point p, VelocityVector v){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"constructor()");
		//
		
		this.id=statid;
		statid=statid+1;
		this.map=map;
		this.position=p;
		this.velocityVector=v;
		map.getField(n+1, p).arrived(n+1, this);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"constructor()");
		//
	}
	
	/**
	 * Az ugrást megvalósító függvény.
	 * @param  v A robot sebességvektora, ekkorát fog ugrani.
	 * @param  n Segédparaméter, a tabuláláshoz segítség 
	 */

	public void jump(int n, VelocityVector v){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"jump(VelocityVector)");
		//
		
		System.out.println("Él még a robot? igen/nem");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String decision=br.readLine();
			if(decision.equals("igen")){
				System.out.println("Ütközött vagy olajfolton állt-e elõzõleg a robot? igen/nem");
				decision=br.readLine();
				if(decision.equals("nem"))
					this.velocityVector.add(n+1, v);
				this.currentField.left(n+1, this);
				map.getField(n+1, map.getNewPos(n+1, this.position, this.velocityVector)).arrived(n+1, this);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"jump(VelocityVector)");
		//
	}
	

	/**
	 * Ha a robot végzett az ugrásokkal akkor hívódik meg ez a függvény. 
	 * (Robottal való ütközés esetén rekurzívan újrahívódik a jump egyel kisebb VelocityVector-al)
	 * @param   n Segédparaméter, a tabuláláshoz segítség 
	 */

	public void resetJump(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"resetJump()");
		//
		
		//To do
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"resetJump()");
		//
	}
	
	/**
	 * A robot elhelyez egy ragacsot a jelenlegi pozicióján
	 * @param  goo A ragacs referenciája.
	 * @param   n Segédparaméter, a tabuláláshoz segítség 
	 */

	public void placeGoo(int n, Goo goo){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"placeGoo(Goo)");
		//
		
		System.out.println("Van még csapda? igen/nem");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String decision=br.readLine();
			if(decision.equals("igen"))
				this.currentField.addTrap(n+1, goo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"placeGoo(Goo)");
		//
	}
	
	/**
	 *	A robot elhelyez egy olajat a jelenlegi pozicióján
	 * @param  oil A olaj referenciája.
	 * @param   n Segédparaméter, a tabuláláshoz segítség 
	 */

	public void placeOil(int n, Oil oil){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"placeOil(Oil)");
		//
		
		System.out.println("van még csapda? igen/nem");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String decision=br.readLine();
			if(decision.equals("igen"))
				this.currentField.addTrap(n+1, oil);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"placeOil(Oil)");
		//
	}

	/**
	 * A robot reakciója ha egy másik Jumping objektum "ráugrik"
	 * @param  jumping A rálépõ objektum
	 * @param  n Segédparaméter, a tabuláláshoz segítség 
	 */

	public void interact(int n, Jumping jumping) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"interact()");
		//
		
		this.state=RobotState.Collided;
		jumping.onRobot(n+1);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"interact()");
		//
	}

	/**
	 * Ez hívódik meg ha a robot NormalField-re érkezik.
	 * @param  nf A NormalField amire érkezik.
	 * @param   n Segédparaméter, a tabuláláshoz segítség 
	 */

	public void normalField(int n, NormalField nf) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"normalField(NormalField)");
		//
		
		currentField=nf;
		nf.addRobot(n+1, this);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"normalField(NormalField)");
		//
	}
	/**
	 * Ez a függvény hívódik meg ha a robot ragacsra ugrik.
	 * @param   n Segédparaméter, a tabuláláshoz segítség 
	 */

	public void onGoo(int n) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"onGoo()");
		//
		
		this.velocityVector.setVelocity(n+1, this.velocityVector.getVelocity(n+1)/2);//felezi a sebességet
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"onGoo()");
		//
	}


	/**
	 * Ez a függvény hívódik meg ha a robot olajra ugrik.
	 * @param   n Segédparaméter, a tabuláláshoz segítség 
	 */

	public void onOil(int n) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"onOil()");
		//
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"onOil()");
		//
	}

	/**
	 * Ez a függvény hívódik meg ha a robot másik robottal ütközik.
	 * @param   n Segédparaméter, a tabuláláshoz segítség 
	 */

	public void onRobot(int n) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"onRobot()");
		//
		
		this.velocityVector.setVelocity(n+1, this.velocityVector.getVelocity(n+1)-1);//ütközésnél újabb ugrás elõtt 1 el csökkenti a sebességet
		this.jump(n+1, this.velocityVector);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"onRobot()");
		//
	}

	/**
	 * Árokba ugrás esetén ez a függvény hívódik meg.
	 * @param   n Segédparaméter, a tabuláláshoz segítség 
	 */

	public void onOutside(int n) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"onOutside()");
		//
		
		//To do
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"onOutside()");
		//
	}
	
	/**
	 *
	 */
	public String toString(){
		return "Robot["+this.id+"].";
	}
	
}
