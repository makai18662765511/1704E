package com.makai.service;

import java.util.List;
import java.util.Map;

import com.makai.domain.Channel;

public interface ChannelService {
	
//	列表
	List<Map<String, Channel>> selectall();
//	增加
	int add(Channel art);
//	删除
	int delete(Integer id);
//	修改
	int update(Channel art);
}
