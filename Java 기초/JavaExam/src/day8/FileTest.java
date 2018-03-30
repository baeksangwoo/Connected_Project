package day8;
import java.io.File;
public class FileTest {
	public static void main(String[] args) {
		// 점검하려는 파일명이나 디렉토리명을 표준입력(키보드)
		// 으로 받아 처리하도록 소스 수정 - Scanner
		File f = new File(
				"C:/unico/workspace/javaexam/src");
		if(f.exists()) {
			if(f.isDirectory()) {
				System.out.println("디렉토리입니다.");
			} else {
				System.out.println(f.length()+" 바이트의 파일입니다.");
			}
		} else {
			System.out.println("존재하지 않습니다.");
		}
	}
}
