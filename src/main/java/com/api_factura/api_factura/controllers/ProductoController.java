package com.api_factura.api_factura.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_factura.api_factura.models.ProductoModel;
import com.api_factura.api_factura.services.ProductoServices;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoServices productoService;

    @GetMapping
    public List<ProductoModel> obtenerProductos() {
        return productoService.obtenerProductos();
    }

    @PostMapping
    public ProductoModel guardarProducto(@RequestBody ProductoModel producto) {
        return productoService.guardarProducto(producto);
    }

    @GetMapping("/{id}")
    public Optional<ProductoModel> obtenerProductoPorId(@PathVariable("id") Integer id) {
        return productoService.obtenerPorId(id);
    }

    @GetMapping("/nombre/{nombreProducto}")
    public List<ProductoModel> obtenerProductosPorNombre(@PathVariable("nombreProducto") String nombreProducto) {
        return productoService.obtenerPorNombre(nombreProducto);
    }

    @GetMapping("/descripcion/{descripcionProducto}")
    public List<ProductoModel> obtenerProductosPorDescripcion(@PathVariable("descripcionProducto") String descripcionProducto) {
        return productoService.obtenerPorDescripcion(descripcionProducto);
    }
}
