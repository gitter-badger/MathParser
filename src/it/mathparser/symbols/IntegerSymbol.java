package it.mathparser.symbols;

import it.mathparser.math.NumericSymbol;

/**
 * The integer symbol implements an integer number.
 * 
 * @author emiliano
 */
public class IntegerSymbol implements NumericSymbol {
	
	private static final String PATTERN = "[0-9]+";

	private int value;
	
	@Override
	public String getPattern() {
		return PATTERN;
	}
	
	@Override
	public double solve() {
		return this.value;
	}
	
	@Override
	public String getValue() {
		return Integer.toString(this.value);
	}
	
	@Override
	public void setValue(String value) {
		this.value = Integer.parseInt(value);
	}
	
	@Override
	public String toString() {
		return this.getValue();
	}
}
