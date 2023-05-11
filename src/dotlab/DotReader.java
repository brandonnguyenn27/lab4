package dotlab;

import java.io.*;


public class DotReader 
{
	private BufferedReader			br;
	
	public DotReader(BufferedReader br)
	{
		this.br = br;
	}
	
	public Dot readDot() throws IOException, DotException {
		String dotString = br.readLine();
		
		if (dotString == null) {
			return null;
		}
		
		String[] dotArray = dotString.split(",");
		String color = dotArray[0];
		
		int x = Integer.parseInt(dotArray[1]);
		int y = Integer.parseInt(dotArray[2]);
		int radius = Integer.parseInt(dotArray[3]);
		
		if (dotArray.length != 4) {
			DotException de = new DotException("Dot Exception: " + dotString);
			throw de;
		}
		
		return new Dot(color, x, y, radius);
	}
	
	public static void main(String[] args) {
		
	}

}
