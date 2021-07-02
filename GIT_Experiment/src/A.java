
public class A {
	public String dis() {
		System.out.println("Frome A");
		String v = "Frome A";
		return v;
	}
	
	
	/*String v = "PURNA";
	String result = "";
	
	char[] ch = v.toCharArray();
	
	
	
	for(int i=ch.length-1;i>=0;i--) {
		result = result+ch[i];
	}
	for(int i=v.length()-1;i>=0;i--) {
		result = result+v.charAt(i);
	}
	System.out.println(result);*/
	
	
	/*String[] v = "This is Testing".split(" ");
	String temp = "";
	
	
	for(String x:v) {
		
		
		char[] cha = x.trim().toCharArray();
		
		
		
		for(int i=cha.length-1;i>=0;i--){

			temp = temp+cha[i];


			}
		temp=temp+" ";
		
	}
	System.out.println(temp.trim());*/
	
	
	/*//oP==0,1,1,2,3,5,8
	
	int length = 7;
	
	int[] ar = new int[length];
	
	int tmp = 0;
	ar[0]=tmp;
	int a =1;
	for(int i=1;i<length;i++) {
		
		ar[i]=tmp+a;
		tmp=ar[i];
		a = ar[i-1];
		
		
		
	}
	
	System.out.println(ar);
	for(int j:ar) {
		System.out.print(j+",");
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*String str1="AABBABBBSBSABABEABCABCAB";
	 String str2 = "ABC";
	 
	 System.out.println(str1.substring(3,6));
	 
	 for(int i=0;i<str1.length();i++) {
		 
		 int j=i+3;
		 
		 if(str1.substring(i,3).contains(str2)) {
			 
			 
		 }
		 
		 
		 i=j;
	 }*/
	 
	 
	 
	 
	 
	 /*
	 int a = 115;
	 int b=85;
	 int c=50;
	 int i = 0;
	 boolean flag = true;
	 while(flag) {
		 a--;b--;c--;i++;
		 if(a==0 || b==0|| c==0) {
			 break;
		 }
	 }
			 
	System.out.println(i);*/
	 
	 
	 /*
	 int arr[] = {1, 4, 0, 0, 3, 10, 5};
	 int l = arr.length;
	 int sum = 7;
	 int in1 = 0;
	 int in2=0;
	 int temp=0;
	L: for(int i=0;i<l;i++) {
		 temp=arr[i];
		 for(int j =i+1;j<l;j++) {
			
			 temp=temp+arr[j];

			 
			 if(sum==temp && i!=j)
			 {
				 in1 = i;
				 in2 = j;
				 break L;
			 }
			 
		 }
		 
		 
		 
		 
	 }
	 System.out.println(in1 +" to "+in2); */
	
	
	
	
	
	
}
