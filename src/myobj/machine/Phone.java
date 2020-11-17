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
		System.out.println("�������Դϴ�.");
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
				System.out.println("�ڵ��� �۵���" + "                  " + battery );
				powerConsum();
				if(battery==0) {
					System.out.println("������ �ʿ��մϴ�.\n������ �����մϴ�.");
					powerOn();
				}
			}
		}
		
		
		
	}
	

	

	

}
