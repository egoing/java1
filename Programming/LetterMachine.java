import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LetterMachine {

	public static void main(String[] args) throws IOException {
		
		// Read file - letter.in.txt
		
		File file = new File("letter.in.txt"); 
		  
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		String letterContent = "";
		String st; 
		while ((st = br.readLine()) != null) {
			letterContent = letterContent + st;
		}
		
		// replace argument
		letterContent = letterContent.replace("[[[name]]]", args[0]);
		
		
		// Write file - letter.out.txt
		
		PrintWriter writer = new PrintWriter("letter.out.txt", "UTF-8");
		writer.println(letterContent);
		writer.close();
		
		// Print Success! to Monitor.
		System.out.println("Success! : "+letterContent);
	}

}
