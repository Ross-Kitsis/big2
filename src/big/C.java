package big;
import java.io.*;
import java.util.*;

public class C 
{
	public static void main(String[] args)
	{
		Map<String,Integer> ngrams = new HashMap<String,Integer>();
		int size = 2;
		Common c = new Common(new char[0]);
		
		
		File f = new File("books");
		
		File[] files = f.listFiles();
		for(int i = 0; i < files.length; i++)
		{
			//System.out.println(files[i].getAbsolutePath());
			BufferedReader br = null;
			
			try {
				String current;
				br = new BufferedReader(new FileReader(files[i].getAbsolutePath()));
				
				while( (current = br.readLine()) != null)
				{
					c.getNgrams(current, size, ngrams);
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}
}
