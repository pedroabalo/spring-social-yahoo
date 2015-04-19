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

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.yahoo.api.Yahoo;
import org.springframework.social.yahoo.api.YahooProfile;
import org.springframework.social.yahoo.api.socialdirectory.SocialDirectoryOperations;

/**
 * @author Pedro Abalo
 */
public class YahooAdapter implements ApiAdapter<Yahoo> {
	
	public boolean test(Yahoo yahoo) {
		try {
			yahoo.socialDirectoryOperations().getProfile();
			return true;
		} catch (ApiException e) {
			return false;
		}
	}

	public void setConnectionValues(Yahoo yahoo, ConnectionValues values) {
		YahooProfile profile = yahoo.socialDirectoryOperations().getProfile();
		values.setProviderUserId(profile.getProfile().getGuid());
		values.setDisplayName(profile.getProfile().getNickname());
		values.setProfileUrl(profile.getProfile().getProfileUrl());
		values.setImageUrl((profile.getProfile().getImage() != null) ? profile.getProfile().getImage().getImageUrl() : null);
	}

	public UserProfile fetchUserProfile(Yahoo yahoo) {
		
		SocialDirectoryOperations socialDirectoryOperations = yahoo.socialDirectoryOperations();
		
		YahooProfile profile = socialDirectoryOperations.getProfile();
		
		return new UserProfileBuilder().setUsername(profile.getProfile().getGuid())
				.setName(profile.getProfile().getNickname())
				.setFirstName(profile.getProfile().getNickname())
				.setLastName(profile.getProfile().getNickname()).build();
	}

	public void updateStatus(Yahoo yahoo, String message) {
		throw new UnsupportedOperationException();
	}


}
