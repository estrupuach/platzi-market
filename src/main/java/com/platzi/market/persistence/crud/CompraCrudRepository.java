package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer>{

    List<Compra> findByFecha(LocalDateTime fecha);

    List<Compra> findByIdClienteAndFecha(int idCliente, LocalDateTime fecha);



}
