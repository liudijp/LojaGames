package com.generation.lojagames.repository;

import com.generation.lojagames.model.Categoria;
import com.generation.lojagames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    public Optional<Categoria> findByNome(String nome);

    public List<Categoria> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
