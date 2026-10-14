package threadTest;

public class MainClass4 {

	public static void main(String[] args) {
		
		AlarmThread alarm = new AlarmThread();
		alarm.start(); //백그라운드서 알람 울리기 시작
		//2초에 한번씩 알람을 울리고 총 3번 알람을 울리는 쓰레드
		
		//메인스레드는 6 5 4 3 2 1 카운트 다운 작업을 진행
		for(int i=6;i>=1;i--) { //6 5 4 3 2 1
			System.out.println("남은시간:" + i + "초");
			try {
				Thread.sleep(1000); //1초 간격으로 카운트 다운
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		System.out.println("타임 아웃! 프로그램 종료!");

	}

}
