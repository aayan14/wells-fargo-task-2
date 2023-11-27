package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Client {
	
	@Id
	@GeneratedValue
	private long clientId;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastname;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String phone;
	
	@Column(nullable = false)
	private String email;
	
	@ManyToOne
	private Advisor advisor;
	public long getClientId() {
		return clientId;
	}
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Advisor getAdvisor() {
		return advisor;
	}
	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}
	public Client(long clientId, String firstName, String lastname, String address, String phone, String email,
			Advisor advisor) {
		super();
		this.clientId = clientId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.advisor = advisor;
	}
	public Client() {
		
	}
	
	
}
