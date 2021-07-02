import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

import org.testng.annotations.Test;

public class Capgeimini {

	
	//Convert array to hashset and again from collection to array
	
	/*@Test
	public void abc() {
		String[] ar = {"Ele1", "Ele2"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(ar));
		
		 HashSet<String> hset = new HashSet<String>(Arrays.asList(ar));
		
	     //add elements to HashSet
		 hset.add("Ele2");
	     hset.add("Element2");
	     hset.add("Element3");
	     hset.add("Element4");
	 
	     // Displaying HashSet elements 
	     System.out.println("HashSet contains: "+ hset);
	 
	     // Creating an Array
	     String[] array = new String[hset.size()];
	     hset.toArray(array);
	     for(String x:array) {
	    	 System.out.println(x);
	     }
	}*/
	
	
	/*@Test
	public void abc() {
		System.out.println("abc");	
		String s = "2a5b6s2f";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char v = ch[i];
			
			int number = Integer.valueOf(String.valueOf(v));
			char a = ch[i+1];
			for(int j=1;j<=number;j++) {
				System.out.print(a+" ");
			}
			System.out.println();
			i++;
		}
	}*/
	
	/*
	 //Order of execution**************
	@Test(priority = -1)
	public void m1() {
		System.out.println("m1");			
	}
	@Test(priority = 0)
	public void m2() {
		System.out.println("m2");			
	}
	@Test
	public void m3() {
		System.out.println("m3");			
	}
	
	
	*/
	
	
	
