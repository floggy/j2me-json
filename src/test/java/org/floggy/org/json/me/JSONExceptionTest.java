/**
 * Copyright (c) 2006-2010 Floggy Open Source Group. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
