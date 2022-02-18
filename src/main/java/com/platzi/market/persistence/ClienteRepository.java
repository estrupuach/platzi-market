package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ClienteCrudRepository;
import com.platzi.market.persistence.entity.Cliente;

import java.util.List;

public class ClienteRepository {
    ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> findByNombre(String nombre){
        return clienteCrudRepository.findByNombreOrderAsc(nombre);
    }
    public Cliente findByNombreIs(String nombre){
        return clienteCrudRepository.findByNombreEquals(nombre);
    }
}
