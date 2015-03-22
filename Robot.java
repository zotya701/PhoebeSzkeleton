package Phoebe;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* A robotot megval�s�t� oszt�ly. 
* Megval�s�tja a Jumping �s Landable interf�szt, 
* �gy ugrani is k�pes, �s r� is tudnak ugrani
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
	 * @param  map A p�lya, hogy elhelyezhess�k magukat.
	 * @param  p A robot kezd�poz�ci�ja.
	 * @param  v A robotok kezd�sebess�ge.
	 * @param  n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
	 * Az ugr�st megval�s�t� f�ggv�ny.
	 * @param  v A robot sebess�gvektora, ekkor�t fog ugrani.
	 * @param  n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
	 */

	public void jump(int n, VelocityVector v){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"jump(VelocityVector)");
		//
		
		System.out.println("�l m�g a robot? igen/nem");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String decision=br.readLine();
			if(decision.equals("igen")){
				System.out.println("�tk�z�tt vagy olajfolton �llt-e el�z�leg a robot? igen/nem");
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
	 * Ha a robot v�gzett az ugr�sokkal akkor h�v�dik meg ez a f�ggv�ny. 
	 * (Robottal val� �tk�z�s eset�n rekurz�van �jrah�v�dik a jump egyel kisebb VelocityVector-al)
	 * @param   n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
	 * A robot elhelyez egy ragacsot a jelenlegi pozici�j�n
	 * @param  goo A ragacs referenci�ja.
	 * @param   n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
	 */

	public void placeGoo(int n, Goo goo){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"placeGoo(Goo)");
		//
		
		System.out.println("Van m�g csapda? igen/nem");
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
	 *	A robot elhelyez egy olajat a jelenlegi pozici�j�n
	 * @param  oil A olaj referenci�ja.
	 * @param   n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
	 */

	public void placeOil(int n, Oil oil){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"placeOil(Oil)");
		//
		
		System.out.println("van m�g csapda? igen/nem");
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
	 * A robot reakci�ja ha egy m�sik Jumping objektum "r�ugrik"
	 * @param  jumping A r�l�p� objektum
	 * @param  n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
	 * Ez h�v�dik meg ha a robot NormalField-re �rkezik.
	 * @param  nf A NormalField amire �rkezik.
	 * @param   n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
	 * Ez a f�ggv�ny h�v�dik meg ha a robot ragacsra ugrik.
	 * @param   n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
	 */

	public void onGoo(int n) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"onGoo()");
		//
		
		this.velocityVector.setVelocity(n+1, this.velocityVector.getVelocity(n+1)/2);//felezi a sebess�get
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"onGoo()");
		//
	}


	/**
	 * Ez a f�ggv�ny h�v�dik meg ha a robot olajra ugrik.
	 * @param   n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
	 * Ez a f�ggv�ny h�v�dik meg ha a robot m�sik robottal �tk�zik.
	 * @param   n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
	 */

	public void onRobot(int n) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"onRobot()");
		//
		
		this.velocityVector.setVelocity(n+1, this.velocityVector.getVelocity(n+1)-1);//�tk�z�sn�l �jabb ugr�s el�tt 1 el cs�kkenti a sebess�get
		this.jump(n+1, this.velocityVector);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"onRobot()");
		//
	}

	/**
	 * �rokba ugr�s eset�n ez a f�ggv�ny h�v�dik meg.
	 * @param   n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
