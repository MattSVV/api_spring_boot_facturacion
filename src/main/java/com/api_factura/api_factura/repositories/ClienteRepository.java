package com.api_factura.api_factura.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api_factura.api_factura.models.ClienteModel;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel, Integer> {
    List<ClienteModel> findByNombreCliente(String nombreCliente);
    List<ClienteModel> findByEmailCliente(String emailCliente);
    // Puedes definir métodos adicionales aquí si lo necesitas
}
