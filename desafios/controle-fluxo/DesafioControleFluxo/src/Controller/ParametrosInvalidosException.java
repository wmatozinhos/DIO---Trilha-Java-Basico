package Controller;

@SuppressWarnings("serial")
public class ParametrosInvalidosException extends Exception {
	
	public ParametrosInvalidosException() {
		super("ERROR: Segundo Paramêtro é maior que o primeiro!!!");
	}

	
}
