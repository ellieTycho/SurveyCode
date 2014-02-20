public class Computer{

	private int problem;
	private boolean screenBroken;
	private boolean hardDriveBroken;
	private boolean infected;
	
	
	public int getProblem(){
		return problem;
	}
	
	public void setProblem(int p){
		problem = p;
	}
	
	public boolean isScreenBroken(){
		return screenBroken;
	}
	
	public boolean isHardDriveBroken(){
		return hardDriveBroken;
	}
	
	public boolean isInfected(){
		return infected;
	}

}

public class ComputerShop {

	private static final int SCREEN_BROKEN = 1;
	private static final int HARDDRIVE_BROKEN = 2;
	private static final int INFECTED = 3;
	private static final int UNKNOWN = 3;
	
	private Computer computer;
	
	
	public void takeComputer(Computer c){
		computer = c;
	}
	
	public void diagnoseProblem(){
		
		if(computer.isScreenBroken()){
			computer.setProblem(SCREEN_BROKEN);
		}
		else if(computer.isHardDriveBroken()){
			computer.setProblem(HARDDRIVE_BROKEN);
		}
		else if(computer.isInfected()){
			computer.setProblem(INFECTED);
		}			
		else{
			computer.setProblem(UNKNOWN);
		}		
	}	
	
	public int calculateRepairCost(){
		
		int repairCost = 0;
		
		if(computer.getProblem() == SCREEN_BROKEN){
			repairCost = 80;
		}
		else if(computer.getProblem() == HARDDRIVE_BROKEN){
			repairCost = 120;
		}
		else if(computer.getProblem() == INFECTED){
			repairCost = 50;
		}
		else{
			//repairCost is 0
		}
		
		return repairCost;	
	}
}
