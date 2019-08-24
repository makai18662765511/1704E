package com.makai.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.makai.domain.Article;
import com.makai.service.SettingsService;

@Service
@Transactional
public class SettingsServiceimpl implements SettingsService {

	@Override
	public List<Map<String, Article>> selectall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Article art) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Article art) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	@Autowired
//	private MyMapper mm;
	

}
