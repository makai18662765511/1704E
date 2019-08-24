package com.makai.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.makai.domain.User;
import com.makai.service.UserService;

@Service
@Transactional
public class UserServiceimpl implements UserService {

	@Override
	public List<Map<String, User>> selectall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(User art) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User art) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	@Autowired
//	private MyMapper mm;
	

}
