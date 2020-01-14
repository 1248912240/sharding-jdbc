package com.cxytiandi.sharding.repository;

import com.cxytiandi.sharding.po.Desc;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface DescRepository {

	Long addDesc (Desc desc);

	List<Desc> list ();

	Desc findById (Long id);

	Desc findByName (String name);
}
