import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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
	
		/*String s = "Great learningr ra".replace(" ", "");
		
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			int itr=1;
			for(int j=i;j<ch.length;j++) {
				if(ch[i]==ch[j] && i!=j ) {
					itr=itr+1;
				}
			}
			if(itr>1) {
				System.out.println(ch[i] +"-- Occoured --> "+itr);
			}
			
		}	*/
		
		
		
		//Duplicate string with number of occurance****************
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
			
			
		}
		
		
		
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
	
	
	
	
	}
	
	
}
