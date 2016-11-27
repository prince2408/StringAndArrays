
public class RemoveSpaces {

	public static void main(String []args){
		System.out.println(removeSpaces("s  bh id kk"));
	}
	
	public static String removeSpaces(String str){
		char []c = str.toCharArray();
		int count = 0;
		int newLength = str.length();
		for(int i = 0; i<c.length ; i++){
			if(c[i] == ' '){
				count ++;
			}
			
		}
		newLength = newLength +count*2;
		char c2[] = new char[newLength];
		//c2[newLength] = '\0';
		for(int i = newLength-1,j=str.length()-1 ; i>=0 ; i-- , j--){
			if(c[j] == ' '){
				c2 [i] = '0';
				c2 [--i] = '2';
				c2[--i] = '%';
			}
			else{
			c2[i] = c[j];
			}
		}
		String str4 = new String(c2);
		return str4;
	}
}
