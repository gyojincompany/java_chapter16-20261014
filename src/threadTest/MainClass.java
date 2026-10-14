package threadTest;

public class MainClass {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.run(); //일반 메서드 실행->쓰레드가 적용 안됨
		t2.run();
		
		System.out.println("=====================");
		
		t1.start(); //쓰레드는 반드시 start()로 실행해야 함
		t2.start();
	}

}
