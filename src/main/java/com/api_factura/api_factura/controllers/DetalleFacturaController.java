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

import com.api_factura.api_factura.models.DetalleFacturaModel;
import com.api_factura.api_factura.models.FacturaModel;
import com.api_factura.api_factura.models.ProductoModel;
import com.api_factura.api_factura.services.DetalleFacturaServices;

@RestController
@RequestMapping("/detallesFactura")
public class DetalleFacturaController {

    @Autowired
    private DetalleFacturaServices detalleFacturaService;

    @GetMapping
    public List<DetalleFacturaModel> obtenerDetallesFactura() {
        return detalleFacturaService.obtenerDetallesFactura();
    }

    @PostMapping
    public DetalleFacturaModel guardarDetalleFactura(@RequestBody DetalleFacturaModel detalleFactura) {
        return detalleFacturaService.guardarDetalleFactura(detalleFactura);
    }

    @GetMapping("/{id}")
    public Optional<DetalleFacturaModel> obtenerDetalleFacturaPorId(@PathVariable("id") Integer id) {
        return detalleFacturaService.obtenerPorId(id);
    }

    @GetMapping("/factura/{facturaId}")
    public List<DetalleFacturaModel> obtenerDetallesPorFactura(@PathVariable("facturaId") FacturaModel factura) {
        return detalleFacturaService.obtenerPorFactura(factura);
    }

    @GetMapping("/producto/{productoId}")
    public List<DetalleFacturaModel> obtenerDetallesPorProducto(@PathVariable("productoId") ProductoModel producto) {
        return detalleFacturaService.obtenerPorProducto(producto);
    }
}
