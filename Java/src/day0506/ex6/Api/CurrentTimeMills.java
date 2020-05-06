package day0506.ex6.Api;

public class CurrentTimeMills {

	public static void main(String[] args) {
		//currentTimeMills()
		long currentTime = System.currentTimeMillis();
		System.out.println("currnet time=" + currentTime);
		
		//소요시간
		long startTime = System.currentTimeMillis();
		int limit = 100000;
		for(int i = 0; i<limit;i++) {
			for(int j = 0; j<limit;j++) {
				for(int k = 0; k<limit;k++) {
				}
			}
		}
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		System.out.println("소요시간=" + elapsedTime + "(ms)");
		System.out.println("소요시간=" + elapsedTime/1000.0 + "(sec)");
	}
}	
