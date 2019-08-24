package com.makai.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.makai.domain.Channel;
import com.makai.service.ChannelService;

@Service
@Transactional
public class ChannelServiceImpl implements ChannelService {

	@Override
	public List<Map<String, Channel>> selectall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Channel art) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Channel art) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	@Autowired
//	private MyMapper mm;
	

}
