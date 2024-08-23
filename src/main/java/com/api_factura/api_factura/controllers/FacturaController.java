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

import com.api_factura.api_factura.models.FacturaModel;
import com.api_factura.api_factura.models.ClienteModel;
import com.api_factura.api_factura.services.FacturaServices;



@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private FacturaServices facturaService;

    @GetMapping
    public List<FacturaModel> obtenerFacturas() {
        return facturaService.obtenerFacturas();
    }

    @PostMapping
    public FacturaModel guardarFactura(@RequestBody FacturaModel factura) {
        return facturaService.guardarFactura(factura);
    }

    @GetMapping("/{id}")
    public Optional<FacturaModel> obtenerFacturaPorId(@PathVariable("id") Integer id) {
        return facturaService.obtenerPorId(id);
    }

    @GetMapping("/fecha/{fechaFactura}")
    public List<FacturaModel> obtenerFacturasPorFecha(@PathVariable("fechaFactura") Date fechaFactura) {
        return facturaService.obtenerPorFecha(fechaFactura);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<FacturaModel> obtenerFacturasPorCliente(@PathVariable("clienteId") ClienteModel cliente) {
        return facturaService.obtenerPorCliente(cliente);
    }
}
