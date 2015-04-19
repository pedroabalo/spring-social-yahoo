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
package org.springframework.social.yahoo.api.impl;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_EMPTY_BEANS;
import static com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.OAuth2Version;
import org.springframework.social.yahoo.api.Yahoo;
import org.springframework.social.yahoo.api.contacts.ContactOperations;
import org.springframework.social.yahoo.api.contacts.impl.ContactTemplate;
import org.springframework.social.yahoo.api.socialdirectory.SocialDirectoryOperations;
import org.springframework.social.yahoo.api.socialdirectory.impl.SocialDirectoryTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Pedro Abalo
 */
public class YahooTemplate extends AbstractOAuth2ApiBinding implements Yahoo {

	private String accessToken;

	private SocialDirectoryOperations socialDirectoryOperations;
	private ContactOperations contactOperations;
	
	public YahooTemplate() {
		initialize();
	}
	
	public YahooTemplate(String accessToken) {
		super(accessToken);
		this.accessToken = accessToken;
		initialize();
	}
	
	private void initialize() {
		socialDirectoryOperations = new SocialDirectoryTemplate(getRestTemplate(), isAuthorized());
		contactOperations = new ContactTemplate(getRestTemplate(), isAuthorized());
	}
	
	@Override
	protected List<HttpMessageConverter<?>> getMessageConverters() {
		
		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(WRITE_DATES_AS_TIMESTAMPS, false);
		objectMapper.configure(FAIL_ON_EMPTY_BEANS, false);
		objectMapper.setSerializationInclusion(NON_NULL);
		jsonConverter.setObjectMapper(objectMapper);
		
		FormHttpMessageConverter formHttpMessageConverter = new FormHttpMessageConverter();
		formHttpMessageConverter.addPartConverter(jsonConverter);
		
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		messageConverters.add(jsonConverter);
		messageConverters.add(new ByteArrayHttpMessageConverter());
		messageConverters.add(formHttpMessageConverter);
		messageConverters.add(new ResourceHttpMessageConverter());
		return messageConverters;
	}
	
	@Override
	protected OAuth2Version getOAuth2Version() {
		return OAuth2Version.BEARER;
	}
	
	
	public SocialDirectoryOperations socialDirectoryOperations() {
		return socialDirectoryOperations;
	}

	public ContactOperations contactsOperations() {
		return contactOperations;
	}

	public String getAccessToken() {
		return accessToken;
	}

}
