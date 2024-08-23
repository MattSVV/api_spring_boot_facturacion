package com.api_factura.api_factura.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "Detalles_Factura")
public class DetalleFacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer idDetalle;

    @ManyToOne
    @JoinColumn(name = "id_factura", nullable = false)
    private FacturaModel factura;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private ProductoModel producto;

    private Integer cantidadProducto;
    private Double precioUnitario;
    private Double subtotal;

    // Constructor con parámetros
    public DetalleFacturaModel(Integer idDetalle, FacturaModel factura, ProductoModel producto, Integer cantidadProducto, Double precioUnitario, Double subtotal) {
        this.idDetalle = idDetalle;
        this.factura = factura;
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
    }

    // Constructor sin parámetros
    public DetalleFacturaModel() {
    }

    // Getters y Setters
    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public FacturaModel getFactura() {
        return factura;
    }

    public void setFactura(FacturaModel factura) {
        this.factura = factura;
    }

    public ProductoModel getProducto() {
        return producto;
    }

    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "DetalleFactura [idDetalle=" + idDetalle + ", factura=" + factura + ", producto=" + producto + ", cantidadProducto=" + cantidadProducto + ", precioUnitario=" + precioUnitario + ", subtotal=" + subtotal + "]";
    }
}
