package com.api_factura.api_factura.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api_factura.api_factura.repositories.ProductoRepository;
import com.api_factura.api_factura.models.ProductoModel;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServices {

    @Autowired
    private ProductoRepository productoRepository;

    public List<ProductoModel> obtenerProductos() {
        return (List<ProductoModel>) productoRepository.findAll();
    }

    public ProductoModel guardarProducto(ProductoModel producto) {
        return productoRepository.save(producto);
    }

    public Optional<ProductoModel> obtenerPorId(Integer id) {
        return productoRepository.findById(id);
    }

    public List<ProductoModel> obtenerPorNombre(String nombreProducto) {
        return productoRepository.findByNombreProducto(nombreProducto);
    }

    public List<ProductoModel> obtenerPorDescripcion(String descripcionProducto) {
        return productoRepository.findByDescripcionProducto(descripcionProducto);
    }

    public boolean eliminarProducto(Integer id) {
        try {
            productoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
