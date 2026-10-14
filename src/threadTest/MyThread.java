package threadTest;

public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("쓰레드 작업:"+i);
		}
	}

}
