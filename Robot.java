package Phoebe;

import java.awt.Point;

public class Robot implements Jumping, Landable{
	
	private Map map;
	private VelocityVector velocityVector;
	private RobotState state;
	private Point position;
	private NormalField currentField;
	private int routeTravelled;
	private int gooTraps;
	private int oilTraps;
	private boolean onOil;
	private boolean jumpFinished;
	
	public Robot(int n, Map map, Point p, VelocityVector v){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"constructor()");
		//
		
		this.map=map;
		this.position=p;
		this.velocityVector=v;
		map.getField(n+1, p).arrived(n+1, this);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"constructor()");
		//
	}
	
	public void jump(int n, VelocityVector v){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"jump(VelocityVector)");
		//
		
		this.currentField.left(n+1, this);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"jump(VelocityVector)");
		//
	}
	
	public void resetJump(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"resetJump()");
		//
		
		//To do
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"resetJump()");
		//
	}
	
	public void placeGoo(int n, Goo goo){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"placeGoo(Goo)");
		//
		
		//To do
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"placeGoo(Goo)");
		//
	}
	
	public void placeOil(int n, Oil oil){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"placeOil(Oil)");
		//
		
		//To do
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"placeOil(Oil)");
		//
	}

	public void interact(int n, Jumping jumping) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"interact()");
		//
		
		this.state=RobotState.Collided;
		jumping.onRobot(n+1);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"interact()");
		//
	}

	public void normalField(int n, NormalField nf) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"normalField(NormalField)");
		//
		
		currentField=nf;
		nf.addRobot(n+1, this);
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"normalField(NormalField)");
		//
	}

	public void onGoo(int n) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"onGoo()");
		//
		
		//To do
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"onGoo()");
		//
	}

	public void onOil(int n) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"onOil()");
		//
		
		//To do
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"onOil()");
		//
	}

	public void onRobot(int n) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"onRobot()");
		//
		
		this.jump(n+1, new VelocityVector(n+1, this.velocityVector.getDirection(n+1), this.velocityVector.getVelocity(n+1)-1));
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"onRobot()");
		//
	}

	public void onOutside(int n) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"onOutside()");
		//
		
		//To do
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"onOutside()");
		//
	}
	
	public String toString(){
		return "Robot.";
	}
	
}
