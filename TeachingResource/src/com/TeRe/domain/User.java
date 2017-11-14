package com.TeRe.domain;

import java.util.Date;

/**
 *
 */
public class User {

	String user_id; //鐢ㄦ埛id
	String user_name; //鐢ㄦ埛鍚�
	String user_password; //鐢ㄦ埛瀵嗙爜
	int user_role; //鐢ㄦ埛瑙掕壊
	Date user_cretetime; //鍒涘缓鏃堕棿
	int user_enable; //鏄惁鐢熸晥
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public int getUser_role() {
		return user_role;
	}
	public void setUser_role(int user_role) {
		this.user_role = user_role;
	}
	public Date getUser_cretetime() {
		return user_cretetime;
	}
	public void setUser_cretetime(Date user_cretetime) {
		this.user_cretetime = user_cretetime;
	}
	public int getUser_enable() {
		return user_enable;
	}
	public void setUser_enable(int user_enable) {
		this.user_enable = user_enable;
	}

	
}
