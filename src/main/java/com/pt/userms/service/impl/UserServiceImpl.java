package com.pt.userms.service.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.pt.userms.dto.resp.UserRespDTO;
import com.pt.userms.models.entity.Userms;
import com.pt.userms.repository.UsermsRepository;
import com.pt.userms.service.UsermsService;

@Service
public class UserServiceImpl implements UsermsService{
	
	@Autowired
	private UsermsRepository usermsRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public List<UserRespDTO> listUsers() {
		return null;
	}

	@Override
	public UserRespDTO getUsermsbyId(Long id) {
		log.info(String.format("getUsermsbyId UserId [%d]", id));
		Userms userms = usermsRepository.findById(id)
									.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		UserRespDTO userRespDTO = new UserRespDTO();
		userRespDTO.setEmail(userms.getEmail());
		userRespDTO.setLastName(userms.getLastName());
		userRespDTO.setName(userms.getName());
		userRespDTO.setPhoneNumber(userms.getPhoneNumber());
		log.info(String.format("userEmail [%s]", userRespDTO.getEmail()));
		return userRespDTO;
	}

	@Override
	public void deleteUsuario(Long id) {
		// TODO Auto-generated method stub
		
	}

}
