package threadGame;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("============================");
		System.out.println("==== 경주마 경기가 시작됩니다 ====");
		System.out.println("============================");
		
		//경주마 스레드를 4마리 생성
		Horse h1 = new Horse("번개");
		Horse h2 = new Horse("날쌘돌이");
		Horse h3 = new Horse("질풍");
		Horse h4 = new Horse("바람돌이");
		
		//스레드 시작->4마리의 경주마가 달리기 시작!
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		
		try {
			//쓰레드이름.join()->해당 쓰레드가 종료될 때 까지 메인스레드를 기다리게 하는 기능
			h1.join();
			h2.join();
			h3.join();
			h4.join();
			//모든 4마리 경주마가 모두 결승선을 통과(쓰레드 종료)된 후에 메인 스레드를 실행하기 위함
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("==============================");
		System.out.println("== 모든 말이 결승점 도착! 경기끝! ==");
		System.out.println("==============================");

	}

}
