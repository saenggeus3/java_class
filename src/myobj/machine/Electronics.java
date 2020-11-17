package myobj.machine;

public interface Electronics {
	
	// 전자 기기 인터페이스
	// 모든 전자기기는 전력 공급을 받을 수 있음
	// 모든 전자기기는 사용시 전력소비량 만큼의 전력을 소비함
	// 모든 전자기기는 가지고 있는 동작을 콘솔에 출력
	
	

	public void powerSupply(int elect);
	public void powerConsum();
	public void powerOn();
	public void work();

}
