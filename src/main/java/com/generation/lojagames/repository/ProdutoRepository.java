package com.generation.lojagames.repository;

import com.generation.lojagames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public Optional<Produto> findByNome(String nome);

    public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
