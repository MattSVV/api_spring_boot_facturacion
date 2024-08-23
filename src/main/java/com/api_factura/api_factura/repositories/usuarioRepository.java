package com.api_factura.api_factura.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.api_factura.api_factura.models.usuarioModel;
import java.util.*;

@Repository
public interface usuarioRepository extends CrudRepository<usuarioModel, Long> {
    public abstract ArrayList<usuarioModel> findByPrioridad(Integer prioridad);
    public abstract Optional<ArrayList<usuarioModel>> findByNombre(String nombre);
    public abstract ArrayList<usuarioModel> findByEmail(String mail);
    // Puedes definir métodos adicionales aquí si lo necesitas
}
