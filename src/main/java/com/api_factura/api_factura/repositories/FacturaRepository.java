package com.api_factura.api_factura.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api_factura.api_factura.models.ClienteModel;
import com.api_factura.api_factura.models.FacturaModel;

import java.sql.Date;
import java.util.List;

@Repository
public interface FacturaRepository extends CrudRepository<FacturaModel, Integer> {
    List<FacturaModel> findByFechaFactura(Date fechaFactura);
    List<FacturaModel> findByCliente(ClienteModel cliente);
    // Puedes definir métodos adicionales aquí si lo necesitas
}


