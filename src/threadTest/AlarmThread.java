package threadTest;

public class AlarmThread extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=3;i++) { //1번 실행 시 3번 알람(2초 간격)
			try {
				Thread.sleep(2000); //2초
				System.out.println("[알람] 삐!삐!삐!삐!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
		}
	}

	
}
