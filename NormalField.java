package Phoebe;

import java.util.ArrayList;
import java.util.List;

/**
* Ezek azok a Field-ek, amikre ugorva a robot játékban marad.
* Tárholja a rajta elõforduló Landable objektumokat.
*/
public class NormalField implements Field{
	
	private List<Landable> elements;
	
	/**
	 * Az osztály konstruktora, létrehozza a tömböt(ArrayList) a Landable objektumoknak.
	 * @param n Segédparaméter, a tabuláláshoz segítség 
	 */
	public NormalField(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"constructor()");
		//
		
		elements=new ArrayList<Landable>();
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"constructor()");
		//
	}

	/**
	 * Az interfészben megkövetelt függvény megvalósítása.
	 * "Összehozza" a rá ugró objektumot a rajta lévõkkel.
	 * @param  jumping Aki ráugrott a mezõre.
	 * @param n Segédparaméter, a tabuláláshoz segítség 
	 */
	public void arrived(int n, Jumping jumping) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"arrived(Jumping)");
		//
		
		for(Landable l : elements){
			l.interact(n+1, jumping);
		}
		jumping.normalField(n+1, this);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"arrived(Jumping)");
		//
	}
	
	/**
	 * Leveszi a jumping objektumot magáról(a tömbbõl) a mezõ
	 * @param  jumping Ezt kell kivennie a tömbbõl
	 * @param n Segédparaméter, a tabuláláshoz segítség 
	 */
	public void left(int n, Jumping jumping){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"left(Jumping)");
		//
		
		elements.remove(jumping);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"left(Jumping)");
		//
	}
	
	/**
	 * Hozzáad egy csapdát a mezõhöz
	 * @param  trap Ezt rakja bele az elements tömbjébe
	 * @param n Segédparaméter, a tabuláláshoz segítség 
	 */
	public void addTrap(int n, Trap trap){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"addTrap(Trap)");
		//
		
		elements.add((Landable)trap);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"addTrap(Trap)");
		//
	}
	
	/**
	 * Hozzáad egy robotot a mezõhöz.
	 * @param  robot Ezt rakja bele az elements tömbbe
	 * @param n Segédparaméter, a tabuláláshoz segítség  
	 */
	public void addRobot(int n, Robot robot){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"addRobot(Robot)");
		//
		
		elements.add(0, robot);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"addRobot(Robot)");
		//
	}
	
	/**
	 *
	 */
	public String toString(){
		return "NormalField.";
	}

}
