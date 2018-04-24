
package com.ly.credit.service;


import com.ly.credit.dao.UserDao;
import com.ly.credit.entity.User;
import com.ly.credit.util.AdResult;
import com.ly.credit.util.EncodeUtil;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	private static String Url = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";
	@Resource
	private UserDao userDao;


	@Transactional
	public AdResult register(String name, String phone, String password, Integer code) throws Exception {

		AdResult result = new AdResult();
		User addUser = new User();
		addUser.setPassword(EncodeUtil.md5(password + "credit"));
		addUser.setPhone(phone);
		userDao.save(addUser);
		result.setStatus(1);
		result.setMsg("注册成功!");
		return result;

	}
}