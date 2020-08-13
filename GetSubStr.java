
public class GetSubStr {
	String data;
	int index;
	
	
	
	String mySubStr(String data,int index){
		char[] gtd = data.toCharArray();
		for(int i=0; i<data.length(); i++) {
			if(i==index) 
				
			break;
			
		}
		
	return data;
	}
	public static void main(String[] args) {
		GetSubStr getSubStr= new GetSubStr();
		 String val = getSubStr.mySubStr("hello",3);
		 System.out.println(val);
}
}


	
	

