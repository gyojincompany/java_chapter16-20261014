package threadTest;

public class ThreadTest01 {

	public static void main(String[] args) {
		//쓰레드를 사용하는 경우
		
		Thread t1 = new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("첫 번째 작업:"+i);
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("두 번째 작업:"+i);
			}
		});
		
		t1.start(); //t1 쓰레드 시작
		t2.start(); //t2 쓰레드 시작
		
		
		

	}

}
