package com.joel.models;

public class ERS_Users {
	private int ERS_USERS_ID;
	private String USERNAME;
	private String ERS_PASSWORD;
	private String USER_FIRST_NAME;
	private String USER_LAST_NAME;
	private String USER_EMAIL;
	private String USER_ROLE_ID;
	
	public ERS_Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ERS_Users(int eRS_USERS_ID, String uSERNAME, String eRS_PASSWORD, String uSER_FIRST_NAME,
			String uSER_LAST_NAME, String uSER_EMAIL, String uSER_ROLE_ID) {
		super();
		ERS_USERS_ID = eRS_USERS_ID;
		USERNAME = uSERNAME;
		ERS_PASSWORD = eRS_PASSWORD;
		USER_FIRST_NAME = uSER_FIRST_NAME;
		USER_LAST_NAME = uSER_LAST_NAME;
		USER_EMAIL = uSER_EMAIL;
		USER_ROLE_ID = uSER_ROLE_ID;
	}

	public int getERS_USERS_ID() {
		return ERS_USERS_ID;
	}

	public void setERS_USERS_ID(int eRS_USERS_ID) {
		ERS_USERS_ID = eRS_USERS_ID;
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}

	public String getERS_PASSWORD() {
		return ERS_PASSWORD;
	}

	public void setERS_PASSWORD(String eRS_PASSWORD) {
		ERS_PASSWORD = eRS_PASSWORD;
	}

	public String getUSER_FIRST_NAME() {
		return USER_FIRST_NAME;
	}

	public void setUSER_FIRST_NAME(String uSER_FIRST_NAME) {
		USER_FIRST_NAME = uSER_FIRST_NAME;
	}

	public String getUSER_LAST_NAME() {
		return USER_LAST_NAME;
	}

	public void setUSER_LAST_NAME(String uSER_LAST_NAME) {
		USER_LAST_NAME = uSER_LAST_NAME;
	}

	public String getUSER_EMAIL() {
		return USER_EMAIL;
	}

	public void setUSER_EMAIL(String uSER_EMAIL) {
		USER_EMAIL = uSER_EMAIL;
	}

	public String getUSER_ROLE_ID() {
		return USER_ROLE_ID;
	}

	public void setUSER_ROLE_ID(String uSER_ROLE_ID) {
		USER_ROLE_ID = uSER_ROLE_ID;
	}

	@Override
	public String toString() {
		return "ERS_Users [ERS_USERS_ID=" + ERS_USERS_ID + ", USERNAME=" + USERNAME + ", ERS_PASSWORD=" + ERS_PASSWORD
				+ ", USER_FIRST_NAME=" + USER_FIRST_NAME + ", USER_LAST_NAME=" + USER_LAST_NAME + ", USER_EMAIL="
				+ USER_EMAIL + ", USER_ROLE_ID=" + USER_ROLE_ID + "]";
	}
    
	
	
	
}
