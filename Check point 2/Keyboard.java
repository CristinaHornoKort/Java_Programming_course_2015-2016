import java.io.*;

public class Keyboard { //keyboard class
	public static String readString() {
		BufferedReader br;
		try {
				br = new BufferedReader (new InputStreamReader(System.in));
				return br.readLine();
		} catch (Exception e) {
			
		}
		return null;
	} //End of method
	
	public static int readInt(){// Start of method
		return Integer.parseInt(readString());
	}//End of method
	
	public static byte readByte(){
		return Byte.parseByte(readString());
	}
	
	public static short readShort(){
		return Short.parseShort(readString());
	}
	
	public static long readLong(){
		return Long.parseLong(readString());
	}
	
	public static float readFloat(){
		return Float.parseFloat(readString());
	}
	
	public static double readDouble(){
		return Double.parseDouble(readString());
	}
	
	public static char readChar(){
		return readString().charAt(0);
	}

	public static boolean readBoolean(){
		return Boolean.parseBoolean(readString());
	}
	
}