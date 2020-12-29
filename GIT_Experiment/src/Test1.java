import java.util.List;
import java.util.Locale;

public class Test1 {

	 

	 public static void main(String[] args) {
	
	/*	
		 System.out.println("Locale : "+Locale.getDefault()); 
		 Locale[] l = Locale.getAvailableLocales();
		 for(Locale lq:l) {
			 System.out.println("Locale : "+lq.toString()); 
		 }
		
		 */
		 
		 
		 /*   
		    * * *
		     * *
		      *
		 */
		 
		 
		 int n = 6; 
		    for(int i=n;i>0;i--) {
		    	
		    	
		    	
		    	for(int k=0;k<=n-i;k++) {
		    		System.out.print("* ");
		    	}
		    	for(int j=0;j<(n-i-1);j++) {
		    		System.out.print(" ");
		    	}
		    	System.out.println();
		    }
		 
		 
		 
		 
		 
		 
		 /*   *
		     * *
		    * * *
		 */
		 
		/* 
		 int n = 6; 
		    for(int i=0;i<n;i++) {
		    	
		    	for(int j=0;j<(n-i-1);j++) {
		    		System.out.print(" ");
		    	}
		    	
		    	for(int k=0;k<=i;k++) {
		    		System.out.print("* ");
		    	}
		    	System.out.println();
		    }*/
		 
		 
		 
		 
		 
		 
		 
		 
		 /* *
		  	**
		    ***
		    ****
		 **/
		 
		   /* int n = 5; 
	    for(int i=1;i<n;i++) {
	    	
	    	for(int j=0;j<i;j++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }*/
		 
		 
		 
		 
		 
		 
		 
		 
		//Arm strong number********************
		
		 /*int n = 153;
		String v = String.valueOf(n);
		char[] c = v.toCharArray();
		double sum = 0;
		for(char val:c) {
			System.out.println(val);
			int num = Integer.parseInt(String.valueOf(val));
			
			double sq = Math.pow(num, c.length);
			sum = sum+(sq);
			
			
		}
		
		int fi = (int)sum;
		System.out.println("Final val -> "+fi);*/
		
		
		//Arm strong number********************
		/*
		int n =370;
		int len = String.valueOf(n).length();
		int r;
		double sum=0;
		while(n>0) {
			
			r = n%10;
			
			sum= sum+(Math.pow((double)r, (double)len));
			
			n = n/10;
			
		}
		
		
		System.out.println("Sum : "+(int)sum);*/
		
			//Question	//duplicate string with Number of occurane in the line******************************
			
			
			/*String va = "Great Great Great purna responsi purna Great purna";
			String[] str = va.split(" ");
			//char str[] = s.toCharArray();
			int count;
			for(int i=0;i<str.length;i++) {
				 str = va.split(" ");
				count=1;
				for(int j=i+1;j<str.length;j++) {
					//System.out.println("Word name i : "+str[i]);
					//System.out.println("Word name j : "+str[j]);
					if(str[i].equals(str[j]) && i!=j) {
						count++;
						//str[j]="0";
					}
				}
				
				if(count>1 && !str[i].trim().isEmpty()) {
					System.out.println("********************************************************************");
					System.out.println("Word name : "+str[i]);
					System.out.println("Total occurance : "+count);
					System.out.println("********************************************************************");
					va=va.replace(str[i], "");
				//	System.out.println("Post replace"+va);
				}
				
			}*/
			
			System.out.println("********************************************************************");
			
			/*//Duplicate Strings in a Line******************************
					String[] str = "Great responsi purna Great".split(" ");
					//char str[] = s.toCharArray();
					int count;
					
					for(int i=0;i<str.length;i++) {
						
						count=1;
						for(int j=i+1;j<str.length;j++) {
							if(str[i].equals(str[j]) && !str[i].trim().isEmpty()) {
								count++;
								str[j]="0";
							}
						}
						
						if(count>1 && !str[i].trim().isEmpty()) {
							System.out.println(str[i]);
						}
						
					}
					*/
					
					
			
			//Duplicate character in a string******************************
				/*String s = "Great responsi";
				char str[] = s.toCharArray();
				int count;
				
				for(int i=0;i<str.length;i++) {
					
					count=1;
					for(int j=i+1;j<str.length;j++) {
						if(str[i]==str[j] && str[i]!=' ') {
							count++;
							str[j]='0';
						}
					}
					
					if(count>1 && str[i]!=' ') {
						System.out.println(str[i]);
					}
					
				}*/
		
		
		
	}

}
