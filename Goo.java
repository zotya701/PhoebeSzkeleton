package Phoebe;

/**
*  
*/
public class Goo implements Landable, Trap{

	/**
	 *
	 * @param  
	 */
	public Goo(int n){
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
	 */
	public void interact(int n, Jumping jumping) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"interact(Jumping)");
		//
		
		jumping.onGoo(n+1);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"interact(Jumping)");
		//
	}
	
	/**
	 *
	 */
	public String toString(){
		return "Goo.";
	}

}
