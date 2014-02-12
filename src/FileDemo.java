import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class FileDemo {

	private static void writeHTMLToFile(String file, String url) throws Exception{
		URL testurl = new URL(url);
		BufferedReader in = new BufferedReader(new InputStreamReader(testurl.openStream()));
		BufferedWriter out = new BufferedWriter(new FileWriter(new File("src/"+file+".html")));
		String nextline;
		while ((nextline=in.readLine()) != null) {
			out.write(nextline);
		}
		
		in.close();
		out.close();
	}
	
	public static void main(String[] args) throws Exception {
		writeHTMLToFile("test", "https://www.google.com");

	}

}
