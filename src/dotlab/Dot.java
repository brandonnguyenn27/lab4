package dotlab;


public class Dot 
{
	private static String[] 	LEGAL_COLOR_NAMES =
	{
		"RED", "YELLOW", "BLUE", "CYAN", "GREEN", "MAGENTA", "ORANGE", "BLACK"
	};

	private String color;
	private int x, y, radius;
	
	public Dot(String color, int x, int y, int radius) {
		for (int i = 0; i < LEGAL_COLOR_NAMES.length; i++) {
			if (LEGAL_COLOR_NAMES[i].equals(color)) {
				this.color = color;
			}
		}
		
		if (this.color == null) {
			throw new IllegalArgumentException(color + " is a bad color name");
		}
		
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String getColorName() {
		return color;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		return "[Color: " + color + " | x: " + x + " | y: " + y + " | radius: " + radius + "]";
	}
	
	public static void main(String[] args) {
		Dot dot1 = new Dot("BLUE", 50, 50, 50);
		System.out.println(dot1);
	}
}
