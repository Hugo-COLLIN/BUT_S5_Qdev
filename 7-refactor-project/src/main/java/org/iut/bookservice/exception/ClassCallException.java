package org.iut.bookservice.exception;

public class ClassCallException extends RuntimeException {

	private static final long serialVersionUID = -4584041339906109902L;

	public ClassCallException() {
		super();
	}

	public ClassCallException(String message,
			Throwable cause) {
		super(message, cause);
	}

	public ClassCallException(String message) {
		super(message);
	}

	public ClassCallException(Throwable cause) {
		super(cause);
	}

	
}
