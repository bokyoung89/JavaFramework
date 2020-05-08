package day0508.ex02.FileClass;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex06Character {

	public static void main(String[] args) {
		//File
		File fs = new File("C:/MyWork/FileSource.txt");	//대상 파일
		File ft = new File("C:/MyWork/FileTarget.txt");
		//Stream
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(fs);	// file 타입 객체와 스트림을 생성
			fw = new FileWriter(ft);
			
			while(true) {
				int readInt = fr.read(); //read : 2byte
				if(readInt == -1) { //EoF(End of File)을 만나면 -1을 반환
					break;	//while문 종료
				}
				//화면 출력
				fw.write(readInt);	//write
			}
			//Close : 반드시 구현
			fr.close();
			fw.close();
			
		} catch(IOException e) {
			System.out.println("\n-------catch() : IOException ---------");
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				System.out.println("\n-------catch() : FileReader Close ---------");
				e.printStackTrace();
			}
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (Exception e) {
				System.out.println("\n-------catch() : FileWriter Close ---------");
				e.printStackTrace();
			}
		}
	}
}
