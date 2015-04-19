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
"id",
"type",
"value",
"editedBy",
"flags",
"categories",
"updated",
"created",
"uri"
})
public class Field extends YahooObject implements Serializable{
	
	@JsonProperty("id")
	private int id;
	@JsonProperty("type")
	private String type;
	@JsonProperty("value")
	private Object value;
	@JsonProperty("editedBy")
	private String editedBy;
	@JsonProperty("flags")
	private List<Object> flags = new ArrayList<Object>();
	@JsonProperty("categories")
	private List<Object> categories = new ArrayList<Object>();
	@JsonProperty("updated")
	private String updated;
	@JsonProperty("created")
	private String created;
	@JsonProperty("uri")
	private String uri;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public Field() {
		// TODO Auto-generated constructor stub
	}

	/**
	* 
	* @return
	* The id
	*/
	@JsonProperty("id")
	public int getId() {
	return id;
	}

	/**
	* 
	* @return
	* The type
	*/
	@JsonProperty("type")
	public String getType() {
	return type;
	}

	/**
	* 
	* @return
	* The value
	*/
	@JsonProperty("value")
	public Object getValue() {
	return value;
	}

	/**
	* 
	* @return
	* The editedBy
	*/
	@JsonProperty("editedBy")
	public String getEditedBy() {
	return editedBy;
	}

	/**
	* 
	* @return
	* The flags
	*/
	@JsonProperty("flags")
	public List<Object> getFlags() {
	return flags;
	}

	/**
	* 
	* @return
	* The categories
	*/
	@JsonProperty("categories")
	public List<Object> getCategories() {
	return categories;
	}

	/**
	* 
	* @return
	* The updated
	*/
	@JsonProperty("updated")
	public String getUpdated() {
	return updated;
	}

	/**
	* 
	* @return
	* The created
	*/
	@JsonProperty("created")
	public String getCreated() {
	return created;
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

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}
	
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
}
