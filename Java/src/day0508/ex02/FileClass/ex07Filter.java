package day0508.ex02.FileClass;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex07Filter {

	// ** filter class: 기본 파일에서 추가적으로 달 수 있다. buffered는 빠른 처리를 위해 사용한다.
	
	public static void main(String[] args) {
		
				//File
				File fs = new File("C:/MyWork/Dog.zip");	//대상 파일
				File ft = new File("C:/MyWork/target_Dog.zip");
				
				//Stream
				FileInputStream fis = null;
				FileOutputStream fos = null;
				BufferedInputStream bis = null;
				BufferedOutputStream bos = null;
				
				try {
					fis = new FileInputStream(fs);
					bis = new BufferedInputStream(fis);	//file inputStream이 입력값으로 들어가서 연결
					fos = new FileOutputStream(ft);		//입력을 하려는 대상에 대해서 file과 input에 buffered를 추가로 단 것.
					bos = new BufferedOutputStream(fos);
					
					long startTime = System.currentTimeMillis();
					while(true) {
						int readInt = bis.read();	//bis로 변경
						if(readInt == -1) {
							break;
						}
						bos.write(readInt);	//bos로 변경
					}
					long endTime = System.currentTimeMillis();
					
					long elapsedTime = endTime - startTime;
					double elapsedTimeSec = elapsedTime / 1000.0;
					System.out.println("작업시간=" + elapsedTime + "(ms)|");
					System.out.println(elapsedTimeSec + "(sec)|");
					//Close
					
					bis.close(); // 끝에서부터 순서대로 닫는다. 
					fis.close();
					
					bos.close();
					fos.close();
					
				} catch(IOException e) {
					System.out.println("-----catch() : IOException ---");
					e.printStackTrace();
				} finally {
					try {
						if(bis != null) {	//bufferedInputStream부터 닫는다.
							bis.close();
						}
					} catch(IOException e) {
						System.out.println("-----catch() : BufferedInputStream Close ---");
						e.printStackTrace();
					}
					try {
						if(fis != null) {
							fis.close();
						}
					} catch(IOException e) {
						System.out.println("-----catch() : FileInputStream Close ---");
						e.printStackTrace();
					}
					try {
						if(bos != null) {
							bos.close();
						}
					} catch(IOException e) {
						System.out.println("-----catch() : BufferedOutputStream Close ---");
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