package dotlab;

public class DotException extends Exception {
	public DotException(String dot) {
		super(dot + " is the wrong length");
	}
}
