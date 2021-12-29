package com.example.retobcp1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private Float monto;
    private String monedaOrigen;
    private String monedaDestino;
    private Float tipoDeCambio;
    private Float montoConTipoDeCambio;


    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Float getMonto(){
        return monto;
    }
    public void setMonto(Float monto){
        this.monto = monto;
    }
    public String getMonedaOrigen(){
        return monedaOrigen;
    }
    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }
    public String getMonedaDestino(){
        return monedaDestino;
    }
    public void setMonedaDestino(String monedaDestino){
        this.monedaDestino = monedaDestino;
    }
    public Float getTipoDeCambio(){
        return tipoDeCambio;
    }
    public void setTipoDeCambio(Float tipoDeCambio){
        this.tipoDeCambio = tipoDeCambio;
    }
    public Float getMontoConTipoDeCambio(){
        return monto*tipoDeCambio;
    }
    public void setMontoConTipoDeCambio(Float montoConTipoDeCambio){
        this.montoConTipoDeCambio = montoConTipoDeCambio;
    }
}
