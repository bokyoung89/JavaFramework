package day0508.ex02.FileClass;

import java.io.File;

public class ex02CreateNewFolder {

	public static void main(String[] args) {
		String filePath = "C:/MyWork/MyFolder";
		File file = new File(filePath);
		
		boolean isExist = file.exists();	// 디렉토리 존재 여부
		System.out.println("exist()=" + isExist);
		//======= 디렉토리 생성 =========
		//C:/MyWork 디렉토리가 있어야 MyFolder가 생성된다.
		if(!isExist) {
			System.out.println("======= mkdir() =========");
			file.mkdir();
		}
		//======= File 정보 =========
		System.out.println("======= File 정보 =========");
		String fileAbsolutePath = file.getAbsolutePath();
		System.out.println("getAbsolutePath()" + fileAbsolutePath);
		isExist = file.exists();
		System.out.println("exist()=" + isExist);
		String name = file.getName();
		System.out.println("getName()=" + name);
		boolean isDirectory = file.isDirectory();
		System.out.println("isDirectory()=" + isDirectory);
		
		//======= 디렉토리 삭제 =========
		System.out.println("======== delete() ==========");	//빈 폴더만 삭제 가능
		boolean isDelete = file.delete();
		System.out.println("delete()=" + isDelete);
		isExist = file.exists();
		System.out.println("exist()=" + isExist);

	}

}
