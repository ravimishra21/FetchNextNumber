package com.fetchNextNumber.dao;


import org.springframework.data.repository.CrudRepository;
import com.fetchNextNumber.entities.Fetch;


public interface FetchRepository extends CrudRepository<Fetch,Integer>{

	public Fetch findById(int id);
}



