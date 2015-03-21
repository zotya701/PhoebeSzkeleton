package Phoebe;

public class OutsideField implements Field{

	public void arrived(Jumping jumping) {
		System.out.println(this.toString()+"arrived(Jumping)");
		
		jumping.onOutside();
		
		System.out.println("ret "+this.toString()+"arrived(Jumping)");
	}
	
	public String toString(){
		return "OutsideField.";
	}

}
