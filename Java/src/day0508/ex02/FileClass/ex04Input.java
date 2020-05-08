package day0508.ex02.FileClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ex04Input {

	public static void main(String[] args) {
		//File
		File file = new File("C:/MyWork/FileSource.txt");	//대상 파일
		//Stream
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);	// file 타입 객체와 스트림을 생성
			
			while(true) {
				int readInt = fis.read(); //read : 1byte
				if(readInt == -1) { //EoF(End of File)을 만나면 -1을 반환
					break;	//while문 종료
				}
				//화면 출력
				System.out.print((char) readInt);		//write : 문자로 변환하여 출력
			}
			//Close : 반드시 구현
			fis.close();
		} catch(IOException e) {
			System.out.println("\n-------catch() : IOException ---------");
			e.printStackTrace();
		} finally {
			//release all system resource from the streams
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				System.out.println("\n-------catch() : FileInputStream Close ---------");
				e.printStackTrace();
			}
		}
	}
}
