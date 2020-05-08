package day0508.ex02.FileClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex05Byte {

	public static void main(String[] args) {
		//File
		File fs = new File("C:/MyWork/FileSource.txt");	//대상 파일
		File ft = new File("C:/MyWork/FileTarget.txt");
		//Stream
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(fs);
			fos = new FileOutputStream(ft);
			
			while(true) {
				int readInt = fis.read();	//read
				if(readInt == -1) {
					break;
				}
			}
			//Close
			fis.close();
			fos.close();
			
		} catch(IOException e) {
			System.out.println("-----catch() : IOException ---");
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch(IOException e) {
				System.out.println("-----catch() : FileInputStream Close ---");
				e.printStackTrace();
			}
			try {
				if(fos != null) {
					fos.close();
				}
			} catch(IOException e) {
				System.out.println("-----catch() : FileOutputStream Close ---");
				e.printStackTrace();
			}
		}
	}
}
