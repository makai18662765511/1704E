package com.makai.service;

import java.util.List;
import java.util.Map;

import com.makai.domain.Slide;

public interface SlideService {

//	列表
	List<Map<String, Slide>> selectall();
//	增加
	int add(Slide art);
//	删除
	int delete(Integer id);
//	修改
	int update(Slide art);
}
