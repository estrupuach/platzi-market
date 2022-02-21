package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteCrudRepository extends CrudRepository<Cliente, String> {

    List<Cliente> findByNombre(String nombre);

    Cliente findByNombreEquals(String nombre);

}
