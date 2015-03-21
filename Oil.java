package Phoebe;

/**
*
*/
public class Oil implements Landable, Trap{

	/**
	 *
	 * @param  
	 */
	public Oil(int n){
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
	public void interact(int n, Jumping jumping) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"interact(Jumping)");
		//
		
		jumping.onOil(n+1);
		
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
		return "Oil.";
	}

}
