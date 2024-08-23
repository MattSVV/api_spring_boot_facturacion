package com.api_factura.api_factura.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import java.sql.Date;

@Entity
@Table(name = "Pagos")
public class PagoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer idPago;

    @ManyToOne
    @JoinColumn(name = "id_factura", nullable = false)
    private FacturaModel factura;

    private Date fechaPago;
    private Double montoPago;

    @Enumerated(EnumType.STRING)
    private MetodoPago metodoPago;

    public enum MetodoPago {
        EFECTIVO, TARJETA_DE_CREDITO, TRANSFERENCIA_BANCARIA
    }

    // Constructor con parámetros
    public PagoModel(Integer idPago, FacturaModel factura, Date fechaPago, Double montoPago, MetodoPago metodoPago) {
        this.idPago = idPago;
        this.factura = factura;
        this.fechaPago = fechaPago;
        this.montoPago = montoPago;
        this.metodoPago = metodoPago;
    }

    // Constructor sin parámetros
    public PagoModel() {
    }

    // Getters y Setters
    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public FacturaModel getFactura() {
        return factura;
    }

    public void setFactura(FacturaModel factura) {
        this.factura = factura;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(Double montoPago) {
        this.montoPago = montoPago;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public String toString() {
        return "Pago [idPago=" + idPago + ", factura=" + factura + ", fechaPago=" + fechaPago + ", montoPago=" + montoPago + ", metodoPago=" + metodoPago + "]";
    }
}
