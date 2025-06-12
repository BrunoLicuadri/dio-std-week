package com.licuadri.dio.std_week.dtos;

import com.licuadri.dio.std_week.entities.Account;

public class AccountDTO {
	
	private Long id;
	private String number;
	private String agency;
	private Double balance;
	private Double limit;

	
	public AccountDTO() {
	}


	public AccountDTO(Long id, String number, String agency, Double balance, Double limit) {
		this.id = id;
		this.number = number;
		this.agency = agency;
		this.balance = balance;
		this.limit = limit;
	}
	
	public AccountDTO(Account entity) {
		this.id = entity.getId();
		this.number = entity.getNumber();
		this.agency = entity.getAgency();
		this.balance = entity.getBalance();
		this.limit = entity.getLimit();
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


	public String getAgency() {
		return agency;
	}


	public void setAgency(String agency) {
		this.agency = agency;
	}


	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}


	public Double getLimit() {
		return limit;
	}


	public void setLimit(Double limit) {
		this.limit = limit;
	}


}
