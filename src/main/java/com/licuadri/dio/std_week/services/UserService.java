package com.licuadri.dio.std_week.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.licuadri.dio.std_week.dtos.UserDTO;
import com.licuadri.dio.std_week.entities.User;
import com.licuadri.dio.std_week.repositories.UserRepository;
import com.licuadri.dio.std_week.services.exceptions.DatabaseIntegrityException;
import com.licuadri.dio.std_week.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		User entity = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Usuário não existente"));
		return new UserDTO(entity);
	}
	
	@Transactional(readOnly = true)
	public Page<UserDTO> findAll(Pageable pageable){
		Page<User> list = userRepository.findAll(pageable);
		return list.map(x -> new UserDTO(x));
	}
	
	@Transactional
	public UserDTO insert (UserDTO dto) {
		User entity = new User();
		dtoToEntity(entity, dto);
		entity = userRepository.save(entity);
		return new UserDTO(entity);
	}
	
	@Transactional
	public UserDTO update (Long id, UserDTO dto) {
		try {
			User entity = userRepository.getReferenceById(id);
			dtoToEntity(entity, dto);
			return new UserDTO(entity);
		}
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("Update negado. Id não existe");
		}
	}
	
	@Transactional
	public void deleteById(Long id) {
		try {
			userRepository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Delete failed! Id not found");
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseIntegrityException("Delete failed! Referential integrity constraint violation.");
		}
	}
	
	
	private User dtoToEntity(User entity, UserDTO dto) {
		entity.setName(dto.getName());
		return entity;
	}

}
