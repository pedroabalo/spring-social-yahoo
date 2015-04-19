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
public class Profile extends YahooObject implements Serializable {
	
	public Profile() {}
	
	public Profile(String guid, String ageCategory, Image image, String intl, String jurisdiction,
					String lang, String memberSince, String nickname, boolean notStored,
					String nux, String profileMode, String profileStatus, String profileUrl,
					String updated, boolean isConnected, boolean profileHidden, boolean bdRestricted,
					String profilePermission, String uri, boolean cache) {
		
		this.guid = guid;
		this.ageCategory = ageCategory;
		this.image = image;
		this.intl = intl;
		this.jurisdiction = jurisdiction;
		this.lang = lang;
		this.memberSince = memberSince;
		this.nickname = nickname;
		this.notStored = notStored;
		this.nux = nux;
		this.profileMode = profileMode;
		this.profileStatus = profileStatus;
		this.profileUrl = profileUrl;
		this.updated = updated;
		this.isConnected = isConnected;
		this.profileHidden = profileHidden;
		this.bdRestricted = bdRestricted;
		this.profilePermission = profilePermission;
		this.uri = uri;
		this.cache = cache;
	}
	
	public Profile(String guid, Image image, String nickname,String uri) {

		this.guid = guid;
		this.image = image;
		this.nickname = nickname;
		this.uri = uri;
	}
	
	public Profile(String guid, String nickname,String uri) {

		this.guid = guid;
		this.image = null;
		this.nickname = nickname;
		this.uri = uri;
	}

	private String guid;
	
	private String ageCategory;
	
	private Image image;

	private String intl;
	
	
	private String jurisdiction;
	
	
	private String lang;
	
	
	private String memberSince;
	
	
	private String nickname;
	
	
	private boolean notStored;
	
	
	private String nux;
	
	
	private String profileMode;
	
	
	private String profileStatus;
	
	
	private String profileUrl;
	
	
	private String updated;
	
	
	private boolean isConnected;
	
	
	private boolean profileHidden;
	
	
	private boolean bdRestricted;
	
	
	private String profilePermission;
	
	
	private String uri;
	
	
	private boolean cache;
	
	public String getGuid() {
		return guid;
	}

	public String getAgeCategory() {
		return ageCategory;
	}

	public Image getImage() {
		return image;
	}

	public String getIntl() {
		return intl;
	}

	public String getJurisdiction() {
		return jurisdiction;
	}

	public String getLang() {
		return lang;
	}

	public String getMemberSince() {
		return memberSince;
	}

	public String getNickname() {
		return nickname;
	}

	public boolean isNotStored() {
		return notStored;
	}

	public String getNux() {
		return nux;
	}

	public String getProfileMode() {
		return profileMode;
	}

	public String getProfileStatus() {
		return profileStatus;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public String getUpdated() {
		return updated;
	}

	public boolean isConnected() {
		return isConnected;
	}

	public boolean isProfileHidden() {
		return profileHidden;
	}

	public boolean isBdRestricted() {
		return bdRestricted;
	}

	public String getProfilePermission() {
		return profilePermission;
	}

	public String getUri() {
		return uri;
	}

	public boolean isCache() {
		return cache;
	}
}
