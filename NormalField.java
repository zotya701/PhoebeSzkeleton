package Phoebe;

import java.util.ArrayList;
import java.util.List;

public class NormalField implements Field{
	
	private List<Landable> elements;
	
	public NormalField(){
		System.out.println(this.toString()+"constructor()");
		
		elements=new ArrayList<Landable>();
		
		System.out.println("ret "+this.toString()+"constructor()");
	}

	public void arrived(Jumping jumping) {
		System.out.println(this.toString()+"arrived(Jumping)");
		
		for(Landable l : elements){
			l.interact(jumping);
		}
		jumping.normalField(this);
		
		System.out.println("ret "+this.toString()+"arrived(Jumping)");
	}
	
	public void left(Jumping jumping){
		System.out.println(this.toString()+"left(Jumping)");
		
		elements.remove(jumping);
		
		System.out.println("ret "+this.toString()+"left(Jumping)");
	}
	
	public void addTrap(Trap trap){
		System.out.println(this.toString()+"addTrap(Trap)");
		
		elements.add((Landable)trap);
		
		System.out.println("ret "+this.toString()+"addTrap(Trap)");
	}
	
	public void addRobot(Robot robot){
		System.out.println(this.toString()+"addRobot(Robot)");
		
		elements.add(0, robot);
		
		System.out.println("ret "+this.toString()+"addRobot(Robot)");
	}
	
	public String toString(){
		return "NormalField.";
	}

}
