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
package org.springframework.social.yahoo.connect;

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.oauth2.AccessGrant;
import org.springframework.social.yahoo.api.Yahoo;

/**
 * @author Pedro Abalo
 */
public class YahooConnectionFactory extends OAuth2ConnectionFactory<Yahoo> {

	public YahooConnectionFactory(String clientId, String clientSecret) {
		super("yahoo", new YahooServiceProvider(clientId, clientSecret), 
					   new YahooAdapter());
	}
	
	@Override
	protected String extractProviderUserId(AccessGrant accessGrant) {
		Yahoo api = ((YahooServiceProvider)getServiceProvider()).getApi(accessGrant.getAccessToken());
		
		ApiAdapter<Yahoo> apiAdapter = getApiAdapter();
		
		UserProfile userProfile = apiAdapter.fetchUserProfile(api);
	    return userProfile.getUsername();
	}

}
