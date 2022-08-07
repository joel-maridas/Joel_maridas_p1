package com.joel.models;

public class ERS_Reimbursement_Types {
	private int REIMB_TYPE_ID;
	private String REIMB_TYPE;
	
	public ERS_Reimbursement_Types() {
		super();		
	}

	public ERS_Reimbursement_Types(int rEIMB_TYPE_ID, String rEIMB_TYPE) {
		super();
		REIMB_TYPE_ID = rEIMB_TYPE_ID;
		REIMB_TYPE = rEIMB_TYPE;
	}

	public int getREIMB_TYPE_ID() {
		return REIMB_TYPE_ID;
	}

	public void setREIMB_TYPE_ID(int rEIMB_TYPE_ID) {
		REIMB_TYPE_ID = rEIMB_TYPE_ID;
	}

	public String getREIMB_TYPE() {
		return REIMB_TYPE;
	}

	public void setREIMB_TYPE(String rEIMB_TYPE) {
		REIMB_TYPE = rEIMB_TYPE;
	}

	@Override
	public String toString() {
		return "ERS_Reimbursement_Types [REIMB_TYPE_ID=" + REIMB_TYPE_ID + ", REIMB_TYPE=" + REIMB_TYPE + "]";
	}
		
}
