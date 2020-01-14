package com.cxytiandi.sharding.service;

import com.cxytiandi.sharding.po.Desc;
import com.cxytiandi.sharding.repository.DescRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescServiceImpl implements DescService {

	@Autowired
	private DescRepository descRepository;
	
	public List<Desc> list() {
		return descRepository.list();
	}

	public Long add(Desc user) {
		return descRepository.addDesc(user);
	}

	@Override
	public Desc findById(Long id) {
		return descRepository.findById(id);
	}

	@Override
	public Desc findByName(String name) {
		return descRepository.findByName(name);
	}

}
