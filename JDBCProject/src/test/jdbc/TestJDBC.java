package test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC program 개발 (JDBC 프레임워크)
 * 7단계의 프로세스로 구성
 * 1. JDBC 드라이버를 JVM에 로딩하고 JDBC DriverManager에 등록하는 과정 (driver loading & registry)
 * 1-1. Class.forName("jdbc.oracle.driver.OracleDriver.class");
 * 2. DB에 접속 (db connection)
 * 2-1. connection = DriverManager.getConnection(url, user, password);
 * 3. 명령어(트랜젝션) 생성(create statement)
 * 3-1. stmt = connection.createStatement(sql);
 * 4. 명령어 실행(명령 성공 여부, 몇 개의 row/record가 적용, 결과 record set을 보임)
 * 4-1. stmt.execute()/executeUpdate()/executeQuery() 
 * 5. 결과 레코드 세트(Result-Record-Set)를 처리
 * 5-1. resultSet.next(), resultSet.getOoo()
 * 6. 트랜젝션을 종료
 * 6-1. resultSet.close(); stmt.close();
 * 7. 접속 끊기
 * 7-1. connection.close();
 * 
 * JDBC SQL 예외 발생을 처리
 */

public class TestJDBC {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		 * 1. JDBC 드라이버를 JVM에 로딩하고 JDBC DriverManager에 등록하는 과정 (driver loading & registry)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		 * 2. DB에 접속 (db connection)
		
		String url = "jdbc:oracle:thin:@//localhost:1521/XE";
		String user = "hr";
		String password = "hr";
		Connection connection = DriverManager.getConnection(url, user, password);
//		 * 3. 명령어(트랜젝션) 생성(create statement)
		String sql = "SELECT * FROM TB_DATA";
		Statement stmt = connection.createStatement();
		
		
//		 * 4. 명령어 실행(명령 성공 여부, 몇 개의 row/record가 적용, 결과 record set을 보임)
		ResultSet resultSet = stmt.executeQuery(sql); 
//		 * 5. 결과 레코드 세트(Result-Record-Set)를 처리
		resultSet.next();
		String id = resultSet.getString(2);
		String pwd = resultSet.getString("PASSWARD");
		System.out.println("id=" + id + "/password:" + pwd);
		//DB를 가져올 때는 1부터 시작
//		 * 6. 트랜젝션을 종료
		resultSet.close(); stmt.close();
//		 * 7. 접속 끊기
		connection.close();
	}

}
