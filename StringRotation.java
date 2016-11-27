
public class StringRotation {

	public static void main(String []args){
		System.out.println(rotation("abhishek","ekabihsh"));
	}
	
	public static boolean rotation(String str1 , String str2){
		if(str1.length() != str2.length() || str1.length() <1){
			return false;
		}
		
		String str3 = str1 + str1;
		if(str3.contains(str2)){
			return true;
		}
		
		return false;
	}
}
