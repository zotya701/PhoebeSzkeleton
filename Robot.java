package Phoebe;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
*
*/
public class Robot implements Jumping, Landable{
	
	private static int statid=0;
	private int id;
	
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
	
	/**
	 *
	 * @param  
	 * @param  
	 * @param  
	 * @param  
	 */
	public Robot(int n, Map map, Point p, VelocityVector v){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"constructor()");
		//
		
		this.id=statid;
		statid=statid+1;
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
	
	/**
	 *
	 * @param  
	 * @param  
	 */
	public void jump(int n, VelocityVector v){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"jump(VelocityVector)");
		//
		
		System.out.println("Él még a robot?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String decision=br.readLine();
			if(decision.equals("igen")){
				this.currentField.left(n+1, this);
				map.getField(n+1, map.getNewPos(n+1, this.position, this.velocityVector)).arrived(n+1, this);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"jump(VelocityVector)");
		//
	}
	
	/**
	 *
	 * @param  
	 */
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
	
	/**
	 *
	 * @param  
	 * @param  
	 */
	public void placeGoo(int n, Goo goo){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"placeGoo(Goo)");
		//
		
		System.out.println("van még csapda?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String decision=br.readLine();
			if(decision.equals("igen"))
				this.currentField.addTrap(n+1, goo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"placeGoo(Goo)");
		//
	}
	
	/**
	 *
	 * @param  
	 * @param  
	 */
	public void placeOil(int n, Oil oil){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"placeOil(Oil)");
		//
		
		System.out.println("van még csapda?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String decision=br.readLine();
			if(decision.equals("igen"))
				this.currentField.addTrap(n+1, oil);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"placeOil(Oil)");
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

	/**
	 *
	 * @param  
	 * @param  
	 */
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

	/**
	 *
	 * @param  
	 */
	public void onGoo(int n) {
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"onGoo()");
		//
	
		int v;
		velocityVector.setVelocity(n+1,v);
	
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"onGoo()");
		//
	}

	/**
	 *
	 * @param  
	 */
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

	/**
	 *
	 * @param  
	 */
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

	/**
	 *
	 * @param  
	 */
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
	
	/**
	 *
	 */
	public String toString(){
		return "Robot["+this.id+"].";
	}
	
}
