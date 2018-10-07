package pattern.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberInputStream;

import org.omg.CORBA.DataInputStream;

public class charIO {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f = new File("C:\\temp\\test.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while (s!= null) {
			System.out.println(s);
			s = br.readLine();
		}
		
//		char[] cbuf = new char[10];
//		int i = -1;
//		
//		while ((i=fr.read(cbuf)) != -1) {
//			String s = new String(cbuf);
//			System.out.println(s);
//		}
		
		fr.close();
		
//		FileInputStream fis = new FileInputStream(f);
//		byte[] b = new byte[20];
//		int i = -1;
//		while ( (i=fis.read(b)) !=-1 ) {
//			String s = new String(b, 0, i);
//			System.out.println(s);
//		}
		
//		BufferedInputStream bis = new BufferedInputStream(fis);
		
	
		
		
	}
}
