package com.licuadri.dio.std_week.dtos;

import com.licuadri.dio.std_week.entities.Feature;

public class FeatureDTO {
	
	private Long id;
	private String icon;
	private String description;
	
	public FeatureDTO() {
	}

	public FeatureDTO(Long id, String icon, String description) {
		this.id = id;
		this.icon = icon;
		this.description = description;
	}
	
	public FeatureDTO(Feature entity) {
		id = entity.getId();
		icon = entity.getIcon();
		description = entity.getDescription();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
