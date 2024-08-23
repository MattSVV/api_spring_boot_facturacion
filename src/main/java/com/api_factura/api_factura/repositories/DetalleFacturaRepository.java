package com.api_factura.api_factura.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api_factura.api_factura.models.DetalleFacturaModel;
import com.api_factura.api_factura.models.FacturaModel;
import com.api_factura.api_factura.models.ProductoModel;

import java.util.List;

@Repository
public interface DetalleFacturaRepository extends CrudRepository<DetalleFacturaModel, Integer> {
    List<DetalleFacturaModel> findByFactura(FacturaModel factura);
    List<DetalleFacturaModel> findByProducto(ProductoModel producto);
    // Puedes definir métodos adicionales aquí si lo necesitas
}

