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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
"contact",
"count",
"start",
"total",
"uri",
"cache"
})
public class Contacts extends YahooObject implements Serializable {

	@JsonProperty("contact")
	private List<Contact> contact = new ArrayList<Contact>();
	@JsonProperty("count")
	private Integer count;
	@JsonProperty("start")
	private Integer start;
	@JsonProperty("total")
	private Integer total;
	@JsonProperty("uri")
	private String uri;
	@JsonProperty("cache")
	private Boolean cache;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	* 
	* @return
	* The contact
	*/
	@JsonProperty("contact")
	public List<Contact> getContact() {
	return contact;
	}

	/**
	* 
	* @return
	* The count
	*/
	@JsonProperty("count")
	public Integer getCount() {
	return count;
	}

	/**
	* 
	* @return
	* The start
	*/
	@JsonProperty("start")
	public Integer getStart() {
	return start;
	}

	/**
	* 
	* @return
	* The total
	*/
	@JsonProperty("total")
	public Integer getTotal() {
	return total;
	}

	/**
	* 
	* @return
	* The uri
	*/
	@JsonProperty("uri")
	public String getUri() {
	return uri;
	}

	
	/**
	* 
	* @return
	* The cache
	*/
	@JsonProperty("cache")
	public Boolean getCache() {
	return cache;
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
