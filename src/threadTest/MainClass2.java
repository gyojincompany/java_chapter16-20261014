package threadTest;

public class MainClass2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000); //1초간 cpu 휴식
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}//단위 밀리세컨드->1초
		}
		

	}

}
