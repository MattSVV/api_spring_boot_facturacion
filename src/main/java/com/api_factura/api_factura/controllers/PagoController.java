package com.api_factura.api_factura.controllers;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_factura.api_factura.models.PagoModel;
import com.api_factura.api_factura.models.FacturaModel;
import com.api_factura.api_factura.services.PagoServices;

@RestController
@RequestMapping("/pagos")
public class PagoController {

    @Autowired
    private PagoServices pagoService;

    @GetMapping
    public List<PagoModel> obtenerPagos() {
        return pagoService.obtenerPagos();
    }

    @PostMapping
    public PagoModel guardarPago(@RequestBody PagoModel pago) {
        return pagoService.guardarPago(pago);
    }

    @GetMapping("/{id}")
    public Optional<PagoModel> obtenerPagoPorId(@PathVariable("id") Integer id) {
        return pagoService.obtenerPorId(id);
    }

    @GetMapping("/factura/{facturaId}")
    public List<PagoModel> obtenerPagosPorFactura(@PathVariable("facturaId") FacturaModel factura) {
        return pagoService.obtenerPorFactura(factura);
    }

    @GetMapping("/fecha/{fechaPago}")
    public List<PagoModel> obtenerPagosPorFecha(@PathVariable("fechaPago") Date fechaPago) {
        return pagoService.obtenerPorFecha(fechaPago);
    }

    @GetMapping("/metodo/{metodoPago}")
    public List<PagoModel> obtenerPagosPorMetodo(@PathVariable("metodoPago") PagoModel.MetodoPago metodoPago) {
        return pagoService.obtenerPorMetodoPago(metodoPago);
    }
}
