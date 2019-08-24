package com.makai.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.makai.domain.Category;
import com.makai.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{

	@Override
	public List<Map<String, Category>> selectall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Category art) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Category art) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	@Autowired
//	private MyMapper mm;
	

}
