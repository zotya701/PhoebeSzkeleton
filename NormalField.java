package Phoebe;

import java.util.ArrayList;
import java.util.List;

/**
*
*/
public class NormalField implements Field{
	
	private List<Landable> elements;
	
	/**
	 *
	 * @param  
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
	 *
	 * @param  
	 * @param  
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
	 *
	 * @param  
	 * @param  
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
	 *
	 * @param  
	 * @param  
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
	 *
	 * @param  
	 * @param  
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
