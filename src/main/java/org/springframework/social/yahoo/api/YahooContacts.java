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
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Pedro Abalo
 */
@SuppressWarnings("serial")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"contacts"
})
public class YahooContacts extends YahooObject implements Serializable {
	
	@JsonProperty("contacts")
	private Contacts contacts;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public YahooContacts() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	* 
	* @return
	* The contacts
	*/
	@JsonProperty("contacts")
	public Contacts getContacts() {
	return contacts;
	}

	/**
	* 
	* @param contacts
	* The contacts
	*/
	@JsonProperty("contacts")
	public void setContacts(Contacts contacts) {
	this.contacts = contacts;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

}
