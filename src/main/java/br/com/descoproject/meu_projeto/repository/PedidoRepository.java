package br.com.descoproject.meu_projeto.repository;

import br.com.descoproject.meu_projeto.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
