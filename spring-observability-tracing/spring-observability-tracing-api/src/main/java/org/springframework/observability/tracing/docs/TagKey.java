/*
 * Copyright 2013-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.observability.tracing.docs;

import java.util.Arrays;

/**
 * Represents a tag key.
 *
 * @author Marcin Grzejszczak
 * @since 3.1.0
 */
public interface TagKey {

	/**
	 * @return tag key
	 */
	String getKey();

	/**
	 * Merges arrays of tags.
	 * @param tags array of tags
	 * @return a merged array of tags
	 */
	static TagKey[] merge(TagKey[]... tags) {
		return Arrays.stream(tags).flatMap(Arrays::stream).toArray(TagKey[]::new);
	}

}