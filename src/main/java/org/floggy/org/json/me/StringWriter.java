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

import java.io.IOException;
import java.io.Writer;

/**
 * A simple StringBuffer-based implementation of StringWriter
 */
public class StringWriter extends Writer {
    
    final private StringBuffer buf;
    
    public StringWriter() {
        super();
        buf = new StringBuffer();
    }
    
    public StringWriter(int initialSize) {
        super();
        buf = new StringBuffer(initialSize);
    }
    
    public void write(char[] cbuf, int off, int len) throws IOException {
        buf.append(cbuf, off, len);
    }

    public void write(String str) throws IOException {
        buf.append(str);
    }

    public void write(String str, int off, int len) throws IOException {
        buf.append(str.substring(off, len));
    }

    public void flush() throws IOException {
    }

    public void close() throws IOException {
    }
    

    public String toString() {
    	return buf.toString();
    }
}
