package com.api_factura.api_factura.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api_factura.api_factura.models.ProductoModel;
import java.util.List;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel, Integer> {
    List<ProductoModel> findByNombreProducto(String nombreProducto);
    List<ProductoModel> findByDescripcionProducto(String descripcionProducto);
    // Puedes definir métodos adicionales aquí si lo necesitas
}
