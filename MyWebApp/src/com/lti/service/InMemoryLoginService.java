package com.lti.service;

import java.util.HashMap;

public class InMemoryLoginService {
	
	private HashMap<String, String> users = new HashMap<String, String>();
	public InMemoryLoginService() {
		users.put("madhav", "123");
		users.put("madhav2", "456");
		users.put("madhav3", "789");
	}

	public boolean authenticate(String uname, String pwd) {
		if(users.containsKey(uname) && users.get(uname).equals(pwd))
				return true;
		
		return false;
		/*if(uname.equals("madhav") && pwd.equals("123"))
		 	return true;
		 else
		 return false;*/
	}
	
}
