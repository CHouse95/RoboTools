import java.awt.AWTException;



public class main {
 public static void main(String [] args) throws AWTException {
	int i = 0;
	AutoFill.robo(5000);
	AutoFill.Spam("   k   k");
	while(i<1){
	AutoFill.Spam(Integer.toString(i));
	i++;
	System.out.println(i);
	}
	AutoFill.Spam(i + "Messages Sent");
	System.out.println("End");
 }

}
