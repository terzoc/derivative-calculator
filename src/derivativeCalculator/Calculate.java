package derivativeCalculator;

public class Calculate {
	public static String powerRule(String coefient, String power) {
		String output = "";
		Double first = Double.valueOf(coefient);
		Double two = Double.valueOf(power);
		first *= two;
		output += first;
		two -= 1;
		output += "^" + two;
		return output;
	}
	
	public static String quotientRule(String string, String string2) {
		String output = "";
//		Double first = Double.valueOf(string);
		Double two = Double.valueOf(string2) * Double.valueOf(string2);
		output += "(" + string2 + "x * " + string + " - " + string + "x * " + string2 + ") / " + two;
		return output;
	}
	
	public static String productRule(String string, String string2) {
		String output = "";
		output += string + "x * " + string2 + " + " + string2 + "x * " + string;
		return output;
	}
	
	public static boolean isNumber( String input ) {
	    try {
	        Double.parseDouble( input );
	        return true;
	    }
	    catch( NumberFormatException e ) {
	        return false;
	    }
	}

}
