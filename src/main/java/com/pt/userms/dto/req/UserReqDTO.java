package com.pt.userms.dto.req;

public class UserReqDTO {
	
	private Long userId;
	
	private String userName;
	
	private String email;
	
//	private String tokenString;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public String getTokenString() {
//		return tokenString;
//	}
//
//	public void setTokenString(String tokenString) {
//		this.tokenString = tokenString;
//	}
	
	

}
