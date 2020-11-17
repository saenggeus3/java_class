package myobj.machine;


public class Phone implements Electronics {

	private boolean power = false;
	
	private int standard = 240;
	int battery = 0;
	private int max_battery=100;
	
	@Override
	public void powerSupply(int elect) {
		if (elect<standard) {
			return;
		}
		System.out.println("충전중입니다.");
		while(battery<max_battery) {
			battery++;
		}
		
	}
	
	@Override
	public void powerOn() {
		if (battery==0 && !power) {
			return;
		}
		power = !power;
			
	}

	@Override
	public void powerConsum() {
		if(power) {
			battery--;
		}
	}

	@Override
	public void work() {
		while(power) {
			if (power) {
				System.out.println("핸드폰 작동중" + "                  " + battery );
				powerConsum();
				if(battery==0) {
					System.out.println("충전이 필요합니다.\n전원을 종료합니다.");
					powerOn();
				}
			}
		}
		
		
		
	}
	

	

	

}
