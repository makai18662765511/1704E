package com.makai.service;

import java.util.List;
import java.util.Map;

import com.makai.domain.Category;

public interface CategoryService {

//	列表
	List<Map<String, Category>> selectall();
//	增加
	int add(Category art);
//	删除
	int delete(Integer id);
//	修改
	int update(Category art);
}
