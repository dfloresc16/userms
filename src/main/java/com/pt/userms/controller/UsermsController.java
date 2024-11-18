package com.pt.userms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.pt.userms.dto.GenericResponseDTO;
import com.pt.userms.dto.req.UserReqDTO;
import com.pt.userms.dto.resp.UserRespDTO;
import com.pt.userms.dto.resp.UserRespLoginDTO;
import com.pt.userms.models.commons.CommonController;
import com.pt.userms.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/user/")
public class UsermsController extends CommonController{
	
	private static final Logger logger = LoggerFactory.getLogger(UsermsController.class);
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
//	@RequestMapping(path = "/getUser", method = RequestMethod.GET)
//	public ResponseEntity<GenericResponseDTO<UserRespDTO>> getUser(@RequestBody UserReqDTO userReqDTO){
//		try {
//            logger.info(String.format("Start login for user: %s", userReqDTO.getUserName()));
//            UserRespDTO respDTO = userServiceImpl.getUsermsbyId(userReqDTO.getUserId());
//            return ResponseEntity.ok(new GenericResponseDTO(SUCCESS, HttpStatus.OK.value(),null,null,
//                    "service execute succesfully",respDTO));
//        }catch (ResponseStatusException e){
//            logger.error("Exception: " + e.getMessage());
//            return new ResponseEntity<>(new GenericResponseDTO<>(ERROR, HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.toString(),
//                    e.getMessage(), "service execute", null), HttpStatus.NOT_FOUND);
//        }catch (Exception e){
//            logger.error("Exception: " + e.getMessage());
//            return new ResponseEntity<>(new GenericResponseDTO<>(ERROR, HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.toString(),
//                    e.getMessage(), "service execute", null), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//	}
	
	@RequestMapping(path = "/getUser", method = RequestMethod.GET)
	public ResponseEntity<GenericResponseDTO<UserRespDTO>> getUser(
	        @RequestParam("userId") Long userId, 
	        @RequestParam("userName") String userName) {
	    try {
	        logger.info(String.format("Start login for user: %s", userName));
	        UserRespDTO respDTO = userServiceImpl.getUsermsbyId(userId);
	        
	        return ResponseEntity.ok(new GenericResponseDTO(SUCCESS, HttpStatus.OK.value(), null, null,
	                "service executed successfully", respDTO));
	    } catch (ResponseStatusException e) {
	        logger.error("Exception: " + e.getMessage());
	        return new ResponseEntity<>(new GenericResponseDTO<>(ERROR, HttpStatus.NOT_FOUND.value(), 
	                HttpStatus.NOT_FOUND.toString(), e.getMessage(), "service execution failed", null), 
	                HttpStatus.NOT_FOUND);
	    } catch (Exception e) {
	        logger.error("Exception: " + e.getMessage());
	        return new ResponseEntity<>(new GenericResponseDTO<>(ERROR, HttpStatus.INTERNAL_SERVER_ERROR.value(), 
	                HttpStatus.INTERNAL_SERVER_ERROR.toString(), e.getMessage(), "service execution failed", null), 
	                HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	
	
	@RequestMapping(path = "/getUserByEmail", method = RequestMethod.GET)
	public ResponseEntity<GenericResponseDTO<UserRespLoginDTO>> getUserByEmail(
	        @RequestParam("email") String email) {
	    try {
	        logger.info(String.format("Start getUser for user: %s", email));
	        UserRespLoginDTO respDTO = userServiceImpl.getUsermsByEmail(email);
	        return ResponseEntity.ok(new GenericResponseDTO(SUCCESS, HttpStatus.OK.value(), null, null,
	                "service executed successfully", respDTO));
	    } catch (ResponseStatusException e) {
	        logger.error("Exception: " + e.getMessage());
	        return new ResponseEntity<>(new GenericResponseDTO<>(ERROR, HttpStatus.NOT_FOUND.value(), 
	                HttpStatus.NOT_FOUND.toString(), e.getMessage(), "service execution failed", null), 
	                HttpStatus.NOT_FOUND);
	    } catch (Exception e) {
	        logger.error("Exception: " + e.getMessage());
	        return new ResponseEntity<>(new GenericResponseDTO<>(ERROR, HttpStatus.INTERNAL_SERVER_ERROR.value(), 
	                HttpStatus.INTERNAL_SERVER_ERROR.toString(), e.getMessage(), "service execution failed", null), 
	                HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
}
