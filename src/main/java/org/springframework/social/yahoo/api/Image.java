/*
 * Copyright 2015 the original author or authors.
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
package org.springframework.social.yahoo.api;

import java.io.Serializable;

/**
 * @author Pedro Abalo
 */
@SuppressWarnings("serial")
public class Image extends YahooObject implements Serializable {
	
	public Image() {}

	public Image(int height, String imageUrl, String size, int width) {
		this.height = height;
		this.imageUrl = imageUrl;
		this.size = size;
		this.width = width;
	}
	
	int height;
	
	String imageUrl;
	
	String size;
	
	int width;

	public int getHeight() {
		return height;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public String getSize() {
		return size;
	}

	public int getWidth() {
		return width;
	}
}
