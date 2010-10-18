package org.floggy.org.json.me;

import org.floggy.org.json.me.JSONException;

import junit.framework.TestCase;

public class JSONExceptionTest extends TestCase {

	public void testJSONExceptionString() {
		String message = "exception";

		JSONException exception = new JSONException(message);

		assertEquals(message, exception.getMessage());
	}

	public void testJSONExceptionThrowable() {
		Exception cause = new Exception();

		JSONException exception = new JSONException(cause);

		assertEquals(cause, exception.getCause());
	}

	public void testGetCause() {
		Exception cause = new Exception();

		JSONException exception = new JSONException(cause);

		assertEquals(cause, exception.getCause());
	}

}
