package Phoebe;

import java.util.ArrayList;
import java.util.List;

/**
* Ezek azok a Field-ek, amikre ugorva a robot j�t�kban marad.
* T�rholja a rajta el�fordul� Landable objektumokat.
*/
public class NormalField implements Field{
	
	private List<Landable> elements;
	
	/**
	 * Az oszt�ly konstruktora, l�trehozza a t�mb�t(ArrayList) a Landable objektumoknak.
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
	 * Az interf�szben megk�vetelt f�ggv�ny megval�s�t�sa.
	 * "�sszehozza" a r� ugr� objektumot a rajta l�v�kkel.
	 * @param  jumping Aki r�ugrott a mez�re.
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
	 * Leveszi a jumping objektumot mag�r�l(a t�mbb�l) a mez�
	 * @param  jumping Ezt kell kivennie a t�mbb�l
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
	 * Hozz�ad egy csapd�t a mez�h�z
	 * @param  trap Ezt rakja bele az elements t�mbj�be
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g 
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
	 * Hozz�ad egy robotot a mez�h�z.
	 * @param  robot Ezt rakja bele az elements t�mbbe
	 * @param n Seg�dparam�ter, a tabul�l�shoz seg�ts�g  
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
