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
package org.springframework.social.yahoo.api.socialdirectory;

/**
 * @author Pedro Abalo
 */
public class Work {

	private String address;
	private String city;
	private String country;
	private String endDate;
	private long id;
	private String postalCode;
	private String startDate;
	private String state;
	private String title;
	private String workName;
	
	Work() {}
	
	Work(String address, String city, String country, String endDate, 
		 long id, String postalCode, String startDate, String state,
		 String title, String workName) {
		this.address = address;
		this.city = city;
		this.country = country;
		this.endDate = endDate;
		this.id = id;
		this.postalCode = postalCode;
		this.startDate = startDate;
		this.state = state;
		this.title = title;
		this.workName = workName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getEndDate() {
		return endDate;
	}

	public long getId() {
		return id;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getState() {
		return state;
	}

	public String getTitle() {
		return title;
	}

	public String getWorkName() {
		return workName;
	}
	
	
}
