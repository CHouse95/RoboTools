import java.awt.AWTException;


public class Test {

	public static void main(String[] args) throws AWTException {
		
		String un = "0";
		int i =0;
		
		while(i<100){
			
			System.out.println(un);
			//un = StringGenerator.GetNewString_all(un);
			//un = StringGenerator.GetNewString_some(un);
			un = StringGenerator.GetNewString_none(un);
			//un = StringGenerator.GetNewString_lowernum(un);
			//un = StringGenerator.GetNewString_lower(un);
			
			i++;
			
		}
		
	}
	
}
