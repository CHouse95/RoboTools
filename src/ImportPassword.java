import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ImportPassword {
	static int i = 0, j = 0;
	static String[] Password = new String[10000];
	@SuppressWarnings("deprecation")
	public static void ImportPassword(String filename){
		File file = new File(filename);
	    FileInputStream fis = null;
	    BufferedInputStream bis = null;
	    DataInputStream dis = null;
	    String temp;
	    try {
	      fis = new FileInputStream(file);
	      bis = new BufferedInputStream(fis);
	      dis = new DataInputStream(bis);
	      while (dis.available() != 0) {
	    	  temp = dis.readLine();
	    	  System.out.println(temp);
	    	  Password[i] = temp;
	    	  i++;
	      }
	      fis.close();
	      bis.close();
	      dis.close();

	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
	public static String GetNextPassword(){
		String password;
		if(j != i){
			password = Password[j];
			j++;
			return password;
		}else return null;
	}
}

