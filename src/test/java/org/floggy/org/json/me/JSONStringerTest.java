package org.floggy.org.json.me;

import junit.framework.TestCase;

public class JSONStringerTest extends TestCase {

	public void testToString() throws Exception {
		JSONStringer json = new JSONStringer();

		String expected = "{\"JSON\":\"Hello, World!\"}";

		json.object().key("JSON").value("Hello, World!").endObject();

		assertEquals(expected, json.toString());
	}

}
