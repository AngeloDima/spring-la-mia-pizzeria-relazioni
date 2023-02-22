package com.example.demo.Model;


import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class prestito {
	
	@NonNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String cacca;
	
	@ManyToOne
	private pizzeriaModel pizzeriaModel;
	
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCacca() {
		return cacca;
	}

	public void setCacca(String cacca) {
		this.cacca = cacca;
	}

	public pizzeriaModel getPizza() {
		return pizzeriaModel;
	}

	public void setPizza(pizzeriaModel pizza) {
		this.pizzeriaModel = pizza;
	}

	
	
}
