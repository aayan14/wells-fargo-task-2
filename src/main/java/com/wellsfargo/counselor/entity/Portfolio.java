package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {

	@Id
	@GeneratedValue
	private long portfolioId;
	
	@OneToOne
	private Client client;
	
	@Column(nullable = false)
	private String creationDate;
	public long getPortfolioId() {
		return portfolioId;
	}
	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public Portfolio(long portfolioId, Client client, String creationDate) {
		super();
		this.portfolioId = portfolioId;
		this.client = client;
		this.creationDate = creationDate;
	}
	public Portfolio() {
		
	}
	
	 
}
