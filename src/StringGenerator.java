public class StringGenerator {
	
	static int i = 0;
	
	//Gets new  password using all characters
	public static String GetNewString_all(String oldPassword) {
		int j = 0, k = 0;
		String zero = "0";
		i = 0;
		while(k < oldPassword.length()){
			if(oldPassword.charAt(k) != "z".charAt(0)) break;
			zero = zero + "0";
			if(oldPassword.charAt(k) == "z".charAt(0) && k == oldPassword.length() - 1) return zero;
			k++;
		}
		StringBuilder newPassword = new StringBuilder(oldPassword);
		while(i == 0){
			newPassword.setCharAt(j, GetNextChar_all(newPassword.charAt(j)));
			j++;
		}
		return newPassword.toString();
	}
	
	//Gets new password using popular special characters
	public static String GetNewString_some(String oldPassword) {
		int j = 0, k = 0;
		String zero = "0";
		i = 0;
		while(k < oldPassword.length()){
			if(oldPassword.charAt(k) != "z".charAt(0)) break;
			zero = zero + "0";
			if(oldPassword.charAt(k) == "z".charAt(0) && k == oldPassword.length() - 1) return zero;
			k++;
		}
		StringBuilder newPassword = new StringBuilder(oldPassword);
		while(i == 0){
			newPassword.setCharAt(j, GetNextChar_some(newPassword.charAt(j)));
			j++;
		}
		return newPassword.toString();
	}
	
	//Gets new password using no special characters
	public static String GetNewString_none(String oldPassword) {
		int j = 0, k = 0;
		String zero = "0";
		i = 0;
		while(k < oldPassword.length()){
			if(oldPassword.charAt(k) != "z".charAt(0)) break;
				zero = zero + "0";
				if(oldPassword.charAt(k) == "z".charAt(0) && k == oldPassword.length() - 1) return zero;
				k++;
			}
			StringBuilder newPassword = new StringBuilder(oldPassword);
			while(i == 0){
				newPassword.setCharAt(j, GetNextChar_lower(newPassword.charAt(j)));
				j++;
			}
		return newPassword.toString();
		}
	
	//Gets new password using only lower case letters and numbers
	public static String GetNewString_lowernum(String oldPassword) {
		int j = 0, k = 0;
		String zero = "0";
		i = 0;
		while(k < oldPassword.length()){
			if(oldPassword.charAt(k) != "z".charAt(0)) break;
			zero = zero + "0";
			if(oldPassword.charAt(k) == "z".charAt(0) && k == oldPassword.length() - 1) return zero;
				k++;
			}
			StringBuilder newPassword = new StringBuilder(oldPassword);
			while(i == 0){
				newPassword.setCharAt(j, GetNextChar_lowernum(newPassword.charAt(j)));
				j++;
			}
		return newPassword.toString();
	}
		
	//Gets new password using only lower case letter
	public static String GetNewString_lower(String oldPassword) {
		int j = 0, k = 0;
		String a = "a";
		i = 0;
		while(k < oldPassword.length()){
			if(oldPassword.charAt(k) != "z".charAt(0)) break;
			a = a + "a";
			if(oldPassword.charAt(k) == "z".charAt(0) && k == oldPassword.length() - 1) return a;
				k++;
			}
			StringBuilder newPassword = new StringBuilder(oldPassword);
			while(i == 0){
				newPassword.setCharAt(j, GetNextChar_lower(newPassword.charAt(j)));
				j++;
			}
		return newPassword.toString();
	}
		
	//Gets new char using all characters
	public static char GetNextChar_all(char oldChar){
		char newChar = 0;
		if(oldChar == "0".charAt(0)){
			newChar = "1".charAt(0);
			i = 1;
		}
		if(oldChar == "1".charAt(0)){
			newChar = "2".charAt(0);
			i = 1;
		}
		if(oldChar == "2".charAt(0)){
			newChar = "3".charAt(0);
			i = 1;
		}
		if(oldChar == "3".charAt(0)){
			newChar = "4".charAt(0);
			i = 1;
		}
		if(oldChar == "4".charAt(0)){
			newChar = "5".charAt(0);
			i = 1;
		}
		if(oldChar == "5".charAt(0)){
			newChar = "6".charAt(0);
			i = 1;
		}
		if(oldChar == "6".charAt(0)){
			newChar = "7".charAt(0);
			i = 1;
		}
		if(oldChar == "7".charAt(0)){
			newChar = "8".charAt(0);
			i = 1;
		}
		if(oldChar == "8".charAt(0)){
			newChar = "9".charAt(0);
			i = 1;
		}
		if(oldChar == "9".charAt(0)){
			newChar = "`".charAt(0);
			i = 1;
		}
		if(oldChar == "`".charAt(0)){
			newChar = "~".charAt(0);
			i = 1;
		}
		if(oldChar == "~".charAt(0)){
			newChar = "!".charAt(0);
			i = 1;
		}
		if(oldChar == "!".charAt(0)){
			newChar = "@".charAt(0);
			i = 1;
		}
		if(oldChar == "@".charAt(0)){
			newChar = "#".charAt(0);
			i = 1;
		}
		if(oldChar == "#".charAt(0)){
			newChar = "$".charAt(0);
			i = 1;
		}
		if(oldChar == "$".charAt(0)){
			newChar = "%".charAt(0);
			i = 1;
		}
		if(oldChar == "%".charAt(0)){
			newChar = "^".charAt(0);
			i = 1;
		}
		if(oldChar == "^".charAt(0)){
			newChar = "&".charAt(0);
			i = 1;
		}
		if(oldChar == "&".charAt(0)){
			newChar = "*".charAt(0);
			i = 1;
		}
		if(oldChar == "*".charAt(0)){
			newChar = "(".charAt(0);
			i = 1;
		}
		if(oldChar == "(".charAt(0)){
			newChar = ")".charAt(0);
			i = 1;
		}
		if(oldChar == ")".charAt(0)){
			newChar = "_".charAt(0);
			i = 1;
		}
		if(oldChar == "_".charAt(0)){
			newChar = "-".charAt(0);
			i = 1;
		}
		if(oldChar == "-".charAt(0)){
			newChar = "=".charAt(0);
			i = 1;
		}
		if(oldChar == "=".charAt(0)){
			newChar = "+".charAt(0);
			i = 1;
		}
		if(oldChar == "+".charAt(0)){
			newChar = "[".charAt(0);
			i = 1;
		}
		if(oldChar == "[".charAt(0)){
			newChar = "{".charAt(0);
			i = 1;
		}
		if(oldChar == "{".charAt(0)){
			newChar = "]".charAt(0);
			i = 1;
		}
		if(oldChar == "]".charAt(0)){
			newChar = "}".charAt(0);
			i = 1;
		}
		if(oldChar == "}".charAt(0)){
			newChar = "\\".charAt(0);
			i = 1;
		}
		if(oldChar == "\\".charAt(0)){
			newChar = "|".charAt(0);
			i = 1;
		}
		if(oldChar == "|".charAt(0)){
			newChar = ";".charAt(0);
			i = 1;
		}
		if(oldChar == ";".charAt(0)){
			newChar = ":".charAt(0);
			i = 1;
		}
		if(oldChar == ":".charAt(0)){
			newChar = "'".charAt(0);
			i = 1;
		}
		if(oldChar == "'".charAt(0)){
			newChar = "\"".charAt(0);
			i = 1;
		}
		if(oldChar == "\"".charAt(0)){
			newChar = "/".charAt(0);
			i = 1;
		}
		if(oldChar == "/".charAt(0)){
			newChar = "?".charAt(0);
			i = 1;
		}
		if(oldChar == "?".charAt(0)){
			newChar = ".".charAt(0);
			i = 1;
		}
		if(oldChar == ".".charAt(0)){
			newChar = ">".charAt(0);
			i = 1;
		}
		if(oldChar == ">".charAt(0)){
			newChar = "<".charAt(0);
			i = 1;
		}
		if(oldChar == "<".charAt(0)){
			newChar = ",".charAt(0);
			i = 1;
		}
		if(oldChar == ",".charAt(0)){
			newChar = "A".charAt(0);
			i = 1;
		}
		if(oldChar == "A".charAt(0)){
			newChar = "B".charAt(0);
			i = 1;
		}
		if(oldChar == "B".charAt(0)){
			newChar = "C".charAt(0);
			i = 1;
		}
		if(oldChar == "C".charAt(0)){
			newChar = "D".charAt(0);
			i = 1;
		}
		if(oldChar == "D".charAt(0)){
			newChar = "E".charAt(0);
			i = 1;
		}
		if(oldChar == "E".charAt(0)){
			newChar = "F".charAt(0);
			i = 1;
		}
		if(oldChar == "F".charAt(0)){
			newChar = "G".charAt(0);
			i = 1;
		}
		if(oldChar == "G".charAt(0)){
			newChar = "H".charAt(0);
			i = 1;
		}
		if(oldChar == "H".charAt(0)){
			newChar = "I".charAt(0);
			i = 1;
		}
		if(oldChar == "I".charAt(0)){
			newChar = "J".charAt(0);
			i = 1;
		}
		if(oldChar == "J".charAt(0)){
			newChar = "K".charAt(0);
			i = 1;
		}
		if(oldChar == "K".charAt(0)){
			newChar = "L".charAt(0);
			i = 1;
		}
		if(oldChar == "L".charAt(0)){
			newChar = "M".charAt(0);
			i = 1;
		}
		if(oldChar == "M".charAt(0)){
			newChar = "N".charAt(0);
			i = 1;
		}
		if(oldChar == "N".charAt(0)){
			newChar = "O".charAt(0);
			i = 1;
		}
		if(oldChar == "O".charAt(0)){
			newChar = "P".charAt(0);
			i = 1;
		}
		if(oldChar == "P".charAt(0)){
			newChar = "Q".charAt(0);
			i = 1;
		}
		if(oldChar == "Q".charAt(0)){
			newChar = "R".charAt(0);
			i = 1;
		}
		if(oldChar == "R".charAt(0)){
			newChar = "S".charAt(0);
			i = 1;
		}
		if(oldChar == "S".charAt(0)){
			newChar = "T".charAt(0);
			i = 1;
		}
		if(oldChar == "T".charAt(0)){
			newChar = "U".charAt(0);
			i = 1;
		}
		if(oldChar == "U".charAt(0)){
			newChar = "V".charAt(0);
			i = 1;
		}
		if(oldChar == "V".charAt(0)){
			newChar = "W".charAt(0);
			i = 1;
		}
		if(oldChar == "W".charAt(0)){
			newChar = "X".charAt(0);
			i = 1;
		}
		if(oldChar == "X".charAt(0)){
			newChar = "Y".charAt(0);
			i = 1;
		}
		if(oldChar == "Y".charAt(0)){
			newChar = "Z".charAt(0);
			i = 1;
		}
		if(oldChar == "Z".charAt(0)){
			newChar = "a".charAt(0);
			i = 1;
		}
		if(oldChar == "a".charAt(0)){
			newChar = "b".charAt(0);
			i = 1;
		}
		if(oldChar == "b".charAt(0)){
			newChar = "c".charAt(0);
			i = 1;
		}
		if(oldChar == "c".charAt(0)){
			newChar = "d".charAt(0);
			i = 1;
		}
		if(oldChar == "d".charAt(0)){
			newChar = "e".charAt(0);
			i = 1;
		}
		if(oldChar == "e".charAt(0)){
			newChar = "f".charAt(0);
			i = 1;
		}
		if(oldChar == "f".charAt(0)){
			newChar = "g".charAt(0);
			i = 1;
		}
		if(oldChar == "g".charAt(0)){
			newChar = "h".charAt(0);
			i = 1;
		}
		if(oldChar == "h".charAt(0)){
			newChar = "i".charAt(0);
			i = 1;
		}
		if(oldChar == "i".charAt(0)){
			newChar = "j".charAt(0);
			i = 1;
		}
		if(oldChar == "j".charAt(0)){
			newChar = "k".charAt(0);
			i = 1;
		}
		if(oldChar == "k".charAt(0)){
			newChar = "l".charAt(0);
			i = 1;
		}
		if(oldChar == "l".charAt(0)){
			newChar = "m".charAt(0);
			i = 1;
		}
		if(oldChar == "m".charAt(0)){
			newChar = "n".charAt(0);
			i = 1;
		}
		if(oldChar == "n".charAt(0)){
			newChar = "o".charAt(0);
			i = 1;
		}
		if(oldChar == "o".charAt(0)){
			newChar = "p".charAt(0);
			i = 1;
		}
		if(oldChar == "p".charAt(0)){
			newChar = "q".charAt(0);
			i = 1;
		}
		if(oldChar == "q".charAt(0)){
			newChar = "r".charAt(0);
			i = 1;
		}
		if(oldChar == "r".charAt(0)){
			newChar = "s".charAt(0);
			i = 1;
		}
		if(oldChar == "s".charAt(0)){
			newChar = "t".charAt(0);
			i = 1;
		}
		if(oldChar == "t".charAt(0)){
			newChar = "u".charAt(0);
			i = 1;
		}
		if(oldChar == "u".charAt(0)){
			newChar = "v".charAt(0);
			i = 1;
		}
		if(oldChar == "v".charAt(0)){
			newChar = "w".charAt(0);
			i = 1;
		}
		if(oldChar == "w".charAt(0)){
			newChar = "x".charAt(0);
			i = 1;
		}
		if(oldChar == "x".charAt(0)){
			newChar = "y".charAt(0);
			i = 1;
		}
		if(oldChar == "y".charAt(0)){
			newChar = "z".charAt(0);
			i = 1;
		}
		if(oldChar == "z".charAt(0)) {
			newChar = "0".charAt(0);
			i = 0;
		}
		return newChar;
	}
	
	//Gets new char using some special characters
	public static char GetNextChar_some(char oldChar){
		char newChar = 0;
		if(oldChar == "0".charAt(0)){
			newChar = "1".charAt(0);
			i = 1;
		}
		if(oldChar == "1".charAt(0)){
			newChar = "2".charAt(0);
			i = 1;
		}
		if(oldChar == "2".charAt(0)){
			newChar = "3".charAt(0);
			i = 1;
		}
		if(oldChar == "3".charAt(0)){
			newChar = "4".charAt(0);
			i = 1;
		}
		if(oldChar == "4".charAt(0)){
			newChar = "5".charAt(0);
			i = 1;
		}
		if(oldChar == "5".charAt(0)){
			newChar = "6".charAt(0);
			i = 1;
		}
		if(oldChar == "6".charAt(0)){
			newChar = "7".charAt(0);
			i = 1;
		}
		if(oldChar == "7".charAt(0)){
			newChar = "8".charAt(0);
			i = 1;
		}
		if(oldChar == "8".charAt(0)){
			newChar = "9".charAt(0);
			i = 1;
		}
		if(oldChar == "9".charAt(0)){
			newChar = "!".charAt(0);
			i = 1;
		}
		if(oldChar == "!".charAt(0)){
			newChar = "$".charAt(0);
			i = 1;
		}
		if(oldChar == "$".charAt(0)){
			newChar = "?".charAt(0);
			i = 1;
		}
		if(oldChar == "?".charAt(0)){
			newChar = "A".charAt(0);
			i = 1;
		}
		if(oldChar == "A".charAt(0)){
			newChar = "B".charAt(0);
			i = 1;
		}
		if(oldChar == "B".charAt(0)){
			newChar = "C".charAt(0);
			i = 1;
		}
		if(oldChar == "C".charAt(0)){
			newChar = "D".charAt(0);
			i = 1;
		}
		if(oldChar == "D".charAt(0)){
			newChar = "E".charAt(0);
			i = 1;
		}
		if(oldChar == "E".charAt(0)){
			newChar = "F".charAt(0);
			i = 1;
		}
		if(oldChar == "F".charAt(0)){
			newChar = "G".charAt(0);
			i = 1;
		}
		if(oldChar == "G".charAt(0)){
			newChar = "H".charAt(0);
			i = 1;
		}
		if(oldChar == "H".charAt(0)){
			newChar = "I".charAt(0);
			i = 1;
		}
		if(oldChar == "I".charAt(0)){
			newChar = "J".charAt(0);
			i = 1;
		}
		if(oldChar == "J".charAt(0)){
			newChar = "K".charAt(0);
			i = 1;
		}
		if(oldChar == "K".charAt(0)){
			newChar = "L".charAt(0);
			i = 1;
		}
		if(oldChar == "L".charAt(0)){
			newChar = "M".charAt(0);
			i = 1;
		}
		if(oldChar == "M".charAt(0)){
			newChar = "N".charAt(0);
			i = 1;
		}
		if(oldChar == "N".charAt(0)){
			newChar = "O".charAt(0);
			i = 1;
		}
		if(oldChar == "O".charAt(0)){
			newChar = "P".charAt(0);
			i = 1;
		}
		if(oldChar == "P".charAt(0)){
			newChar = "Q".charAt(0);
			i = 1;
		}
		if(oldChar == "Q".charAt(0)){
			newChar = "R".charAt(0);
			i = 1;
		}
		if(oldChar == "R".charAt(0)){
			newChar = "S".charAt(0);
			i = 1;
		}
		if(oldChar == "S".charAt(0)){
			newChar = "T".charAt(0);
			i = 1;
		}
		if(oldChar == "T".charAt(0)){
			newChar = "U".charAt(0);
			i = 1;
		}
		if(oldChar == "U".charAt(0)){
			newChar = "V".charAt(0);
			i = 1;
		}
		if(oldChar == "V".charAt(0)){
			newChar = "W".charAt(0);
			i = 1;
		}
		if(oldChar == "W".charAt(0)){
			newChar = "X".charAt(0);
			i = 1;
		}
		if(oldChar == "X".charAt(0)){
			newChar = "Y".charAt(0);
			i = 1;
		}
		if(oldChar == "Y".charAt(0)){
			newChar = "Z".charAt(0);
			i = 1;
		}
		if(oldChar == "Z".charAt(0)){
			newChar = "a".charAt(0);
			i = 1;
		}
		if(oldChar == "a".charAt(0)){
			newChar = "b".charAt(0);
			i = 1;
		}
		if(oldChar == "b".charAt(0)){
			newChar = "c".charAt(0);
			i = 1;
		}
		if(oldChar == "c".charAt(0)){
			newChar = "d".charAt(0);
			i = 1;
		}
		if(oldChar == "d".charAt(0)){
			newChar = "e".charAt(0);
			i = 1;
		}
		if(oldChar == "e".charAt(0)){
			newChar = "f".charAt(0);
			i = 1;
		}
		if(oldChar == "f".charAt(0)){
			newChar = "g".charAt(0);
			i = 1;
		}
		if(oldChar == "g".charAt(0)){
			newChar = "h".charAt(0);
			i = 1;
		}
		if(oldChar == "h".charAt(0)){
			newChar = "i".charAt(0);
			i = 1;
		}
		if(oldChar == "i".charAt(0)){
			newChar = "j".charAt(0);
			i = 1;
		}
		if(oldChar == "j".charAt(0)){
			newChar = "k".charAt(0);
			i = 1;
		}
		if(oldChar == "k".charAt(0)){
			newChar = "l".charAt(0);
			i = 1;
		}
		if(oldChar == "l".charAt(0)){
			newChar = "m".charAt(0);
			i = 1;
		}
		if(oldChar == "m".charAt(0)){
			newChar = "n".charAt(0);
			i = 1;
		}
		if(oldChar == "n".charAt(0)){
			newChar = "o".charAt(0);
			i = 1;
		}
		if(oldChar == "o".charAt(0)){
			newChar = "p".charAt(0);
			i = 1;
		}
		if(oldChar == "p".charAt(0)){
			newChar = "q".charAt(0);
			i = 1;
		}
		if(oldChar == "q".charAt(0)){
			newChar = "r".charAt(0);
			i = 1;
		}
		if(oldChar == "r".charAt(0)){
			newChar = "s".charAt(0);
			i = 1;
		}
		if(oldChar == "s".charAt(0)){
			newChar = "t".charAt(0);
			i = 1;
		}
		if(oldChar == "t".charAt(0)){
			newChar = "u".charAt(0);
			i = 1;
		}
		if(oldChar == "u".charAt(0)){
			newChar = "v".charAt(0);
			i = 1;
		}
		if(oldChar == "v".charAt(0)){
			newChar = "w".charAt(0);
			i = 1;
		}
		if(oldChar == "w".charAt(0)){
			newChar = "x".charAt(0);
			i = 1;
		}
		if(oldChar == "x".charAt(0)){
			newChar = "y".charAt(0);
			i = 1;
		}
		if(oldChar == "y".charAt(0)){
			newChar = "z".charAt(0);
			i = 1;
		}
		if(oldChar == "z".charAt(0)) {
			newChar = "0".charAt(0);
			i = 0;
		}
		return newChar;
	}

	//Gets new char using no special characters
	public static char GetNextChar_none(char oldChar){
		char newChar = 0;
		if(oldChar == "0".charAt(0)){
			newChar = "1".charAt(0);
			i = 1;
		}
		if(oldChar == "1".charAt(0)){
			newChar = "2".charAt(0);
			i = 1;
		}
		if(oldChar == "2".charAt(0)){
			newChar = "3".charAt(0);
			i = 1;
		}
		if(oldChar == "3".charAt(0)){
			newChar = "4".charAt(0);
			i = 1;
		}
		if(oldChar == "4".charAt(0)){
			newChar = "5".charAt(0);
			i = 1;
		}
		if(oldChar == "5".charAt(0)){
			newChar = "6".charAt(0);
			i = 1;
		}
		if(oldChar == "6".charAt(0)){
			newChar = "7".charAt(0);
			i = 1;
		}
		if(oldChar == "7".charAt(0)){
			newChar = "8".charAt(0);
			i = 1;
		}
		if(oldChar == "8".charAt(0)){
			newChar = "9".charAt(0);
			i = 1;
		}
		if(oldChar == "9".charAt(0)){
			newChar = "A".charAt(0);
			i = 1;
		}
		if(oldChar == "A".charAt(0)){
			newChar = "B".charAt(0);
			i = 1;
		}
		if(oldChar == "B".charAt(0)){
			newChar = "C".charAt(0);
			i = 1;
		}
		if(oldChar == "C".charAt(0)){
			newChar = "D".charAt(0);
			i = 1;
		}
		if(oldChar == "D".charAt(0)){
			newChar = "E".charAt(0);
			i = 1;
		}
		if(oldChar == "E".charAt(0)){
			newChar = "F".charAt(0);
			i = 1;
		}
		if(oldChar == "F".charAt(0)){
			newChar = "G".charAt(0);
			i = 1;
		}
		if(oldChar == "G".charAt(0)){
			newChar = "H".charAt(0);
			i = 1;
		}
		if(oldChar == "H".charAt(0)){
			newChar = "I".charAt(0);
			i = 1;
		}
		if(oldChar == "I".charAt(0)){
			newChar = "J".charAt(0);
			i = 1;
		}
		if(oldChar == "J".charAt(0)){
			newChar = "K".charAt(0);
			i = 1;
		}
		if(oldChar == "K".charAt(0)){
			newChar = "L".charAt(0);
			i = 1;
		}
		if(oldChar == "L".charAt(0)){
			newChar = "M".charAt(0);
			i = 1;
		}
		if(oldChar == "M".charAt(0)){
			newChar = "N".charAt(0);
			i = 1;
		}
		if(oldChar == "N".charAt(0)){
			newChar = "O".charAt(0);
			i = 1;
		}
		if(oldChar == "O".charAt(0)){
			newChar = "P".charAt(0);
			i = 1;
		}
		if(oldChar == "P".charAt(0)){
			newChar = "Q".charAt(0);
			i = 1;
		}
		if(oldChar == "Q".charAt(0)){
			newChar = "R".charAt(0);
			i = 1;
		}
		if(oldChar == "R".charAt(0)){
			newChar = "S".charAt(0);
			i = 1;
		}
		if(oldChar == "S".charAt(0)){
			newChar = "T".charAt(0);
			i = 1;
		}
		if(oldChar == "T".charAt(0)){
			newChar = "U".charAt(0);
			i = 1;
		}
		if(oldChar == "U".charAt(0)){
			newChar = "V".charAt(0);
			i = 1;
		}
		if(oldChar == "V".charAt(0)){
			newChar = "W".charAt(0);
			i = 1;
		}
		if(oldChar == "W".charAt(0)){
			newChar = "X".charAt(0);
			i = 1;
		}
		if(oldChar == "X".charAt(0)){
			newChar = "Y".charAt(0);
			i = 1;
		}
		if(oldChar == "Y".charAt(0)){
			newChar = "Z".charAt(0);
			i = 1;
		}
		if(oldChar == "Z".charAt(0)){
			newChar = "a".charAt(0);
			i = 1;
		}
		if(oldChar == "a".charAt(0)){
			newChar = "b".charAt(0);
			i = 1;
		}
		if(oldChar == "b".charAt(0)){
			newChar = "c".charAt(0);
			i = 1;
		}
		if(oldChar == "c".charAt(0)){
			newChar = "d".charAt(0);
			i = 1;
		}
		if(oldChar == "d".charAt(0)){
			newChar = "e".charAt(0);
			i = 1;
		}
		if(oldChar == "e".charAt(0)){
			newChar = "f".charAt(0);
			i = 1;
		}
		if(oldChar == "f".charAt(0)){
			newChar = "g".charAt(0);
			i = 1;
		}
		if(oldChar == "g".charAt(0)){
			newChar = "h".charAt(0);
			i = 1;
		}
		if(oldChar == "h".charAt(0)){
			newChar = "i".charAt(0);
			i = 1;
		}
		if(oldChar == "i".charAt(0)){
			newChar = "j".charAt(0);
			i = 1;
		}
		if(oldChar == "j".charAt(0)){
			newChar = "k".charAt(0);
			i = 1;
		}
		if(oldChar == "k".charAt(0)){
			newChar = "l".charAt(0);
			i = 1;
		}
		if(oldChar == "l".charAt(0)){
			newChar = "m".charAt(0);
			i = 1;
		}
		if(oldChar == "m".charAt(0)){
			newChar = "n".charAt(0);
			i = 1;
		}
		if(oldChar == "n".charAt(0)){
			newChar = "o".charAt(0);
			i = 1;
		}
		if(oldChar == "o".charAt(0)){
			newChar = "p".charAt(0);
			i = 1;
		}
		if(oldChar == "p".charAt(0)){
			newChar = "q".charAt(0);
			i = 1;
		}
		if(oldChar == "q".charAt(0)){
			newChar = "r".charAt(0);
			i = 1;
		}
		if(oldChar == "r".charAt(0)){
			newChar = "s".charAt(0);
			i = 1;
		}
		if(oldChar == "s".charAt(0)){
			newChar = "t".charAt(0);
			i = 1;
		}
		if(oldChar == "t".charAt(0)){
			newChar = "u".charAt(0);
			i = 1;
		}
		if(oldChar == "u".charAt(0)){
			newChar = "v".charAt(0);
			i = 1;
		}
		if(oldChar == "v".charAt(0)){
			newChar = "w".charAt(0);
			i = 1;
		}
		if(oldChar == "w".charAt(0)){
			newChar = "x".charAt(0);
			i = 1;
		}
		if(oldChar == "x".charAt(0)){
			newChar = "y".charAt(0);
			i = 1;
		}
		if(oldChar == "y".charAt(0)){
			newChar = "z".charAt(0);
			i = 1;
		}
		if(oldChar == "z".charAt(0)) {
			newChar = "0".charAt(0);
			i = 0;
		}
		
		return newChar;
	}
	
	//Gets new char using only lower case letters and numbers
	public static char GetNextChar_lowernum(char oldChar){
		char newChar = 0;
		if(oldChar == "0".charAt(0)){
			newChar = "1".charAt(0);
			i = 1;
		}
		if(oldChar == "1".charAt(0)){
			newChar = "2".charAt(0);
			i = 1;
		}
		if(oldChar == "2".charAt(0)){
			newChar = "3".charAt(0);
			i = 1;
		}
		if(oldChar == "3".charAt(0)){
			newChar = "4".charAt(0);
			i = 1;
		}
		if(oldChar == "4".charAt(0)){
			newChar = "5".charAt(0);
			i = 1;
		}
		if(oldChar == "5".charAt(0)){
			newChar = "6".charAt(0);
			i = 1;
		}
		if(oldChar == "6".charAt(0)){
			newChar = "7".charAt(0);
			i = 1;
		}
		if(oldChar == "7".charAt(0)){
			newChar = "8".charAt(0);
			i = 1;
		}
		if(oldChar == "8".charAt(0)){
			newChar = "9".charAt(0);
			i = 1;
		}
		if(oldChar == "9".charAt(0)){
			newChar = "a".charAt(0);
			i = 1;
		}
		if(oldChar == "a".charAt(0)){
			newChar = "b".charAt(0);
			i = 1;
		}
		if(oldChar == "b".charAt(0)){
			newChar = "c".charAt(0);
			i = 1;
		}
		if(oldChar == "c".charAt(0)){
			newChar = "d".charAt(0);
			i = 1;
		}
		if(oldChar == "d".charAt(0)){
			newChar = "e".charAt(0);
			i = 1;
		}
		if(oldChar == "e".charAt(0)){
			newChar = "f".charAt(0);
			i = 1;
		}
		if(oldChar == "f".charAt(0)){
			newChar = "g".charAt(0);
			i = 1;
		}
		if(oldChar == "g".charAt(0)){
			newChar = "h".charAt(0);
			i = 1;
		}
		if(oldChar == "h".charAt(0)){
			newChar = "i".charAt(0);
			i = 1;
		}
		if(oldChar == "i".charAt(0)){
			newChar = "j".charAt(0);
			i = 1;
		}
		if(oldChar == "j".charAt(0)){
			newChar = "k".charAt(0);
			i = 1;
		}
		if(oldChar == "k".charAt(0)){
			newChar = "l".charAt(0);
			i = 1;
		}
		if(oldChar == "l".charAt(0)){
			newChar = "m".charAt(0);
			i = 1;
		}
		if(oldChar == "m".charAt(0)){
			newChar = "n".charAt(0);
			i = 1;
		}
		if(oldChar == "n".charAt(0)){
			newChar = "o".charAt(0);
			i = 1;
		}
		if(oldChar == "o".charAt(0)){
			newChar = "p".charAt(0);
			i = 1;
		}
		if(oldChar == "p".charAt(0)){
			newChar = "q".charAt(0);
			i = 1;
		}
		if(oldChar == "q".charAt(0)){
			newChar = "r".charAt(0);
			i = 1;
		}
		if(oldChar == "r".charAt(0)){
			newChar = "s".charAt(0);
			i = 1;
		}
		if(oldChar == "s".charAt(0)){
			newChar = "t".charAt(0);
			i = 1;
		}
		if(oldChar == "t".charAt(0)){
			newChar = "u".charAt(0);
			i = 1;
		}
		if(oldChar == "u".charAt(0)){
			newChar = "v".charAt(0);
			i = 1;
		}
		if(oldChar == "v".charAt(0)){
			newChar = "w".charAt(0);
			i = 1;
		}
		if(oldChar == "w".charAt(0)){
			newChar = "x".charAt(0);
			i = 1;
		}
		if(oldChar == "x".charAt(0)){
			newChar = "y".charAt(0);
			i = 1;
		}
		if(oldChar == "y".charAt(0)){
			newChar = "z".charAt(0);
			i = 1;
		}
		if(oldChar == "z".charAt(0)) {
			newChar = "0".charAt(0);
			i = 0;
		}
		
		return newChar;
	}
	
	//Gets new char using only lower case letters
	public static char GetNextChar_lower(char oldChar){
		char newChar = 0;
		if(oldChar == "a".charAt(0)){
			newChar = "b".charAt(0);
			i = 1;
		}
		if(oldChar == "b".charAt(0)){
			newChar = "c".charAt(0);
			i = 1;
		}
		if(oldChar == "c".charAt(0)){
			newChar = "d".charAt(0);
			i = 1;
		}
		if(oldChar == "d".charAt(0)){
			newChar = "e".charAt(0);
			i = 1;
		}
		if(oldChar == "e".charAt(0)){
			newChar = "f".charAt(0);
			i = 1;
		}
		if(oldChar == "f".charAt(0)){
			newChar = "g".charAt(0);
			i = 1;
		}
		if(oldChar == "g".charAt(0)){
			newChar = "h".charAt(0);
			i = 1;
		}
		if(oldChar == "h".charAt(0)){
			newChar = "i".charAt(0);
			i = 1;
		}
		if(oldChar == "i".charAt(0)){
			newChar = "j".charAt(0);
			i = 1;
		}
		if(oldChar == "j".charAt(0)){
			newChar = "k".charAt(0);
			i = 1;
		}
		if(oldChar == "k".charAt(0)){
			newChar = "l".charAt(0);
			i = 1;
		}
		if(oldChar == "l".charAt(0)){
			newChar = "m".charAt(0);
			i = 1;
		}
		if(oldChar == "m".charAt(0)){
			newChar = "n".charAt(0);
			i = 1;
		}
		if(oldChar == "n".charAt(0)){
			newChar = "o".charAt(0);
			i = 1;
		}
		if(oldChar == "o".charAt(0)){
			newChar = "p".charAt(0);
			i = 1;
		}
		if(oldChar == "p".charAt(0)){
			newChar = "q".charAt(0);
			i = 1;
		}
		if(oldChar == "q".charAt(0)){
			newChar = "r".charAt(0);
			i = 1;
		}
		if(oldChar == "r".charAt(0)){
			newChar = "s".charAt(0);
			i = 1;
		}
		if(oldChar == "s".charAt(0)){
			newChar = "t".charAt(0);
			i = 1;
		}
		if(oldChar == "t".charAt(0)){
			newChar = "u".charAt(0);
			i = 1;
		}
		if(oldChar == "u".charAt(0)){
			newChar = "v".charAt(0);
			i = 1;
		}
		if(oldChar == "v".charAt(0)){
			newChar = "w".charAt(0);
			i = 1;
		}
		if(oldChar == "w".charAt(0)){
			newChar = "x".charAt(0);
			i = 1;
		}
		if(oldChar == "x".charAt(0)){
			newChar = "y".charAt(0);
			i = 1;
		}
		if(oldChar == "y".charAt(0)){
			newChar = "z".charAt(0);
			i = 1;
		}
		if(oldChar == "z".charAt(0)) {
			newChar = "a".charAt(0);
			i = 0;
		}
		
		return newChar;
	}
	
}