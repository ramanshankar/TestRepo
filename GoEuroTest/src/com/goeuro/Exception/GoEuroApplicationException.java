/**
 * 
 */
package com.goeuro.Exception;

/**
 * @author Raman
 *
 */
public class GoEuroApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4770381433696218703L;

	/**
	 * 
	 */
	public GoEuroApplicationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public GoEuroApplicationException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public GoEuroApplicationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public GoEuroApplicationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public GoEuroApplicationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	

}
