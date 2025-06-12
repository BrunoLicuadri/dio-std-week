package com.licuadri.dio.std_week.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.licuadri.dio.std_week.dtos.UserDTO;
import com.licuadri.dio.std_week.entities.User;
import com.licuadri.dio.std_week.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		User entity = userRepository.findById(id).get();
		return new UserDTO(entity);
	}
	
	@Transactional(readOnly = true)
	public Page<UserDTO> findAll(Pageable pageable){
		Page<User> list = userRepository.findAll(pageable);
		return list.map(x -> new UserDTO(x));
	}
	
	@Transactional
	public UserDTO insert (UserDTO dto) {
		User entity = dtoToEntity(null, dto);
		return new UserDTO(entity);
	}
	
	@Transactional
	public UserDTO update (Long id, UserDTO dto) {
		User entity = dtoToEntity(id, dto);
		return new UserDTO(entity);
	}
	
	@Transactional
	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}
	
	
	private User dtoToEntity(Long id, UserDTO dto) {
		User entity;
		if (id != null) {
			entity = userRepository.getReferenceById(id);
		}
		else {
			entity = new User();
		}
		entity.setName(dto.getName());
		return userRepository.save(entity);
	}

}
