/**
 * 
 */
package interviewQuestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author vamsi
 *
 */
public class ReadFile {

	/**
	 * @param args
	 */
    //Give a file path(Location) of  file i.e we want to read.
	// used static because value for variable path  will not change in class 
	static String path="C:/Users/vamsi/eclipse-workspace/iofiles/vamsi.txt";

	 
	public static void main(String[] args)
	{
		// Initialize the counters 
		int charcount=0;
		int wordCount=0;
		int lineCount=0;
		//object reader is created to access BufferReader methods 
		 BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(path));
			String currentLine = reader.readLine();
			while(currentLine!=null)
			{
				lineCount++;
				//words count
				//Splitting  line into words by dividing with space
				//Array of words is created to store string values
				String words[]=currentLine.split(" ");
				wordCount=wordCount+words.length;
				currentLine=reader.readLine();
				//Line count
				//variable of word is created to parse the string 
				for (String word:words) {
					charcount=charcount+word.length();
				}
			}
			System.out.println("Number of lines are "+lineCount);
			System.out.println("Number of words are "+wordCount);
			System.out.println("Number of character are "+charcount);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	}


