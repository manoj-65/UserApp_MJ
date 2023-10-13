package org.alpha.userapp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Setter
@Getter
public class User {
	@Id
	private long userId;
	private String userName;
	private String userEmail;
	private String usePassword;

}
