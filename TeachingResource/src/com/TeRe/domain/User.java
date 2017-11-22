package com.TeRe.domain;


/**
 *
 */
public class User {

	int web_id; //鐢ㄦ埛id
	String web_url; //鐢ㄦ埛鍚�
	public User(){    
        super();    
	}
		
	public int getWeb_id() {
		return web_id;
	}
	public void setWeb_id(int web_id) {
		this.web_id = web_id;
	}
	public String getWeb_url() {
		return web_url;
	}
	public void setWeb_url(String web_url) {
		this.web_url = web_url;
	}
	@Override  
    public String toString() {  
        return "User [web_id=" + web_id + ", web_url=" + web_url  
                + "]"; 
	}
	 public User(int web_id, String web_url) {    
	        super();    
	        this.web_id = web_id;    
	        this.web_url = web_url;       
	    }    
		
}
