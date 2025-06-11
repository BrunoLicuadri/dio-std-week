package com.licuadri.dio.std_week.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_account")
public class Account {
	
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String number;
	private String agency;
	private Double balance;
	@Column(name = "acc_limit")
	private Double limit;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public Account() {
	}

	public Account(String number, String agency, Double balance, Double limit, User user) {
		this.number = number;
		this.agency = agency;
		this.balance = balance;
		this.limit = limit;
		this.user = user;
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

	public void setAgency(String agendy) {
		this.agency = agendy;
	}

	public Double getBalance() {
		return balance;
	}

	public void increaseBalance(Double amount) {
		balance += amount;
	}
	
	public void decreaseBalance(Double amount) {
		balance -= amount;
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}

}
