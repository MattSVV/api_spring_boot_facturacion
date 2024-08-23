package com.api_factura.api_factura.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api_factura.api_factura.repositories.usuarioRepository;
import com.api_factura.api_factura.models.*;
import java.util.*;




@Service
public class usuarioServices {

    @Autowired
    private usuarioRepository usuarioRepository; 

    public ArrayList<usuarioModel> obtenerUsuarios(){
       return (ArrayList<usuarioModel>) usuarioRepository.findAll();
    }


    public usuarioModel guardarUsuario(usuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<usuarioModel> obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }

    public ArrayList<usuarioModel> obtenerPorPrioridad(Integer integer){
        return usuarioRepository.findByPrioridad(integer); 
    }

    public Optional<ArrayList<usuarioModel>> obtenerPorNombre(String nombre){
        return usuarioRepository.findByNombre(nombre);
    }

    public boolean eliminarUsuario(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
