package com.licuadri.dio.std_week.dtos;

import com.licuadri.dio.std_week.entities.News;

public class NewsDTO {
	
	private Long id;
	private String description;
	
	public NewsDTO() {
	}

	public NewsDTO(Long id, String description) {
		this.id = id;
		this.description = description;
	}

	public NewsDTO(News entity) {
		id = entity.getId();
		description = entity.getDescription();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
