package com.makai.service;

import java.util.List;
import java.util.Map;

import com.makai.domain.User;

public interface UserService {

//	列表
	List<Map<String, User>> selectall();
//	增加
	int add(User art);
//	删除
	int delete(Integer id);
//	修改
	int update(User art);
}
