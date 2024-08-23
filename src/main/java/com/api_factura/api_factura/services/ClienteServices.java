package com.api_factura.api_factura.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api_factura.api_factura.repositories.ClienteRepository;
import com.api_factura.api_factura.models.ClienteModel;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServices {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> obtenerClientes() {
        return (List<ClienteModel>) clienteRepository.findAll();
    }

    public ClienteModel guardarCliente(ClienteModel cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<ClienteModel> obtenerPorId(Integer id) {
        return clienteRepository.findById(id);
    }

    public List<ClienteModel> obtenerPorNombre(String nombreCliente) {
        return clienteRepository.findByNombreCliente(nombreCliente);
    }

    public List<ClienteModel> obtenerPorEmail(String emailCliente) {
        return clienteRepository.findByEmailCliente(emailCliente);
    }

    public boolean eliminarCliente(Integer id) {
        try {
            clienteRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
