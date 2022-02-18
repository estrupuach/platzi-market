package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.CompraCrudRepository;
import com.platzi.market.persistence.entity.Compra;

import java.time.LocalDateTime;
import java.util.List;

public class CompraRepository {
    private CompraCrudRepository compraCrudRepository;

    public List<Compra> getByFecha(LocalDateTime fecha){
        return compraCrudRepository.findByFecha(fecha);
    }
    public List<Compra> getByIdClienteAndFecha(Integer idCliente, LocalDateTime fecha){
        return compraCrudRepository.findByIdClienteAndFecha(idCliente, fecha);
    }


}
