
public class P8 {

	public static void main(String[] args) {
//		char a = 'a';
//		System.out.println((int)a);
		String b = "abc";
//		System.out.println(b.charAt(0));
		
		System.out.println(atoi("9887654433214140"));
	}
	
	public static int atoi(String str){
		char pointLeft = 0;
		int result = 0;
		int sign = 0;
		
		str = str.trim();
		if((int)str.charAt(0) == 45){
			sign = -1;
			str = str.substring(1, str.length());
		}
		else{
			if((int)str.charAt(0) == 43){
				sign = 1;
				str = str.substring(1, str.length());
			}
		}
		
//>= 48 && (int)str.charAt(i) <= 57
		for (int i = 0, result; i < str.length(); i++){
			
			int temp = (int)str.charAt(i) - (int)'0';
			if(temp < 10 && temp > -1){
				result = temp + 10 * result;
			}
			else{
				break;
			}
				
		}
		
		if(sign == -1){
			result = result*sign;
		}
		return result;
	}
}
