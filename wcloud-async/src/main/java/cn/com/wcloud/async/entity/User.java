package cn.com.wcloud.async.entity;

import java.io.Serializable;


public class  User  implements Serializable {

	/**
	  * @Fields serialVersionUID : 
	  */
	
	private static final long serialVersionUID = 1L;

	private int use_id;
	
	private String use_name;
	
	private String use_age;
	
	private String use_email;

	public int getUse_id() {
		return use_id;
	}

	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}

	public String getUse_name() {
		return use_name;
	}

	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}

	public String getUse_age() {
		return use_age;
	}

	public void setUse_age(String use_age) {
		this.use_age = use_age;
	}

	public String getUse_email() {
		return use_email;
	}

	public void setUse_email(String use_email) {
		this.use_email = use_email;
	}
	
}
