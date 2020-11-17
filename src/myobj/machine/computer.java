package myobj.machine;

public class computer implements Electronics {

	boolean power = false;
	
	@Override
	public void powerSupply(int elect) {
		power = !power;
	}

	@Override
	public void powerConsum() {
		System.out.println("전력사용");
	}

	@Override
	public void work() {
		if(power) {
			System.out.println("컴퓨터사용중");
		}
		
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

}
