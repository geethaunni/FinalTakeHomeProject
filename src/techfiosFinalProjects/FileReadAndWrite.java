package techfiosFinalProjects;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReadAndWrite {		 

		static String path = "src\\techfiosFinalProjects\\myfile.txt";

		public static void doesFileExist(String path) {
		File file = new File(path);
		try {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		try {
		while ((line = br.readLine()) != null) {

		// System.out.println(line);
		readLine(line);
		}
		} catch (IOException e) {
		
		e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
		
		e.printStackTrace();
		}

		}

		public static void readLine(String line) {
		String[] words = line.split("-");
		System.out.println(words[0]);

		if (words[1].indexOf(",") >= 0) {
		String[] subWords = words[1].split(",");
		System.out.println(subWords[0]);
		System.out.println(subWords[1]);
		}
		else
		{
		System.out.println(words[1]);
		}
		System.out.println("===================================");
		}

		
		public static void main(String[] args) {
		doesFileExist(path);
		}

		

	}


