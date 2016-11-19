/**
 * Given two String , write a method to decide 
 * if one is the permutation of another.
 */
public class StringPermutation {

	
	public static boolean mySolution(String str1 , String str2){
		if(str1.length() > str2.length() 
				|| str2.length() > str1.length()){
			return false;
		}
	
		for (int i = 0 ; i < str1.length() ; i ++){
			boolean flag = false;
				int char1 = str1.charAt(i);
				for(int j = 0 ;j<str2.length() ; j++){
					
					int char2 = str2.charAt(j);
					if(char1 == char2 ){
						flag = true;
					}
					
				}
				if(!flag){
					return false;
				}
		}
		return true;
	}
	
	public static boolean bookSolution(String str1 , String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		// takes array of integers.
		int []letters = new int[256];
		
		//convert the first string to character array.
		char [] s_arr = str1.toCharArray();
		
		//store the count of all the alphabets into an integer array.
		for(char c : s_arr){
			System.out.println("letters : "+letters[c]+" c::: "+c);
			letters[c]++;
		}
		
		for(int i = 0 ;i <str2.length() ; i++){
			int c = (int)str2.charAt(i);
			if(--letters[c] < 0){
				System.out.println("2nd letters : "+letters[c]);
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String []args){
		//System.out.println(mySolution("abhi","ihha"));
		
		System.out.println(bookSolution("ahhi", "hahi"));
	}
}
