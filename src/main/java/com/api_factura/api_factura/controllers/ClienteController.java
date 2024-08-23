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

import com.api_factura.api_factura.models.ClienteModel;
import com.api_factura.api_factura.services.ClienteServices;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteServices clienteService;

    @GetMapping
    public List<ClienteModel> obtenerClientes() {
        return clienteService.obtenerClientes();
    }

    @PostMapping
    public ClienteModel guardarCliente(@RequestBody ClienteModel cliente) {
        return clienteService.guardarCliente(cliente);
    }

    @GetMapping("/{id}")
    public Optional<ClienteModel> obtenerClientePorId(@PathVariable("id") Integer id) {
        return clienteService.obtenerPorId(id);
    }

    @GetMapping("/nombre/{nombreCliente}")
    public List<ClienteModel> obtenerClientesPorNombre(@PathVariable("nombreCliente") String nombreCliente) {
        return clienteService.obtenerPorNombre(nombreCliente);
    }

    @GetMapping("/email/{emailCliente}")
    public List<ClienteModel> obtenerClientesPorEmail(@PathVariable("emailCliente") String emailCliente) {
        return clienteService.obtenerPorEmail(emailCliente);
    }
}
