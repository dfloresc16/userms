package com.pt.userms.service;

import java.util.List;
import java.util.Optional;

import com.pt.userms.dto.resp.UserRespDTO;
import com.pt.userms.models.entity.Userms;

public interface UsermsService {
	
	List<UserRespDTO> listUsers();

	UserRespDTO getUsermsbyId(Long id);

	void deleteUsuario(Long id);
}
