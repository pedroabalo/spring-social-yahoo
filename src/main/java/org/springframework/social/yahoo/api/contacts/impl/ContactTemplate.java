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
package org.springframework.social.yahoo.api.contacts.impl;

import java.util.List;

import org.springframework.social.yahoo.api.Contact;
import org.springframework.social.yahoo.api.YahooContacts;
import org.springframework.social.yahoo.api.contacts.ContactOperations;
import org.springframework.social.yahoo.api.impl.AbstractYahooApiOperations;
import org.springframework.web.client.RestTemplate;

/**
 * @author Pedro Abalo
 */
public class ContactTemplate extends AbstractYahooApiOperations implements ContactOperations {
	
	private static final String CONTACTS_URL = "https://social.yahooapis.com/v1/user/";
	private static final String CONTACTS_URL_END = "/contacts?format=json";

	public ContactTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}
	
	public List<Contact> getContacts(String id) {
		
		String url = CONTACTS_URL + id + CONTACTS_URL_END;
		
		return super.restTemplate.getForObject(url, YahooContacts.class).getContacts().getContact();
	}
	
	public List<Contact> getContacts() {
		return getContacts("me");
	}
}
