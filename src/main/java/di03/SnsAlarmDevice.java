package di03;

import org.springframework.stereotype.Component;

@Component
public class SnsAlarmDevice implements AlarmDevice{
	@Override
	public void alarm(String name) {
		System.out.println(name + "에서 침입 탐지됨. 신고 요망");
	}	
}
