package com.api_factura.api_factura.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api_factura.api_factura.models.FacturaModel;
import com.api_factura.api_factura.models.PagoModel;

import java.sql.Date;
import java.util.List;

@Repository
public interface PagoRepository extends CrudRepository<PagoModel, Integer> {
    List<PagoModel> findByFactura(FacturaModel factura);
    List<PagoModel> findByFechaPago(Date fechaPago);
    List<PagoModel> findByMetodoPago(PagoModel.MetodoPago metodoPago);
    // Puedes definir métodos adicionales aquí si lo necesitas
}
