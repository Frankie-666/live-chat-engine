/*
 * Copyright 2015 Evgeny Dolganov (evgenij.dolganov@gmail.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package och.api.exception.chat;

import och.api.exception.ValidationException;

public class NoChatException extends ValidationException {
	
	private static final long serialVersionUID = 1L;

	public NoChatException() {
		super();
	}

	public NoChatException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoChatException(String message) {
		super(message);
	}

	public NoChatException(Throwable cause) {
		super(cause);
	}
	
	

}
