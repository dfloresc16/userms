package com.pt.userms.dto.resp;

public class UserRespLoginDTO {
	
	private Long id;
	
	private String name;
	
	private String lastName;
	
	private String userName;
	
	private String phoneNumber;
	
	private String email;
	
	private String pin;
	
	private Boolean active;
	

	public UserRespLoginDTO() {
		super();
	}


	/**
	 * @param id
	 * @param name
	 * @param lastName
	 * @param userName
	 * @param phoneNumber
	 * @param email
	 * @param pin
	 */
	public UserRespLoginDTO(Long id, String name, String lastName, String userName, String phoneNumber, String email,
			String pin, Boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.pin = pin;
		this.active = active;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}


	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}


	/**
	 * @return the active
	 */
	public Boolean isActive() {
		return active;
	}


	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}


	@Override
	public String toString() {
		return "UserRespLoginDTO [id=" + id + ", name=" + name + ", lastName=" + lastName + ", userName=" + userName
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", pin=" + pin + ", active=" + active + "]";
	}
	
	
	
		

}
