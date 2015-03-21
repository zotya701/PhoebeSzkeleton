package Phoebe;

public class Goo implements Landable, Trap{

	public void interact(Jumping jumping) {
		System.out.println(this.toString()+"interact(Jumping)");
		
		jumping.onGoo();
		
		System.out.println("ret "+this.toString()+"interact(Jumping)");
	}
	
	public String toString(){
		return "Goo.";
	}

}
