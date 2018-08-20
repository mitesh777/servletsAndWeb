
import java.math.BigDecimal;
/*
 * 
 * author mitesh
 * This class can be used to split a decimal value and
 * decimal whole part and decimal part separately
 * 
 * 
 */
public class DecimalSplitter {
	public static void main(String[] args) {
		double doubleNum = 123.45;
		int wholePart = (int)123.45;
		double decimalPart = doubleNum - (double)wholePart;
		System.out.println(decimalPart);
		String strDouble = String.format("%.2f", decimalPart);
		System.out.println(strDouble);
		
		//------------------or--------------------------------
		
		System.out.printf("decimal part : %.3f \n", decimalPart);
		
		BigDecimal num = new BigDecimal(doubleNum);
		BigDecimal wholeNum = new BigDecimal((int)doubleNum);
		BigDecimal decimalNum = num.subtract(wholeNum);
		System.out.println(doubleNum);
		System.out.println(wholeNum);
		System.out.println(decimalNum);
	}
}
