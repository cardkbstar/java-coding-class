package window2;

public class TV {

	String shape;
	boolean stand;
	
	public void change(int ch) {
		System.out.println(ch + "번호로 채널을 변경하다");
	}
	public void turnOn() {
		System.out.println("TV를 켜다");
		
		System.out.println("---------------");
		
		TV tv1 = new TV();
		tv1.shape = "네모";
		tv1.stand = true;
		
		tv1.turnOn();
		tv1.change(1);
		
	}
	 
	
}
