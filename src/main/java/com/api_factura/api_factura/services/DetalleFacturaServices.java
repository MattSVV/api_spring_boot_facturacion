package com.api_factura.api_factura.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api_factura.api_factura.repositories.DetalleFacturaRepository;
import com.api_factura.api_factura.models.DetalleFacturaModel;
import com.api_factura.api_factura.models.FacturaModel;
import com.api_factura.api_factura.models.ProductoModel;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleFacturaServices {

    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;

    public List<DetalleFacturaModel> obtenerDetallesFactura() {
        return (List<DetalleFacturaModel>) detalleFacturaRepository.findAll();
    }

    public DetalleFacturaModel guardarDetalleFactura(DetalleFacturaModel detalleFactura) {
        return detalleFacturaRepository.save(detalleFactura);
    }

    public Optional<DetalleFacturaModel> obtenerPorId(Integer id) {
        return detalleFacturaRepository.findById(id);
    }

    public List<DetalleFacturaModel> obtenerPorFactura(FacturaModel factura) {
        return detalleFacturaRepository.findByFactura(factura);
    }

    public List<DetalleFacturaModel> obtenerPorProducto(ProductoModel producto) {
        return detalleFacturaRepository.findByProducto(producto);
    }

    public boolean eliminarDetalleFactura(Integer id) {
        try {
            detalleFacturaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
