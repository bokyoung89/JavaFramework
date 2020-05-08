package day0508.ex02.FileClass;

import java.io.File;
import java.io.IOException;

public class ex01CreateNewFile {

	public static void main(String[] args) {
		String filePath = "C:/MyWork/MyFile.txt";
		File file = new File(filePath);
		boolean isExist = file.exists();	//디렉토리 존재 여부
		System.out.println("exist=" + isExist);
		
		//=========== 파일 생성 ============
		//C:/MyWork 디렉토리가 있어야 Myfile.txt가 생성된다.
		if(!isExist) {
			try {
				System.out.println("=========== createNewFile()===========");
				file.createNewFile();
			} catch(IOException e) {
				e.printStackTrace();	//예외 발생하면 stack에 들어있는 정보가 화면에 출력
			}
		}
		
		//========= File 정보 ============
		System.out.println("======= File 정보 ==========");
		String fileAbsolutePath = file.getAbsolutePath();
		System.out.println("getAbsolutePath()=" + fileAbsolutePath);
		isExist = file.exists();
		System.out.println("exist()=" + isExist);
		String name = file.getName();
		System.out.println("getName()=" + name);
		boolean isFile = file.isFile();
		System.out.println("isFile()=" + isFile);
		long fileLenght = file.length();
		System.out.println("length()=" + fileLenght);
		
		//=========== 파일 이름 생성 ============	//파일 객체 두 개를 이용. 파일 객체는 접근하기 위한 정보만 가지고 있다. 위치해 있는 파일 있으면 가져온다.
		System.out.println("=========== renameTo()============");
		String renameFilePath = "C:/MyWork/MyFileNew.txt";
		File renameFile = new File(renameFilePath);
		file.renameTo(renameFile);
		
		//=========== 파일 삭제 ============
		System.out.println("========delete()========");
		boolean isDelete = file.delete();	//MyFile.txt 삭제
		System.out.println("delete()=" + isDelete);
		isExist = file.exists();
		System.out.println("exist()=" + isExist);
	} 
}


