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
	
	public Robot(Map map, Point p, VelocityVector v){
		System.out.println(this.toString()+"constructor()");
		
		map.getField(p).arrived(this);
		
		System.out.println("ret "+this.toString()+"constructor()");
	}
	
	public void jump(VelocityVector v){
		System.out.println(this.toString()+"jump(VelocityVector)");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"jump(VelocityVector)");
	}
	
	public void resetJump(){
		System.out.println(this.toString()+"resetJump()");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"resetJump()");
	}
	
	public void placeGoo(Goo goo){
		System.out.println(this.toString()+"placeGoo(Goo)");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"placeGoo(Goo)");
	}
	
	public void placeOil(Oil oil){
		System.out.println(this.toString()+"placeOil(Oil)");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"placeOil(Oil)");
	}

	public void interact(Jumping jumping) {
		System.out.println(this.toString()+"interact()");
		
		this.state=RobotState.Collided;
		jumping.onRobot();
		
		System.out.println("ret "+this.toString()+"interact()");
	}

	public void normalField(NormalField nf) {
		System.out.println(this.toString()+"normalField(NormalField)");
		
		currentField=nf;
		nf.addRobot(this);
		
		System.out.println("ret "+this.toString()+"normalField(NormalField)");
	}

	public void onGoo() {
		System.out.println(this.toString()+"onGoo()");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"onGoo()");
	}

	public void onOil() {
		System.out.println(this.toString()+"onOil()");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"onOil()");
	}

	public void onRobot() {
		System.out.println(this.toString()+"onRobot()");
		
		this.jump(new VelocityVector(this.velocityVector.getDirection(), this.velocityVector.getVelocity()-1));
		
		System.out.println("ret "+this.toString()+"onRobot()");
	}

	public void onOutside() {
		System.out.println(this.toString()+"onOutside()");
		//To do
		//To do
		//To do
		System.out.println("ret "+this.toString()+"onOutside()");
	}
	
	public String toString(){
		return "Robot.";
	}
	
}
