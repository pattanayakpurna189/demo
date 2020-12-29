import java.util.concurrent.TimeUnit;



public class Test2 {

	public static void main(String[] args) throws Exception {
		
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
				String s = "Great responsi";
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
					
				}
				
		}

}
