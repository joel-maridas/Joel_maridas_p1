package com.joel.models;

public class ERS_User_Roles {
	private int ERS_USER_ROLE_ID;
	private String USER_ROLE;
	public ERS_User_Roles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ERS_User_Roles(int eRS_USER_ROLE_ID, String uSER_ROLE) {
		super();
		ERS_USER_ROLE_ID = eRS_USER_ROLE_ID;
		USER_ROLE = uSER_ROLE;
	}
	public int getERS_USER_ROLE_ID() {
		return ERS_USER_ROLE_ID;
	}
	public void setERS_USER_ROLE_ID(int eRS_USER_ROLE_ID) {
		ERS_USER_ROLE_ID = eRS_USER_ROLE_ID;
	}
	public String getUSER_ROLE() {
		return USER_ROLE;
	}
	public void setUSER_ROLE(String uSER_ROLE) {
		USER_ROLE = uSER_ROLE;
	}
	@Override
	public String toString() {
		return "ERS_User_Roles [ERS_USER_ROLE_ID=" + ERS_USER_ROLE_ID + ", USER_ROLE=" + USER_ROLE + "]";
	}

	
}
