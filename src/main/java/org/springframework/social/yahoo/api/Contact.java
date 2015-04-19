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
"isConnection",
"id",
"fields",
"categories",
"error",
"restoredId",
"created",
"updated",
"uri"
})
public class Contact extends YahooObject implements Serializable{
	
	@JsonProperty("isConnection")
	private Boolean isConnection;
	@JsonProperty("id")
	private int id;
	@JsonProperty("fields")
	private List<Field> fields = new ArrayList<Field>();
	@JsonProperty("categories")
	private List<Category> categories = new ArrayList<Category>();
	@JsonProperty("error")
	private int error;
	@JsonProperty("restoredId")
	private int restoredId;
	@JsonProperty("created")
	private String created;
	@JsonProperty("updated")
	private String updated;
	@JsonProperty("uri")
	private String uri;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Contact() {
		
	}
	
	
	/**
	* 
	* @return
	* The isConnection
	*/
	@JsonProperty("isConnection")
	public Boolean getIsConnection() {
	return isConnection;
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
	* The fields
	*/
	@JsonProperty("fields")
	public List<Field> getFields() {
	return fields;
	}

	/**
	* 
	* @return
	* The categories
	*/
	@JsonProperty("categories")
	public List<Category> getCategories() {
	return categories;
	}

	/**
	* 
	* @return
	* The error
	*/
	@JsonProperty("error")
	public int getError() {
	return error;
	}

	/**
	* 
	* @return
	* The restoredId
	*/
	@JsonProperty("restoredId")
	public int getRestoredId() {
	return restoredId;
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
	* The updated
	*/
	@JsonProperty("updated")
	public String getUpdated() {
	return updated;
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
