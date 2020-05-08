package day0508.ex03.Scanner.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day0507.ex02.ListEx.Person;

public class ex07PersonScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean menu = true;
		ArrayList<Person> personList = new ArrayList<Person>();

		while(menu) {
			System.out.println("[메뉴 선택]");
			System.out.println("1. 전체 출력");
			System.out.println("2. 등록");
			System.out.println("3. 종료");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				 System.out.println("[전체출력]");

				for(int i=0; i<personList.size(); i++) {
					personList.get(i).printInfo();
//					Object obj = personList.get(i);
//					Person personObj = (Person) obj;
//					personObj.printInfo();
					}
				break;
				//전체 출력
			case 2:
				System.out.println("이름을 입력하세요 =>");
				System.out.println("나이를 입력하세요 =>");
				String inputName = sc.next();
				int inputAge = sc.nextInt();
				Person p = new Person(inputName, inputAge );
				personList.add(p);
				System.out.println("계속 진행합니다.");
				break;
			case 3:
				System.out.println("종료합니다.");
				break;
				}
			}
		}
	}
