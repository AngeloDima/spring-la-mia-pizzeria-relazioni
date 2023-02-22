package com.example.demo.Model;


import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class sconto {
	
	@NonNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String sconto;
	
	@ManyToOne
	private pizzeriaModel pizzeriaModel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSconto() {
		return sconto;
	}

	public void setSconto(String sconto) {
		this.sconto = sconto;
	}

	public pizzeriaModel getPizzeriaModel() {
		return pizzeriaModel;
	}

	public void setPizzeriaModel(pizzeriaModel pizzeriaModel) {
		this.pizzeriaModel = pizzeriaModel;
	}
	
	
	
	

	
	
}
