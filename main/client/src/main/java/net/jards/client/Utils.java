package net.jards.client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Helper methods.
 */
public class Utils {

	/**
	 * Regular expression for checking simple names with allowed dot separator.
	 */
	private static final Pattern DOT_NAME_PATTERN = Pattern.compile("(\\w+\\.?)+");

	/**
	 * Returns whether the name matches pattern for simple names with dot
	 * separators.
	 * 
	 * @param name
	 *            the name string to be checked.
	 * @return true, if the string matched the pattern, false otherwise.
	 */
	public static boolean matchesSimpleDotName(String name) {
		Matcher matcher = DOT_NAME_PATTERN.matcher(name);
		return matcher.matches();
	}

}
