package com.joel.models;

public class ERS_Reimbursement {
private int REIMB_AMOUNT;
private int REIMB_ID;
private int REIMB_SUBMITTED;
private int REIMB_RESOLVED;
private String REIMB_DESCRIPTION;
private int REIMB_BLOB;
private int REIMB_AUTHOR;
private int REIMB_RESOLVER;
private int REIMB_STATUS_ID;
private int REIMB_TYPE_ID;
public ERS_Reimbursement() {
	super();
	// TODO Auto-generated constructor stub
}
public ERS_Reimbursement(int rEIMB_AMOUNT, int rEIMB_ID, int rEIMB_SUBMITTED, int rEIMB_RESOLVED,
		String rEIMB_DESCRIPTION, int rEIMB_BLOB, int rEIMB_AUTHOR, int rEIMB_RESOLVER, int rEIMB_STATUS_ID,
		int rEIMB_TYPE_ID) {
	super();
	REIMB_AMOUNT = rEIMB_AMOUNT;
	REIMB_ID = rEIMB_ID;
	REIMB_SUBMITTED = rEIMB_SUBMITTED;
	REIMB_RESOLVED = rEIMB_RESOLVED;
	REIMB_DESCRIPTION = rEIMB_DESCRIPTION;
	REIMB_BLOB = rEIMB_BLOB;
	REIMB_AUTHOR = rEIMB_AUTHOR;
	REIMB_RESOLVER = rEIMB_RESOLVER;
	REIMB_STATUS_ID = rEIMB_STATUS_ID;
	REIMB_TYPE_ID = rEIMB_TYPE_ID;
}
public int getREIMB_AMOUNT() {
	return REIMB_AMOUNT;
}
public void setREIMB_AMOUNT(int rEIMB_AMOUNT) {
	REIMB_AMOUNT = rEIMB_AMOUNT;
}
public int getREIMB_ID() {
	return REIMB_ID;
}
public void setREIMB_ID(int rEIMB_ID) {
	REIMB_ID = rEIMB_ID;
}
public int getREIMB_SUBMITTED() {
	return REIMB_SUBMITTED;
}
public void setREIMB_SUBMITTED(int rEIMB_SUBMITTED) {
	REIMB_SUBMITTED = rEIMB_SUBMITTED;
}
public int getREIMB_RESOLVED() {
	return REIMB_RESOLVED;
}
public void setREIMB_RESOLVED(int rEIMB_RESOLVED) {
	REIMB_RESOLVED = rEIMB_RESOLVED;
}
public String getREIMB_DESCRIPTION() {
	return REIMB_DESCRIPTION;
}
public void setREIMB_DESCRIPTION(String rEIMB_DESCRIPTION) {
	REIMB_DESCRIPTION = rEIMB_DESCRIPTION;
}
public int getREIMB_BLOB() {
	return REIMB_BLOB;
}
public void setREIMB_BLOB(int rEIMB_BLOB) {
	REIMB_BLOB = rEIMB_BLOB;
}
public int getREIMB_AUTHOR() {
	return REIMB_AUTHOR;
}
public void setREIMB_AUTHOR(int rEIMB_AUTHOR) {
	REIMB_AUTHOR = rEIMB_AUTHOR;
}
public int getREIMB_RESOLVER() {
	return REIMB_RESOLVER;
}
public void setREIMB_RESOLVER(int rEIMB_RESOLVER) {
	REIMB_RESOLVER = rEIMB_RESOLVER;
}
public int getREIMB_STATUS_ID() {
	return REIMB_STATUS_ID;
}
public void setREIMB_STATUS_ID(int rEIMB_STATUS_ID) {
	REIMB_STATUS_ID = rEIMB_STATUS_ID;
}
public int getREIMB_TYPE_ID() {
	return REIMB_TYPE_ID;
}
public void setREIMB_TYPE_ID(int rEIMB_TYPE_ID) {
	REIMB_TYPE_ID = rEIMB_TYPE_ID;
}
@Override
public String toString() {
	return "ERS_Reimbursement [REIMB_AMOUNT=" + REIMB_AMOUNT + ", REIMB_ID=" + REIMB_ID + ", REIMB_SUBMITTED="
			+ REIMB_SUBMITTED + ", REIMB_RESOLVED=" + REIMB_RESOLVED + ", REIMB_DESCRIPTION=" + REIMB_DESCRIPTION
			+ ", REIMB_BLOB=" + REIMB_BLOB + ", REIMB_AUTHOR=" + REIMB_AUTHOR + ", REIMB_RESOLVER=" + REIMB_RESOLVER
			+ ", REIMB_STATUS_ID=" + REIMB_STATUS_ID + ", REIMB_TYPE_ID=" + REIMB_TYPE_ID + "]";
}



}
