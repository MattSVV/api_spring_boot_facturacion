package com.api_factura.api_factura.controllers;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_factura.api_factura.models.usuarioModel;
import com.api_factura.api_factura.services.usuarioServices;

@RestController
@RequestMapping("/usuario")
public class usuarioConroller {

    @Autowired
    usuarioServices usuarioService; 

    @GetMapping()
    public ArrayList<usuarioModel> obtenUsuarios(){
        return usuarioService.obtenerUsuarios(); 
    }
    
    @PostMapping()
    public usuarioModel guardarUsuario(@RequestBody usuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario); 
    }

    @GetMapping(path = "/{id}")
    public Optional<usuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping(path = "/{nombre}")
    public Optional<ArrayList<usuarioModel>> obtenerUsuariosPorNombre(@PathVariable("nombre") String nombre){
        return this.usuarioService.obtenerPorNombre(nombre);
    }
}
