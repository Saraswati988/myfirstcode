
public class Number {
	
	 boolean isNum(String data)
	 {
		 int ctr=0;
		 char[] arr=data.toCharArray();
		 for(int i=0; i<data.length(); i++) {
			
			
					if(arr[i] >= '0' &&  arr[i] <='9') 
					
					ctr++;
				} 
		 if(ctr>0)
			 return true;
		 else
			 return false;
		
	 }

	public static void main(String[] args) {
		Number no=new Number();
		 boolean str = no.isNum("shueyt");
		 System.out.println(str);
	

	}

}
