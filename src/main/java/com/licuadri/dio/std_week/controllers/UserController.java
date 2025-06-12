package com.licuadri.dio.std_week.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.licuadri.dio.std_week.dtos.UserDTO;
import com.licuadri.dio.std_week.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Long id){
		UserDTO dto = userService.findById(id);
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping
	public ResponseEntity<Page<UserDTO>> findAll(Pageable pageable){
		Page<UserDTO> list = userService.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@PostMapping
	public ResponseEntity<UserDTO> insert(@RequestBody UserDTO dto){
		dto = userService.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<UserDTO> update(@PathVariable Long id, @RequestBody UserDTO dto){
		dto = userService.update(id, dto);
		return ResponseEntity.ok(dto);
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		userService.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}
