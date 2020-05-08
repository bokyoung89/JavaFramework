package day0508.ex02.Stream;

import java.io.File;
import java.io.IOException;

public class MainListFiles {

	public static void main(String[] args) {
		
		//====== File 객체 생성 =========
		String filePath = "C:/MyWork";
		File file = new File(filePath);
		boolean isExist = file.exists();
		boolean isDirectory = file.isDirectory();
		
		//====== 디렉토리 정보 출력  =========
		if(isExist && isDirectory) {	//디렉토리가 있으면
			File[] fileArray = file.listFiles();
			for(int i=0; i<fileArray.length; i++) {
				//========= Type 출력 ==========
				String type ="<Dir>";
				if(fileArray[i].isFile()) {
					type = "file";
				}
			}
		}
		// 파일 생성
//		if(!isExist) {
//			try {
//				file.createNewFile();
//			} catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
		
	}
}
