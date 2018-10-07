package pattern.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class io {
	
	public static void main(String[] args) throws IOException  {
		File f = new File("C:\\temp\\test.txt");
		FileReader fr = new FileReader(f);
		// Read the characters
		char[] temp = new char[10];
		int i = -1;
		while ( (i=fr.read(temp)) !=-1) {
			String s = new String(temp, 0, i);
			System.out.println(s);
		}
		
		BufferedReader br = new BufferedReader(fr);
//		String line = br.readLine();
//		while (line != null) {
//			System.out.println(line);
//			line = br.readLine();
//		}
		LineNumberReader lr = new LineNumberReader(br);
		String line = lr.readLine();
		while (line != null) {
			System.out.println(line + ":" + lr.getLineNumber());
			line = lr.readLine();
		}	
		lr.close();
		br.close();
		fr.close();
	}
}
