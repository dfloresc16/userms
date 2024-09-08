package com.pt.userms.service;

import java.util.List;
import java.util.Optional;

import com.pt.userms.dto.req.UserDTO;
import com.pt.userms.models.entity.Userms;

public interface UsermsService {
	
	List<Userms> listUsers();

	Optional<Userms> getUsermsbyId(Long id);

	void deleteUsuario(Long id);
}
