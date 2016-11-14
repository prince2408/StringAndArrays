
public class UniqueCharacter {

	public static void main(String []args){
		String str = "abhis";
		//mySolution(str);
		System.out.println(bookSolution(str));
			
	}
	
	
	public static boolean bookSolution(String str){
		if(str.length()>256){
			return false;
		}
		boolean []flag = new boolean[256];
		for(int i =0 ; i < str.length() ; i++){
			
			int val = str.charAt(i);
			if(flag[val]){
				return false;
			}
			
			flag [val] = true;
		}
		return true;
	}
	
	public static void mySolution(String str){
		boolean flag = false;
		char []c = str.toCharArray();
		
		for(int i =1;i<c.length;i++){
			for (int j=i+1; j<c.length ; j++){
				if(c[i] == c[j]){
					System.out.println("not unique");
					flag = false;
					break;
				}
				else{
					flag = true;
				}
			}
		}
	
	}
}
