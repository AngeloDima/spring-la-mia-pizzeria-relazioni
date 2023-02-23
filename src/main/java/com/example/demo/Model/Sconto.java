package com.example.demo.Model;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Sconto {
    
    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String Offerta;
   
    

	//------------------------------------------------------------
    @ManyToOne
    
    private pizzeria elencoPizze;
    //------------------------------------------------------------

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOfferta() {
        return Offerta;
    }

    public void setOfferta(String offerta) {
        Offerta = offerta;
    }



    public pizzeria getElencoPizze() {
        return elencoPizze;
    }

    public void setElencoPizze(pizzeria pizza) {
        this.elencoPizze = pizza;
    }
}



