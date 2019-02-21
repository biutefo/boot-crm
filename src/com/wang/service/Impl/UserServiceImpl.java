package com.wang.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wang.dao.UserDao;
import com.wang.po.User;
import com.wang.service.UserService;
@Service("userServiceImp")
public class UserServiceImpl implements UserService{

	//自动装配
	@Autowired//为什么接口也可以自动装配？
	private UserDao userDao;
	@Override
	public User findUser(String usercode, String password) {
		User user=this.userDao.findUser(usercode, password);
		return user;
	}

}
