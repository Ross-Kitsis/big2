package big;

import java.util.*;

public class B 
{
	
	public static void main(String[] args)
	{	
		int numWord = 10000;
		
		//Space
		Character[] space = new Character[6934];
		Arrays.fill(space, ' ');
		//E
		Character[] e = new Character[3277];
		Arrays.fill(e, 'e');
		//O
		Character[] o = new Character[2578];
		Arrays.fill(o, 'o');
		//t
		Character[] t = new Character[2557];
		Arrays.fill(t, 't');
		//a
		Character[] a = new Character[2043];
		Arrays.fill(a, 'a');
		//s
		Character[] s = new Character[1856];
		Arrays.fill(s, 's');
		//h
		Character[] h = new Character[1773];
		Arrays.fill(h, 'h');
		//n
		Character[] n = new Character[1741];
		Arrays.fill(n, 'n');
		//i
		Character[] i = new Character[1736];
		Arrays.fill(i, 'i');
		//r
		Character[] r = new Character[1593];
		Arrays.fill(r, 'r');
		//l
		Character[] l = new Character[1238];
		Arrays.fill(l, 'l');
		//d
		Character[] d = new Character[1099];
		Arrays.fill(d, 'd');
		//u
		Character[] u = new Character[1014];
		Arrays.fill(u, 'u');
		//m
		Character[] m = new Character[889];
		Arrays.fill(m, 'm');
		//y
		Character[] y = new Character[783];
		Arrays.fill(y, 'y');
		//w
		Character[] w = new Character[716];
		Arrays.fill(w, 'w');
		//f
		Character[] f = new Character[629];
		Arrays.fill(f, 'f');
		//c
		Character[] c = new Character[584];
		Arrays.fill(c, 'c');
		//g
		Character[] g = new Character[478];
		Arrays.fill(g, 'g');
		//p
		Character[] p = new Character[433];
		Arrays.fill(p, 'p');
		//b
		Character[] b = new Character[410];
		Arrays.fill(b, 'b');
		//v
		Character[] v = new Character[309];
		Arrays.fill(v, 'v');
		//k
		Character[] k = new Character[255];
		Arrays.fill(k, 'k');
		//.
		Character[] per = new Character[203];
		Arrays.fill(per, '.');
		//j
		Character[] j = new Character[34];
		Arrays.fill(j, 'j');
		//q
		Character[] q = new Character[27];
		Arrays.fill(q, 'q');
		//x
		Character[] x = new Character[21];
		Arrays.fill(x, 'x');
		//z
		Character[] z = new Character[14];
		Arrays.fill(z, 'z');
		
		//Concatenate all arrays
		List<Character> list = new ArrayList<Character>();
		list.addAll(Arrays.asList(space));
		list.addAll(Arrays.asList(e));
		list.addAll(Arrays.asList(o));
		list.addAll(Arrays.asList(t));
		list.addAll(Arrays.asList(a));
		list.addAll(Arrays.asList(s));
		list.addAll(Arrays.asList(h));
		list.addAll(Arrays.asList(n));
		list.addAll(Arrays.asList(i));
		list.addAll(Arrays.asList(r));
		list.addAll(Arrays.asList(l));
		list.addAll(Arrays.asList(d));
		list.addAll(Arrays.asList(u));
		list.addAll(Arrays.asList(m));
		list.addAll(Arrays.asList(y));
		list.addAll(Arrays.asList(w));
		list.addAll(Arrays.asList(f));
		list.addAll(Arrays.asList(c));
		list.addAll(Arrays.asList(g));
		list.addAll(Arrays.asList(p));
		list.addAll(Arrays.asList(b));
		list.addAll(Arrays.asList(v));
		list.addAll(Arrays.asList(k));
		list.addAll(Arrays.asList(per));
		list.addAll(Arrays.asList(j));
		list.addAll(Arrays.asList(q));
		list.addAll(Arrays.asList(x));
		list.addAll(Arrays.asList(z));
		
		Character[] al = list.toArray(new Character[0]);
		
		char[] alph = new char[al.length];
		
		for(int count = 0; count < al.length; count++)
		{
			alph[count] = al[count].charValue();
		}
		
		
		Common com = new Common(alph);
		com.buildDictionary();
		
		String[] words = com.makeWords(numWord);
		List<String> validWords = com.findWords(words);
		
		System.out.println("Number of words created: " + validWords.size());
		System.out.println("% Words valid: " + validWords.size() / (double)(numWord) * 100 + "%");
		
		System.out.println("---DONE---");
	}
}
