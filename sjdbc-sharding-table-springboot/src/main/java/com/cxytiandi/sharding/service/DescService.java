package com.cxytiandi.sharding.service;

import com.cxytiandi.sharding.po.Desc;
import com.cxytiandi.sharding.po.User;

import java.util.List;

public interface DescService {

	List<Desc> list ();

	Long add (Desc user);

	Desc findById (Long id);

	Desc findByName (String name);
	
}
