package Phoebe;

public class Oil implements Landable, Trap{

	public void interact(Jumping jumping) {
		System.out.println(this.toString()+"interact(Jumping)");
		
		jumping.onOil();
		
		System.out.println("ret "+this.toString()+"interact(Jumping)");
	}
	
	public String toString(){
		return "Oil.";
	}

}
