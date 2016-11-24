
public class StringSeq2 {

	public static void main(String []args){
		System.out.println(sequence("abcdf"));
	}
	
	public static StringBuffer sequence(String str){
		
		char c = str.charAt(0);
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		int count = 1;
		for(int i = 1 ; i < str.length() ; i++){
			if(c == str.charAt(i)){
				count ++;
			}
			else{
				sb.append(c);
				sb.append(count);
				count = 1;
				c = str.charAt(i);
			}
		}
		sb.append(c);
		sb.append(count);
		int length = sb.length();
		int Originallength = str.length();
		if(length > Originallength){
			sb1.append(str);
			return sb1;
		}
		return sb;
	}
	
	
}