	public static void main(String[] args) throws Exception {
		
	//Duplicate chars in a string with number of occurance****************
	
		
		
		/*//Duplicate string with number of occurance****************
		String s = "a is a good purna is purna a purna good boy";
		String[] v = s.split(" ");
		
		for(int i=0;i<v.length;i++) {
			
			int itr = 1;
			for(int j=i;j<v.length;j++) {
				
				if(v[i].equals(v[j]) && i!=j && !v[i].isEmpty()) {
					itr=itr+1;
				}
			}
			if(itr>1 && !v[i].isEmpty()) {
				System.out.println(v[i] +"-- Occoured --> "+itr);
				if(v[i].length()==1) {
					s = s.replace(" "+v[i], "");
					//System.out.println(s);
					v = s.split(" ");
				}else{
					s = s.replace(v[i], "");
					//System.out.println(s);
					v = s.split(" ");
				}
				
			}
			
			
		}*/
		
		
		
		/*try {
			
			int i=0;
			int j=1;
			int k=j/i;
			//throw new Exception();
			System.out.println("Inside Try Block");
		}catch(Exception e) {
			System.out.println("Inside catch Block");
		}
		finally {
			int i=0;
			int j=1;
			int k=j/i;
			System.out.println("Inside finally Block");
		}
		System.out.println("outside try catch finally");
		
		
	
	
	*/
	
		
		/*String[] s = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
		
		//System.out.println(s[0].length());
		System.out.println("****************");
		
		String[] s1=s[0].split(",");
		String[] s2=s[1].split(",");
		ArrayList<String> val = new ArrayList<String>();
		///System.out.println(s1.length);
	for(int i=0;i<s1.length;i++) {
		
		boolean flag = false;
		for(int j=0;j<s2.length;j++) {
			
			
			if(s1[i].trim().equals(s2[j].trim())) {
				flag = true;
			}
			
		}
		
		if(flag) {
		 
		 val.add(s1[i]);
		}
		
	}
	System.out.println(val);*/
		
		
		
		
		
		
		
		/*String x = "arrb6???4xxbl5???eee5";
		char[] ch=x.toCharArray();
		
		
		boolean output = false;
		int i = 0;
		int j=0;
		int k=0;
		int z=0;
		boolean val1 = false;
		boolean val2 = false;
		for(char c:ch) {
		
					if(Character.isDigit(c)) {
						System.out.println(c);
					}
			try{
				if(!val1) {
					k=Integer.parseInt(String.valueOf(c));
					val1 = true;
				}else {
					j=Integer.parseInt(String.valueOf(c));
					val2 = true;
				}
						
			}catch(Exception e) {
				
			}
			
			if(val1) {
				if(String.valueOf(c).equals("?")) {
					i=i+1;
				}	
			}
			
			if(val1 && val2) {
				z = k+j;
			
					if(i>=3 && z>= 0 && z<=10) {
						output = true;
						break;
					}
					
					val2 = false;
					k=j;
					j=0;
					z=0;
					i=0;
					
					
				
			}
			
		}
		
		
		System.out.println("Output is : "+output);*/
		/*
		String sen = "\"<fun&!! ?time purnach@#";
		
		String longest = "";
		 StringTokenizer st = new StringTokenizer(sen, " \t\n!@#$%^&*()\\/'\"-_+=.,:;{[}]<>?");
	     while (st.hasMoreTokens()) {
	         String tok = st.nextToken();
	         if(tok.length()>longest.length()) {
	             longest = tok;
	         }
	     }
	  //  System.out.println(longest);
		
	    
	    
	    int count = 0;
	    String max="";
	    String temp = "";
	    int lastlenght = 0;
	    char[] c = sen.toCharArray();
	    for(char ch:c) {
	    	//System.out.println(ch);
	    	
	    	if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
	    		count=count+1;
	    		temp = temp+String.valueOf(ch);
	    	}else {
	    		//System.out.println(temp);
	    		if(count>=lastlenght) {
	    			max = temp;
	    			lastlenght=count;
	    			count = 0;
	    			temp="";
	    		}
	    	}
	    	
	    }
	    
	    System.out.println(max);*/
	    
		
/*		
String str = "CTCu";
	    String val = "";
	    System.out.println(str.length());
	    
	    for(int i=str.length()-1;i>=0;i--){

	    		val = val+str.charAt(i);

	    }
		
		
		System.out.println(val);
		*/
		
		
		
		
		/*String s = "abcbc";
		
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			boolean flag = false;
			for(int j=i;j<ch.length;j++) {
				
				if(ch[i]==ch[j] && i!=j && ch[i]!=' ') {
					
				}
			}
			
			
		}*/
		
		
		
		/*String v = "kalala";
		System.out.println(v.length());
		String[] x = {"aa","bb", "cc"};
		System.out.println(x.length);*/
		
		/*String s = "abcdef".replace(" ", "");
		String val  =""; 
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			int itr=1;
			for(int j=i;j<ch.length;j++) {
				if(ch[i]==ch[j] && i!=j  ) {
					itr=itr+1;
				}
			}
			if(itr>1) {
				//System.out.println(ch[i] +"-- repeat --> ");
				s=s.replace(ch[i], '\0');
				ch =  s.toCharArray();
			}else {
				if(ch[i]!='\0') {
					//System.out.println(ch[i] +"-- Single --> ");
					val = String.valueOf(ch[i]);
					break;
					//String s = String.valueOf(b)
				}
				
			}
			
		}	
		
		
		
		System.out.println(val);*/
		
	/*	
		String s = "purna chandra pattanayak";
		String target = "";
		StringTokenizer str = new StringTokenizer(s);
		while(str.hasMoreTokens()) {
			
			
			String temp = str.nextToken();
			//char c = temp.charAt(0);
			String v = temp.substring(0,1);
			target = target+" "+temp.replace(v, v.toUpperCase());
			
			
			
			
		}
		
	System.out.println(target.trim()); //OP - Purna Chandra Pattanayak
	
	
		// Or method
		String s = "purna chandra pattanayak";
		String target = "";
		StringTokenizer str = new StringTokenizer(s);
		while(str.hasMoreTokens()) {
			String temp = str.nextToken();
			target = target+" "+Character.toUpperCase(temp.charAt(0))+temp.substring(1);		
			
		}
		
	System.out.println(target.trim()); //OP - Purna Chandra Pattanayak
		
		*/
		 
		
		
		
		
		
		/*int index=5;
		int[] i = {1,2,3,4,5,6,7,8,9};
			int[] v = new int[i.length];
			int itr= 0;
		
				
				
				for(int k=index;k<=i.length-1;k++) {
					
					v[itr] = i[k];
					
					itr++;
				}
				//System.out.println(itr);
				for(int m =0;m<index;m++) {
					
					v[itr] = i[m];
					
					itr++;
				}
				
				
			
				//System.out.print(v);
				
			for(int mm:v) {
				System.out.print(mm);
			}*/
		
		
		
		
		String s = "pu22!@w";
		String x ="";
		String b = "";
		String c = "";
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))) {
				
				x = x+s.charAt(i);
			}else if(Character.isDigit(s.charAt(i))) {
				
				b = b+s.charAt(i);
			}else {
				//System.out.println("Not Letter : "+s.charAt(i));
				c = c+s.charAt(i);
			}
		}
		
		System.out.println("Letter : "+x);
		System.out.println("Digit :"+b);
		System.out.println("Symbol :"+c);
	}
	
	
}











