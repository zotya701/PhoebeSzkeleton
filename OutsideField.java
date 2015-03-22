package Phoebe;

import java.util.ArrayList;

/**
*
*/
public class OutsideField implements Field{

	/**
	 *
	 * @param  
	 */
	public OutsideField(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"constructor()");
		//
		
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
		
		jumping.onOutside(n+1);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"arrived(Jumping)");
		//
	}
	
	/**
	 *
	 */
	public String toString(){
		return "OutsideField.";
	}

}
