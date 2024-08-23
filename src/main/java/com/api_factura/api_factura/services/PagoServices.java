package com.api_factura.api_factura.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api_factura.api_factura.repositories.PagoRepository;
import com.api_factura.api_factura.models.PagoModel;
import com.api_factura.api_factura.models.FacturaModel;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PagoServices {

    @Autowired
    private PagoRepository pagoRepository;

    public List<PagoModel> obtenerPagos() {
        return (List<PagoModel>) pagoRepository.findAll();
    }

    public PagoModel guardarPago(PagoModel pago) {
        return pagoRepository.save(pago);
    }

    public Optional<PagoModel> obtenerPorId(Integer id) {
        return pagoRepository.findById(id);
    }

    public List<PagoModel> obtenerPorFactura(FacturaModel factura) {
        return pagoRepository.findByFactura(factura);
    }

    public List<PagoModel> obtenerPorFecha(Date fechaPago) {
        return pagoRepository.findByFechaPago(fechaPago);
    }

    public List<PagoModel> obtenerPorMetodoPago(PagoModel.MetodoPago metodoPago) {
        return pagoRepository.findByMetodoPago(metodoPago);
    }

    public boolean eliminarPago(Integer id) {
        try {
            pagoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
