package threadGame;

//100미터 달리기 대회
public class Horse extends Thread { //경주마 클래스
	
	private String name; //말이름
	private int distance = 0; //말이 달린 거리
	
	public Horse(String name) { //말이름을 객체 생성시 인수로 받기 위한 생성자		
		this.name = name;
	}

	public String getHorseName() {
		return name;
	}

	public void setHorseName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		while(distance < 100) { //거짓->결승선을 통과
			//1~5 미터 사이의 랜덤한 거리로 전진(랜덤->경주마 마다 속도가 달라짐)
			int randomStep = (int)(Math.random() * 5) + 1;
			
			distance = distance + randomStep;
			
			//만약 100을 넘으면 100으로 보정
			if(distance > 100) {
				distance = 100;
			}
			
			//트랙 그래픽 표시
			String track = "";
			for(int i=0;i<distance;i=i+1) {
				track = track + ">";
			}
			
			System.out.println("[" + name + "]" + distance + "m" + track);
			System.out.println("--------------------------------");
			
			try {
				Thread.sleep(200); //게임이 너무 빨리 끝나지 않도록 0.2초 동안 잠깐 멈춤 추가
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
		//결승점을 통과하여 경기를 마친 경주마의 이름이 출력
		System.out.println("[" + this.name + "] 경주마 결승점 통과!");
	}
	

}
