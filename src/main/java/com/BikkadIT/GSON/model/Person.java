package com.BikkadIT.GSON.model;

public class Person {
	
	private int pid;
	
	private String pname;
	
	private String pemail;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + "]";
	}
	
	

}
