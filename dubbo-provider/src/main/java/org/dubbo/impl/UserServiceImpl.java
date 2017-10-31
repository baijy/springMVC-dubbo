package org.dubbo.impl;

import org.dubbo.api.UserService;

public class UserServiceImpl implements UserService {

	public String getUserName() {
		return "调用了实现类";
	}

}
