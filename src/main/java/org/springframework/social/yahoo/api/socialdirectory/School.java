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
public class School {
	
	private String schoolName;
	private String schoolType;
	private String schoolYear;
	private String city;
	private String state;
	private String country;
	private String startDate;
	private String endDate;
	private long id;
	
	School() {}
	
	School(String schoolName, String schoolType, String schoolYear,
		   String city, String state, String country, String startDate, 
		   String endDate, long id) {
		this.schoolName = schoolName;
		this.schoolType = schoolType;
		this.schoolYear = schoolYear;
		this.city = city;
		this.state = state;
		this.country = country;
		this.startDate = startDate;
		this.endDate = endDate;
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public String getSchoolYear() {
		return schoolYear;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public long getId() {
		return id;
	}
	
	

}
