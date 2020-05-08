package day0508.ex02.FileClass;

import java.io.File;

public class ex03MainLootList {

	public static void main(String[] args) {
		
		File[] rootArray = File.listRoots();	//사용 가능한 파일 시스템 
		for(int i=0; i<rootArray.length; i++) {
			File root = rootArray[i];
			System.out.println(root);
		}
	}
}
