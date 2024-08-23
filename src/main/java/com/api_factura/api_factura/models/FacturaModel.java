package com.api_factura.api_factura.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import java.sql.Date;

@Entity
@Table(name = "Facturas")
public class FacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer idFactura;

    private Date fechaFactura;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private ClienteModel cliente;

    private Double totalFactura;

    // Constructor con parámetros
    public FacturaModel(Integer idFactura, Date fechaFactura, ClienteModel cliente, Double totalFactura) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.cliente = cliente;
        this.totalFactura = totalFactura;
    }

    // Constructor sin parámetros
    public FacturaModel() {
    }

    // Getters y Setters
    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public Double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(Double totalFactura) {
        this.totalFactura = totalFactura;
    }

    @Override
    public String toString() {
        return "Factura [idFactura=" + idFactura + ", fechaFactura=" + fechaFactura + ", cliente=" + cliente + ", totalFactura=" + totalFactura + "]";
    }
}
