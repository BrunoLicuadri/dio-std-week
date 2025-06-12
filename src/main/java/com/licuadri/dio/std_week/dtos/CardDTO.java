package com.licuadri.dio.std_week.dtos;

import com.licuadri.dio.std_week.entities.Card;

public class CardDTO {
	
	private Long id;
	private String number;
	private Double limit;
	
	public CardDTO() {
	}

	public CardDTO(Long id, String number, Double limit) {
		this.id = id;
		this.number = number;
		this.limit = limit;
	}
	
	public CardDTO(Card entity) {
		id = entity.getId();
		number = entity.getNumber();
		limit = entity.getLimit();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}

}
