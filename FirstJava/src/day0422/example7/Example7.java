package day0422.example7;

public class Example7 {

	public static void main(String[] args) {
		FootballPlayer player1 = new FootballPlayer();
		
		player1.setName("구자철");
		player1.setTeam("알가라파");
		player1.setNumber(10);
		player1.setSpeed(5);
		player1.setSkill(3);
		
		player1.printInfo();
		
		FootballPlayer player2 = new FootballPlayer();
		
		player2.setName("이현승");
		player2.setTeam("김해시청");
		player2.setNumber(10);
		player2.setSpeed(5);
		player2.setSkill(4);
		
		player2.printInfo();

	}

}
