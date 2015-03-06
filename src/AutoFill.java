import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class AutoFill {
	
	//Fills text boxes using a tab to move from user name text box to the password text box
	public static void FillTextBoxes(int delay, String username, String password) throws AWTException {
		int i = 0;
		Robot robot = new Robot();
		while(username.length() > i){
			TypeChar(username.charAt(i));
			i++;
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		i = 0;
		while(password.length() > i){
			TypeChar(password.charAt(i));
			i++;
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(delay);
		return;
	}
	
	//Types out the passed string
	public static void TypeString(int delay, String S) throws AWTException{
		int i = 0;
		Robot robot = new Robot();
		while(S.length() > i){
			TypeChar(S.charAt(i));
			i++;
		}
		robot.delay(delay);
		return;
	}
	
	//Types out the individual characters 
	public static void TypeChar(char c) throws AWTException{
		Robot robot = new Robot();
		if (c == " ".charAt(0)){
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
		}
		if(c == "0".charAt(0)){
			robot.keyPress(KeyEvent.VK_0);
			robot.keyRelease(KeyEvent.VK_0);
		}
		if(c == "1".charAt(0)){
			robot.keyPress(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_1);
		}
		if(c == "2".charAt(0)){
			robot.keyPress(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_2);
		}
		if(c == "3".charAt(0)){
			robot.keyPress(KeyEvent.VK_3);
			robot.keyRelease(KeyEvent.VK_3);
		}
		if(c == "4".charAt(0)){
			robot.keyPress(KeyEvent.VK_4);
			robot.keyRelease(KeyEvent.VK_4);
		}
		if(c == "5".charAt(0)){
			robot.keyPress(KeyEvent.VK_5);
			robot.keyRelease(KeyEvent.VK_5);
		}
		if(c == "6".charAt(0)){
			robot.keyPress(KeyEvent.VK_6);
			robot.keyRelease(KeyEvent.VK_6);
		}
		if(c == "7".charAt(0)){
			robot.keyPress(KeyEvent.VK_7);
			robot.keyRelease(KeyEvent.VK_7);
		}
		if(c == "8".charAt(0)){
			robot.keyPress(KeyEvent.VK_8);
			robot.keyRelease(KeyEvent.VK_8);
		}
		if(c == "9".charAt(0)){
			robot.keyPress(KeyEvent.VK_9);
			robot.keyRelease(KeyEvent.VK_9);
		}
		if(c == "`".charAt(0)){
			robot.keyPress(KeyEvent.VK_BACK_QUOTE);
			robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
		}
		if(c == "~".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_BACK_QUOTE);
			robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "!".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_1);
		}
		if(c == "@".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_2);
		}
		if(c == "#".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_3);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_3);
		}
		if(c == "$".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_4);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_4);
		}
		if(c == "%".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_5);
			robot.keyRelease(KeyEvent.VK_5);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "^".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_6);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_6);
		}
		if(c == "&".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_7);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_7);
		}
		if(c == "*".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_8);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_8);
		}
		if(c == "(".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_9);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_9);
		}
		if(c == ")".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_0);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_0);
		}
		if(c == "_".charAt(0)){
			robot.keyPress(KeyEvent.VK_UNDERSCORE);
			robot.keyRelease(KeyEvent.VK_UNDERSCORE);
		}
		if(c == "-".charAt(0)){
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
		}
		if(c == "=".charAt(0)){
			robot.keyPress(KeyEvent.VK_EQUALS);
			robot.keyRelease(KeyEvent.VK_EQUALS);
		}
		if(c == "+".charAt(0)){
			robot.keyPress(KeyEvent.VK_PLUS);
			robot.keyRelease(KeyEvent.VK_PLUS);
		}
		if(c == "[".charAt(0)){
			robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
			robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
		}
		if(c == "{".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
			robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "]".charAt(0)){
			robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
			robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
		}
		if(c == "}".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
			robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "\\".charAt(0)){
			robot.keyPress(KeyEvent.VK_BACK_SLASH);
			robot.keyRelease(KeyEvent.VK_BACK_SLASH);
		}
		if(c == "|".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_BACK_SLASH);
			robot.keyRelease(KeyEvent.VK_BACK_SLASH);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == ";".charAt(0)){
			robot.keyPress(KeyEvent.VK_SEMICOLON);
			robot.keyRelease(KeyEvent.VK_SEMICOLON);
		}
		if(c == ":".charAt(0)){
			robot.keyPress(KeyEvent.VK_COLON);
			robot.keyRelease(KeyEvent.VK_COLON);
		}
		if(c == "'".charAt(0)){
			robot.keyPress(KeyEvent.VK_QUOTE);
			robot.keyRelease(KeyEvent.VK_QUOTE);
		}
		if(c == "\"".charAt(0)){
			robot.keyPress(KeyEvent.VK_QUOTEDBL);
			robot.keyRelease(KeyEvent.VK_QUOTEDBL);
		}
		if(c == "/".charAt(0)){
			robot.keyPress(KeyEvent.VK_SLASH);
			robot.keyRelease(KeyEvent.VK_SLASH);
		}
		if(c == "?".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_SLASH);
			robot.keyRelease(KeyEvent.VK_SLASH);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == ".".charAt(0)){
			robot.keyPress(KeyEvent.VK_PERIOD);
			robot.keyRelease(KeyEvent.VK_PERIOD);
		}
		if(c == ">".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_PERIOD);
			robot.keyRelease(KeyEvent.VK_PERIOD);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "<".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_COMMA);
			robot.keyRelease(KeyEvent.VK_COMMA);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == ",".charAt(0)){
			robot.keyPress(KeyEvent.VK_COMMA);
			robot.keyRelease(KeyEvent.VK_COMMA);
		}
		if(c == "A".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "B".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "C".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "D".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "E".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "F".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_F);
			robot.keyRelease(KeyEvent.VK_F);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "G".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_G);
			robot.keyRelease(KeyEvent.VK_G);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "H".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_H);
			robot.keyRelease(KeyEvent.VK_H);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "I".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "J".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "K".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_K);
			robot.keyRelease(KeyEvent.VK_K);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "L".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_L);
			robot.keyRelease(KeyEvent.VK_L);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "M".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_M);
			robot.keyRelease(KeyEvent.VK_M);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "N".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "O".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyRelease(KeyEvent.VK_O);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "P".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_P);
			robot.keyRelease(KeyEvent.VK_P);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "Q".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_Q);
			robot.keyRelease(KeyEvent.VK_Q);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "R".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "S".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "T".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "U".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_U);
			robot.keyRelease(KeyEvent.VK_U);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "V".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "W".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "X".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_X);
			robot.keyRelease(KeyEvent.VK_X);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "Y".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_Y);
			robot.keyRelease(KeyEvent.VK_Y);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "Z".charAt(0)){
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_Z);
			robot.keyRelease(KeyEvent.VK_Z);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		if(c == "a".charAt(0)){
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
		}
		if(c == "b".charAt(0)){
			robot.keyPress(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_B);
		}
		if(c == "c".charAt(0)){
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_C);
		}
		if(c == "d".charAt(0)){
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);
		}
		if(c == "e".charAt(0)){
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
		}
		if(c == "f".charAt(0)){
			robot.keyPress(KeyEvent.VK_F);
			robot.keyRelease(KeyEvent.VK_F);
		}
		if(c == "g".charAt(0)){
			robot.keyPress(KeyEvent.VK_G);
			robot.keyRelease(KeyEvent.VK_G);
		}
		if(c == "h".charAt(0)){
			robot.keyPress(KeyEvent.VK_H);
			robot.keyRelease(KeyEvent.VK_H);
		}
		if(c == "i".charAt(0)){
			robot.keyPress(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_I);
		}
		if(c == "j".charAt(0)){
			robot.keyPress(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_J);
		}
		if(c == "k".charAt(0)){
			robot.keyPress(KeyEvent.VK_K);
			robot.keyRelease(KeyEvent.VK_K);
		}
		if(c == "l".charAt(0)){
			robot.keyPress(KeyEvent.VK_L);
			robot.keyRelease(KeyEvent.VK_L);
		}
		if(c == "m".charAt(0)){
			robot.keyPress(KeyEvent.VK_M);
			robot.keyRelease(KeyEvent.VK_M);
		}
		if(c == "n".charAt(0)){
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
		}
		if(c == "o".charAt(0)){
			robot.keyPress(KeyEvent.VK_O);
			robot.keyRelease(KeyEvent.VK_O);
		}
		if(c == "p".charAt(0)){
			robot.keyPress(KeyEvent.VK_P);
			robot.keyRelease(KeyEvent.VK_P);
		}
		if(c == "q".charAt(0)){
			robot.keyPress(KeyEvent.VK_Q);
			robot.keyRelease(KeyEvent.VK_Q);
		}
		if(c == "r".charAt(0)){
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
		}
		if(c == "s".charAt(0)){
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
		}
		if(c == "t".charAt(0)){
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_T);
		}
		if(c == "u".charAt(0)){
			robot.keyPress(KeyEvent.VK_U);
			robot.keyRelease(KeyEvent.VK_U);
		}
		if(c == "v".charAt(0)){
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
		}
		if(c == "w".charAt(0)){
			robot.keyPress(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_W);
		}
		if(c == "x".charAt(0)){
			robot.keyPress(KeyEvent.VK_X);
			robot.keyRelease(KeyEvent.VK_X);
		}
		if(c == "y".charAt(0)){
			robot.keyPress(KeyEvent.VK_Y);
			robot.keyRelease(KeyEvent.VK_Y);
		}
		if(c == "z".charAt(0)) {
			robot.keyPress(KeyEvent.VK_Z);
			robot.keyRelease(KeyEvent.VK_Z);
		}
	}

}
