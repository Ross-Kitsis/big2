package big;

import java.io.*;
import java.util.*;

public class Common 
{
	private char[] alph;	
	private final String dictLocation = "wordList.txt";
	private List<String> dictionary;
	
	public Common(char[] alph)
	{
		this.alph = alph;
		this.dictionary = new ArrayList<String>();
	}
	/*Create a list with all words in the english dictionary*/
	public void buildDictionary()
	{
		BufferedReader br = null;
		
		try {
			String current;
			br = new BufferedReader(new FileReader(dictLocation));
			
			while( (current = br.readLine()) != null)
			{
				dictionary.add(current);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/*Create random words based on the given alphabet*/
	public String[] makeWords(int numWords)
	{
		String[] words = new String[numWords];
		StringBuilder sb = new StringBuilder();
		Random r = new Random(System.currentTimeMillis());
		char randChar;
		int totalWords = 0;
		
		
		while(totalWords < numWords)
		{
			randChar = this.alph[r.nextInt(alph.length)];
			if(randChar == ' ')
			{
				words[totalWords] = sb.toString();
				sb = new StringBuilder();
				totalWords++;
			}else
			{
				sb.append(randChar);
			}
		}
		
		return words;
	}
	/*Check array of random words for english words*/
	public List<String> findWords(String []genWords)
	{
		List<String> toReturn = new ArrayList<String>();
		//System.out.println(toReturn.size());
		
		for(String s: genWords)
		{
			if(s.length() > 1 && dictionary.contains(s))
			{
				//System.out.println(s);
				toReturn.add(s);
			}
		}
		//System.out.println(toReturn.size());
		return toReturn;
	}
	
	//Find ngrams in the passed text with the passed size, place found ngrams into the map
	public void getNgrams(String text, int size, Map<String,Integer> ngrams)
	{
		int end;
		String toAdd;
		
		for(int start = 0; start < text.length(); start++)
		{
			//Start inclusive
			//End exclusive
			end = start+size;
			if(end < text.length())
			{
				toAdd = text.substring(start,end);
			}else
			{
				toAdd = text.substring(start, text.length());
				while(toAdd.length() < size)
				{
					toAdd = toAdd + "_";
				}	
			}
			//Add to ngram map
			if(ngrams.containsKey(toAdd))
			{
				Integer i = ngrams.get(toAdd);
				ngrams.put(toAdd, i.intValue() + 1);
			}else
			{
				ngrams.put(toAdd, 1);
			}
		}
	}
	//Set the alphabete (used if need to change)
	public void setAlph(char[] alph)
	{
		this.alph = alph;
	}
	
}
