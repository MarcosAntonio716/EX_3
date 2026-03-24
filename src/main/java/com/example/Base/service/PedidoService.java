package com.example.Base.service;

import com.example.Base.entity.Pedido;
import com.example.Base.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    // Criar pedido
    public Pedido salvar(Pedido pedido) {
        return repository.save(pedido);
    }

    // Listar todos
    public List<Pedido> listarTodos() {
        return repository.findAll();
    }

    // Buscar por ID
    public Optional<Pedido> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Deletar por ID
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}