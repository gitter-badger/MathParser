package it.mathparser.math;

/**
 * A mathematical error.
 * 
 * @author emiliano
 */
public class MathematicalException extends RuntimeException {
	
	private static final long serialVersionUID = -998796160408914490L;

	public MathematicalException(String msg) {
		super(msg);
	}
}
