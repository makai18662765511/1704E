package com.makai.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.makai.domain.Slide;
import com.makai.service.SlideService;

@Service
@Transactional
public class SlideServiceimpl implements SlideService {

	@Override
	public List<Map<String, Slide>> selectall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Slide art) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Slide art) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	@Autowired
//	private MyMapper mm;
	

}
