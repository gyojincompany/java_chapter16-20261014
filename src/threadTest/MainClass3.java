package threadTest;

public class MainClass3 {

	public static void main(String[] args) {
		
		HelloThread ht1 = new HelloThread();
		
		HiThread ht2 = new HiThread();
		
		//2개의 스레드가 동시에 실행된다! 코딩 순서는 의미가 없다.
		ht1.start();
		ht2.start();

	}

}
