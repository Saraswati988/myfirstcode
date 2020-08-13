
public class StrDemo {


	String myReplace(String str,char oldChar , char newChar)
	{
	char[] arr=str.toCharArray();
	for(int i=0;i<str.length(); i++){
	if(arr[i]==oldChar)
	arr[i]=newChar;
	break;
	}
	
	String manStr=new String(arr);
	return manStr;
	}

	public static void main(String[] args) {

		StrDemo scm=new StrDemo();
	String data=scm.myReplace("Hello", 'H', 'K');

	System.out.println(data);

	}

}
