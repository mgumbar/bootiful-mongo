
package com.journaldev.bootifulmongo.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	@Id
    private String userId;
    @Length(min=3, max=20, message = "Nom trop long ou trop court. Et oui messages sont plus stylés que ceux de Spring")
	private String name;
	private Date creationDate = new Date();
	private Map<String, String> userSettings = new HashMap<>();

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Map<String, String> getUserSettings() {
		return userSettings;
	}

	public void setUserSettings(Map<String, String> userSettings) {
		this.userSettings = userSettings;
	}
}
