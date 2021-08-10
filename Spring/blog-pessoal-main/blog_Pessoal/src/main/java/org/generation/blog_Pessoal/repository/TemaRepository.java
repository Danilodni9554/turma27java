package org.generation.blog_Pessoal.repository;

import java.util.List;
import java.util.Optional;

import org.generation.blog_Pessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
    
    public List <Tema> findAllByDescricaoContainingIgnoreCase (String descricao);

    public Optional <Tema> findByDescricaoContainingIgnoreCase (String descricao);
    
    public Tema findByDescricao(String descricao);

}