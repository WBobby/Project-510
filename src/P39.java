import java.lang.Math;

public class P39 {
	public static int sign = -1;
    public static int result = 0;
    public static long dividend = 22;
    public static long divisor = 3;
    public static int shiftcount = 0;

	public static void main(String[] args){
//		int a = 17;
//		int b = 6;
		
//		System.out.println(13 >> 1);
//		System.out.println(13 >> 2);
		System.out.println(22 >> 2);
		System.out.println(Math.pow(2, 2));
		
		if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor <0)){
            sign = 1;
        }
		
		while(dividend > divisor){
			shiftcount = divide(dividend, divisor);
			dividend = dividend >> shiftcount;
			System.out.println("dividend: " + dividend);
			result = (int)Math.pow(2, shiftcount);
		}
//		System.out.println(divide(dividend, divisor));
		System.out.println(result);

	}
	

	
	public static int divide(long dividend, long divisor) {
//		int temp = divisor;
		int temp = 0;
		
        while(dividend > divisor){
        	temp += 1;
            divisor = (divisor << temp);
        }
        dividend = dividend >> temp;
        
        
        return temp;
    }
}
