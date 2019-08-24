package com.makai.service;

import java.util.List;
import java.util.Map;

import com.makai.domain.Article;

public interface SettingsService {
	
//	列表
	List<Map<String, Article>> selectall();
//	增加
	int add(Article art);
//	删除
	int delete(Integer id);
//	修改
	int update(Article art);

}
