package com.licuadri.dio.std_week.dtos;

import com.licuadri.dio.std_week.entities.User;

public class UserDTO {
	
	private Long id;
	private String name;

	public UserDTO() {
	}

	public UserDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
