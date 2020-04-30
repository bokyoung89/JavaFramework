package day0428.exam3;

public class Ade extends Menu {
	//부모 클래스로부터 모든 요소(변수, 메소드)를 상속받기 때문에 새로 추가되는 요소만 적는다.
	//클래스가 간결해진다. 가독성이 높아짐.
	String ingredient;

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
}
