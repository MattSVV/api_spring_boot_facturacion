package com.api_factura.api_factura.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api_factura.api_factura.repositories.FacturaRepository;
import com.api_factura.api_factura.models.FacturaModel;
import com.api_factura.api_factura.models.ClienteModel;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FacturaServices {

    @Autowired
    private FacturaRepository facturaRepository;

    public List<FacturaModel> obtenerFacturas() {
        return (List<FacturaModel>) facturaRepository.findAll();
    }

    public FacturaModel guardarFactura(FacturaModel factura) {
        return facturaRepository.save(factura);
    }

    public Optional<FacturaModel> obtenerPorId(Integer id) {
        return facturaRepository.findById(id);
    }

    public List<FacturaModel> obtenerPorFecha(Date fechaFactura) {
        return facturaRepository.findByFechaFactura(fechaFactura);
    }

    public List<FacturaModel> obtenerPorCliente(ClienteModel cliente) {
        return facturaRepository.findByCliente(cliente);
    }

    public boolean eliminarFactura(Integer id) {
        try {
            facturaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
