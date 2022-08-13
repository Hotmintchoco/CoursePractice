package com.test.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class Member {
	private int num, admin; 
	private String nickname, gender, email;
	private Date joinDate;
}
