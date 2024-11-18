package com.pt.userms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pt.userms.models.entity.Userms;

@Repository
public interface UsermsRepository extends JpaRepository<Userms, Long>{
	
	
	public List<Userms> findAll();
	
	public Optional<Userms> findById(Long id);
	
	public Optional<Userms> findByUserName(String userName);
	
	public Optional<Userms> findByEmail(String email);
	

}
