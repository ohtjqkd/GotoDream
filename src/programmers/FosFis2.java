package programmers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FosFis2 {
	public static void main(String[] args) {
		long sysStart = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("src/programmers/FindKim.java");
			fos = new FileOutputStream("src/programmers/findKim.txt");
			int readCount = -1;
			byte[] buffer = new byte[512]; 
			while((readCount = fis.read(buffer)) != -1) {
				fos.write(buffer,0,readCount);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long sysEnd = System.currentTimeMillis();
		System.out.println(sysEnd - sysStart);
	}

}
