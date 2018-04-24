
package com.ly.credit.service;

import com.ly.credit.util.AdResult;


public interface UserService {
	


	/** 用户注册接口,用户注册用户
	 * @param phone
	 * @param password
	 * @param code
	 * @return 
	 * @throws Exception 
	 */
	public AdResult register(String name, String phone, String password, Integer code) throws Exception;

}
 