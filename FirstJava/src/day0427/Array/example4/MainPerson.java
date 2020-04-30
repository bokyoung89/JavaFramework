package day0427.Array.example4;

public class MainPerson {
		int data;

	public static void main(String[] args) {
		
		Person[] personArray;
		//Creation
		personArray = new Person[3];
		//initialzation [Type 1]
		personArray[0] = new Person();
		personArray[0].setName("Hong");
		personArray[0].setAge(30);
		//initialzation [Type 2]
		personArray[1] = new Person("Lee", 40);
		//initialzation [Type 3]
		Person p = new Person("Park", 35);
		personArray[2]=p;
		
//		personArray[0].printInfo();
//		personArray[1].printInfo();
//		personArray[2].printInfo();
		
		int arrayLength = personArray.length;
		System.out.println("배열길이=[" + arrayLength + "]");
		System.out.println();
		for(int i=0; i<personArray.length;i++) {
			System.out.print("personArray[" + i + "]");
			personArray[i].printInfo();
		}
	}

}

